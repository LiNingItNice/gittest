package com.xunnan.springboot.test;

import cn.hutool.core.collection.CollectionUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xunnan.springboot.supingerp.entity.ErpA;
import com.xunnan.springboot.supingerp.entity.SpShopStock201812Copy2;
import com.xunnan.springboot.supingerp.entity.SpVwCkjxcmx;
import com.xunnan.springboot.supingerp.service.ErpAService;
import com.xunnan.springboot.supingerp.service.SpShopStock201812Copy2Service;
import com.xunnan.springboot.supingerp.service.SpVwCkjxcmxService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author lining
 * @date 2020/11/18 - 18:27
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Test {

    @Autowired
    private ErpAService erpAService;
    @Autowired
    private SpShopStock201812Copy2Service spShopStock201812Copy2Service;

    @org.junit.Test
    public void test2() {

        List<ErpA> erpAS =
                erpAService.getBaseMapper().selectList(new QueryWrapper<>());

        System.out.println(erpAS.toString());
    }


    @org.junit.Test
    public void test3a() {
        // 创建线程池
        // ExecutorService workPool = Executors.newWorkStealingPool(10);
        ExecutorService pool = Executors.newCachedThreadPool();

        for (int i = 0; i <= 10; i++) {
            final int index = i;

            // 提交执行线程
            pool.execute(new Runnable() {
                @Override
                public void run() {
                    try {

                        String threadName = Thread.currentThread().getName();
                        System.out.println("执行：" + index + "，线程名称：" + threadName);
                        // Thread.sleep(2000);

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }

        // 关闭线程池
        pool.shutdown();
    }


    @org.junit.Test
    public void test4() throws Exception {
        // 开始时间
        long start = System.currentTimeMillis();
        // 模拟数据List
        // List<String> list = new ArrayList<String>();
        // for (int i = 1; i <= 300000; i++) {
        //     list.add(i + "");
        // }

        Integer index = 0;
        Integer size = 200000;

        int count = spShopStock201812Copy2Service.count();

        System.out.println("当前表数据总量：" + count);
        int totalPage = count / size;
        if (count % size != 0) {
            totalPage++;
        }
        System.out.println("总页数："+totalPage);
        // Page page = new Page();
        for (int j = 1; j <= totalPage; j++) {
            // page.setCurrent((j - 1) * size);
            // page.setSize(size);
            // List<SpShopStock201812Copy2> list = spShopStock201812Copy2Service.pageFindData(page);
            List<SpShopStock201812Copy2> list = erpAService.getTestData((j - 1) * size, size);

            // IPage<SpShopStock201812Copy2> page1 = spShopStock201812Copy2Service.page(page);

            // List<SpShopStock201812> list = erpAService.getTestData(index,size);
            // List<SpShopStock201812> list = erpAService.getTestDataAll();
            // List<SpShopStock201812Copy2> list = spShopStock201812Copy2Service.getBaseMapper().selectList(new QueryWrapper<>());
            // 每500条数据开启一条线程
            int threadSize = 20000;
            // 总数据条数
            int dataSize = list.size();
            // 线程数
            int threadNum = dataSize / threadSize + 1;
            // 定义标记,过滤threadNum为整数
            boolean special = dataSize % threadSize == 0;
            // 创建一个线程池
            ExecutorService exec = Executors.newFixedThreadPool(threadNum);
            // 定义一个任务集合
            List<Callable<Integer>> tasks = new ArrayList<Callable<Integer>>();
            Callable<Integer> task = null;
            List<SpShopStock201812Copy2> cutList = null;
            // 确定每条线程的数据
            for (int i = 0; i < threadNum; i++) {
                if (i == threadNum - 1) {
                    if (special) {
                        break;
                    }
                    cutList = list.subList(threadSize * i, dataSize);
                } else {
                    cutList = list.subList(threadSize * i, threadSize * (i + 1));
                }
                // System.out.println("第" + (i + 1) + "组：" + cutList.toString());
                final List<SpShopStock201812Copy2> listStr = cutList;
                task = new Callable<Integer>() {
                    @Override
                    public Integer call() throws Exception {

                        //处理数据逻辑
                        System.out.println(Thread.currentThread().getName() + "线程：" + listStr.size());

                        for (SpShopStock201812Copy2 ss : listStr) {

                            ss.setBrokenCodeFlag(1);
                            ss.setLifeCycleFlag(1);
                            ss.setNormalFlag(1);
                            ss.setInvalidFlag(1);

                        }

                        boolean b = spShopStock201812Copy2Service.updateBatchById(listStr,listStr.size());

                        return 1;
                    }
                };
                // 这里提交的任务容器列表和返回的Future列表存在顺序对应的关系
                tasks.add(task);
            }
            List<Future<Integer>> results = exec.invokeAll(tasks);
            for (Future<Integer> future : results) {
                System.out.println(future.get());
            }
            // 关闭线程池
            exec.shutdown();
            System.out.println("线程任务执行结束");
            System.err.println("执行任务消耗了 ：" + (System.currentTimeMillis() - start) + "毫秒");
        }
    }


    private final int THREAD_COUNT = 8;
    private final CountDownLatch latch = new CountDownLatch(THREAD_COUNT);
    /**格式化时间*/
    private static final DateTimeFormatter DATE_FOMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss", Locale.CHINA);
    private static final DateTimeFormatter DATE_FOMATa = DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.CHINA);
    private volatile int count=0;
    private AtomicLong threadNum = new AtomicLong(0);

    @Autowired
    private SpVwCkjxcmxService spVwCkjxcmxService;

   /* @org.junit.Test
    public void aa(){
        LocalDate parse = LocalDate.parse("2018-12-17", DATE_FOMATa);
        System.out.println(parse);

        LocalDateTime shopDate = LocalDateTime.parse("2018-12-17", DATE_FOMATa);
        System.out.println(shopDate);

        long l = Instant.from(parse.atStartOfDay(ZoneId.systemDefault())).toEpochMilli();
        System.out.println(l);
    }*/

    @org.junit.Test
    public void test5(){

        // 开始时间
        long start = System.currentTimeMillis();
        int startLimit = 0;
        int limitLength = 3000;
        boolean next = true;
        ExecutorService es = Executors.newFixedThreadPool(THREAD_COUNT);
        try {
            System.out.println("开始执行任务");

            while (next) {
                try {
                    //每次获取1000条数据
                    // List<Record> list = OrganizationJobService.me.queryOrgTable(startLimit, limitLength);
                    List<SpShopStock201812Copy2> list = erpAService.getTestData(startLimit, limitLength);
                    //每list.size()跑一次事务
                    // OrganizationJobService.me.updateOrgFamilyField(list, es);

                    //等待线程任务完成，设置30，可令运行线程数为15，等待队列线程数为15
                   /* while (threadNum.get() >= 10){
                        Thread.sleep(2000);
                    }*/

                    try {
                        // Thread.sleep((long) 0.5);//先释放资源，避免cpu占用过高
                        Thread.sleep(600);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    for (SpShopStock201812Copy2 ss : list) {

                        //开启1个线程+1
                        // threadNum.incrementAndGet();
                        es.execute(new Runnable() {

                            // int count = 0;
                            @Override
                            public void run () {

                                List<SpVwCkjxcmx> svcs = spVwCkjxcmxService.getBaseMapper().selectList(
                                        new QueryWrapper<SpVwCkjxcmx>()
                                                .eq("CKDM", ss.getShopCode())
                                                .eq("SPDM", ss.getGoodsCode())
                                                .eq("GG1DM", ss.getGoodsColor())
                                                .eq("GG2DM", ss.getGoodsSize())
                                                .eq("RQ", ss.getShopDate())
                                );

                                int num = 0;
                                if (CollectionUtil.isNotEmpty(svcs)) {
                                    BigDecimal zero = BigDecimal.ZERO;
                                    // 累加在途库存
                                    for (SpVwCkjxcmx sv : svcs) {
                                        LocalDate shopDate = LocalDate.parse(ss.getShopDate(), DATE_FOMATa);
                                        long shopDateTime = Instant.from(shopDate.atStartOfDay(ZoneId.systemDefault())).toEpochMilli();
                                        long shrqTime = Instant.from(sv.getShrq().atZone(ZoneId.systemDefault())).toEpochMilli();
                                        long ysrqTime = Instant.from(sv.getYsrq().atZone(ZoneId.systemDefault())).toEpochMilli();

                                        if (
                                                (
                                                    (sv.getSh().equals("1") && shrqTime > shopDateTime && sv.getYs().equals("1") && ysrqTime <= shopDateTime)
                                                    ||
                                                    (sv.getSh().equals("0") && sv.getYs().equals("1") && ysrqTime <= shopDateTime)
                                                )
                                                &&
                                                (
                                                    sv.getDjlx().equals("2R")
                                                    || sv.getDjlx().equals("3R")
                                                    || sv.getDjlx().equals("4R")
                                                    || sv.getDjlx().equals("5R")
                                                    || sv.getDjlx().equals("A1R")
                                                    || sv.getDjlx().equals("A2R")
                                                )
                                        ) {
                                            num += sv.getSl().intValue();
                                        }
                                    }
                                }

                                System.out.println("统计在途数量为："+num);
                                ss.setUnderwayNum(num);

                                ss.updateById();
                                // 任务完成 -1
                                // threadNum.decrementAndGet();
                            }
                        });
                        count++;
                        System.out.println("更新了" + count + "条数据");
                    }

                    startLimit += limitLength;
                    if (list.size() < limitLength) {
                        next = false;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    next = false;
                    System.out.println("程序执行出错！！！！！！！！！！！！！！！！！！");
                }
            }
            System.out.println("任务执行完成");
            latch.await();
            es.shutdown();
            System.out.println("线程任务执行结束");
            System.err.println("执行任务消耗了 ：" + (System.currentTimeMillis() - start) + "毫秒");
        } catch (Exception e) {
            System.out.println("执行更新任务出错");
        }
    }
}
