package com.xunnan.springboot.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author lining
 * @date 2020/11/13 - 12:06
 */
public class MultiThreadTest {
    public static void main(String[] args) throws Exception {
        List<Integer> idList = new ArrayList<>();
        for (int i = 0; i < 8000000; i++) {
            idList.add(i);
        }

        //获取CPU线程数 根据机器配置灵活配置线程数
        int threadNum = Runtime.getRuntime().availableProcessors();
        System.out.println("获取到的线程数量："+threadNum);
        // int threadNum = 10;
        ExecutorService executorService = Executors.newFixedThreadPool(threadNum);
        CountDownLatch countDownLatch = new CountDownLatch(threadNum);
        int perSize = idList.size() / threadNum;
        for (int i = 0; i < threadNum; i++) {
            MultiThread thread = new MultiThread();
            thread.setIdList(idList.subList(i * perSize, (i + 1) * perSize));
            thread.setCountDownLatch(countDownLatch);
            executorService.submit(thread);
        }
        countDownLatch.await();
        executorService.shutdown();
    }
}

class MultiThread extends Thread {
    private List<Integer> idList;

    private CountDownLatch countDownLatch;

    public void setIdList(List<Integer> idList) {
        this.idList = idList;
    }

    public void setCountDownLatch(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println(this.idList.size());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }
    }

}
