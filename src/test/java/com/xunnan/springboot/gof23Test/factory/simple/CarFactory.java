package com.xunnan.springboot.gof23Test.factory.simple;

/**
 * @author lining
 * @date 2020/12/3 - 17:38
 */
public class CarFactory {

    public static Car getCat(String name) {
        if ("CQ".equals(name)) {
            return new CQ();
        } else if ("KLL".equals(name)) {
            return new KLL();
        }else {
            return null;
        }
    }

    public static Car getCQ(){
        return new CQ();
    }

    public static Car getKLL(){
        return new KLL();
    }
}
