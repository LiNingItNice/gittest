package com.xunnan.springboot.test.thredQueryTest;

import org.apache.tomcat.jni.Global;
import org.junit.jupiter.api.Test;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author lining
 * @date 2020/11/27 - 11:19
 */
@Component
public class QueryTest {
    /*//迁移单位名称
    private static String migrateUnitName = Global.migrateUnitName;
    //迁移接口域名
    private static String migrateDomainName = Global.migrateDomainName;

    private static String fileName = Global.path;

    @Test
    public void getData() throws Exception {
        getMaxResult("0");
    }

    public static List<String> getMaxResult(String value) throws Exception {
        long start = System.currentTimeMillis();
        List<String> result = new ArrayList<>();//返回结果
        //1.根据名称查询迁移单位信息
        Map<String, Object> unitInfo = DataDeal.getMigrateUnitInfo(migrateUnitName);
        int count = SearchPostBasic.searchPostBasicCount(unitInfo, 0);

        int num = 100;//每次查询的条数
        //需要查询的次数
        int times = count / num;
        if (count % num != 0) {
            times = times + 1;
        }
        //开始查询的行数
        int bindex = 0;

        List<Callable<String>> tasks = new ArrayList<Callable<String>>();//添加任务
        for (int i = 0; i < times; i++) {
            Callable<String> qfe = new ThredQuery(value, bindex, num, unitInfo);
            tasks.add(qfe);
            bindex = bindex + num;
        }
        //定义固定长度的线程池  防止线程过多
        ExecutorService execservice = Executors.newFixedThreadPool(15);

        List<Future<String>> futures = execservice.invokeAll(tasks);
        // 处理线程返回结果
        if (futures != null && futures.size() > 0) {
            for (Future<String> future : futures) {
                result.add(future.get());
                System.out.print(future.get());
            }
        }
        execservice.shutdown();  // 关闭线程池

        long end = System.currentTimeMillis();
        System.out.println("用时" + (start - end));

        return result;
    }*/
}
