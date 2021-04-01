package com.xunnan.springboot.threadTest;

import com.sun.el.parser.BooleanNode;

import java.util.concurrent.Callable;

/**
 * @author lining
 * @date 2020/12/12 - 21:33
 */
public class TestThread01 extends Thread {

    @Override
    public void run() {
        System.out.println("继承thread类");
    }

}


class TestThread02 implements Runnable {

    @Override
    public void run() {
        System.out.println("实现runnable接口");
    }
}


class TestThread03 implements Callable<Boolean> {

    @Override
    public Boolean call() throws Exception {
        System.out.println("实现callable接口");

        return true;
    }
}

