package com.xunnan.springboot.gof23Test.factory.simple;

import org.springframework.validation.annotation.Validated;

/**
 * @author lining
 * @date 2020/12/3 - 17:34
 */
public class CQ implements Car {

    @Override
    public void name() {
        System.out.println("广汽传祺");
    }
}
