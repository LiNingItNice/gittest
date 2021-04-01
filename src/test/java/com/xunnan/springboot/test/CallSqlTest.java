package com.xunnan.springboot.test;

import com.xunnan.springboot.supingerp.service.ErpCangkuService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Test;

/**
 * @author lining
 * @date 2020/11/18 - 17:38
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CallSqlTest {

    @Autowired
    private ErpCangkuService erpCangkuService;

    @Test
    public void test1(){
        erpCangkuService.callSqlTest();
    }
}
