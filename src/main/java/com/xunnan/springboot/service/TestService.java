package com.xunnan.springboot.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author lining
 * @date 2020/11/18 - 11:53
 */
@Service
@Slf4j
public class TestService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    class InitDataThread implements Runnable{

        @Override
        public void run() {


        }
    }

    /*public static void main(String[] args) {

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

    }*/
}
