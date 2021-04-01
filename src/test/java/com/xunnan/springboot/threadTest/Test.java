package com.xunnan.springboot.threadTest;

/**
 * @author lining
 * @date 2020/12/12 - 21:43
 */
public class Test {

    public static void main(String[] args) {
        TestThread02 testThread02 = new TestThread02();


        new Thread(testThread02).start();
        new Thread(testThread02).start();
        new Thread(testThread02).start();
        new Thread(testThread02).start();


        TestThread01 testThread01 = new TestThread01();
        TestThread01 testThread011 = new TestThread01();
        TestThread01 testThread012 = new TestThread01();
        TestThread01 testThread013 = new TestThread01();

        testThread01.start();
        testThread011.start();
        testThread012.start();
        testThread013.start();


        TestThread03 testThread03 = new TestThread03();



    }
}
