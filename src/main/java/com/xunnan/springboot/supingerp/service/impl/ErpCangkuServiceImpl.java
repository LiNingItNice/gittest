package com.xunnan.springboot.supingerp.service.impl;

import com.xunnan.springboot.supingerp.entity.ErpCangku;
import com.xunnan.springboot.supingerp.mapper.ErpCangkuMapper;
import com.xunnan.springboot.supingerp.service.ErpCangkuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lining
 * @since 2020-11-18
 */
@Service
public class ErpCangkuServiceImpl extends ServiceImpl<ErpCangkuMapper, ErpCangku> implements ErpCangkuService {

    @Override
    public void callSqlTest() {
        baseMapper.callSqlTest();
    }
}
