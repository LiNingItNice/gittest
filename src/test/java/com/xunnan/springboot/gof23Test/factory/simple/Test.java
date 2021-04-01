package com.xunnan.springboot.gof23Test.factory.simple;

/**
 *
 * 简单工程模式测试
 * @author lining
 * @date 2020/12/3 - 17:32
 */
public class Test {

    public static void main(String[] args) {
        Car c1 = CarFactory.getCat("CQ");
        Car c2 = CarFactory.getCat("KLL");
        c1.name();
        c2.name();

        Car c3 = CarFactory.getCQ();
        Car c4 = CarFactory.getKLL();
        c3.name();
        c4.name();

    }
}
