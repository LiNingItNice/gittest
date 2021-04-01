package com.xunnan.springboot.supingerp.controller;


import com.baomidou.mybatisplus.extension.api.R;
import com.xunnan.springboot.supingerp.entity.ErpA;
import com.xunnan.springboot.supingerp.entity.ErpCktzd;
import org.springframework.beans.BeanUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lining
 * @since 2020-11-18
 */
@RestController
@RequestMapping("/supingerp/erp-a")
public class ErpAController {

    @RequestMapping(value = "/test")
    @ResponseBody
    public R test() {
        ErpCktzd dsfds = ErpCktzd.builder().byzd1("234").byzd2("dsfds").build();


        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> forEntity = restTemplate.getForEntity("", String.class);
        // BeanUtils.copyProperties();


        ErpCktzd dsfsdf = ErpCktzd.builder().byzd3("234").byzd4("dsfsdf").build();

        return R.ok(dsfsdf);
    }
}

