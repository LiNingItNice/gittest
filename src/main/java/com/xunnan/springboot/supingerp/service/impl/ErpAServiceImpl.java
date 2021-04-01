package com.xunnan.springboot.supingerp.service.impl;

import com.xunnan.springboot.supingerp.entity.ErpA;
import com.xunnan.springboot.supingerp.entity.SpShopStock201812;
import com.xunnan.springboot.supingerp.entity.SpShopStock201812Copy2;
import com.xunnan.springboot.supingerp.mapper.ErpAMapper;
import com.xunnan.springboot.supingerp.service.ErpAService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lining
 * @since 2020-11-18
 */
@Service
public class ErpAServiceImpl extends ServiceImpl<ErpAMapper, ErpA> implements ErpAService {

    @Override
    public List<SpShopStock201812Copy2> getTestData(Integer index, Integer size) {
        return baseMapper.getTestData(index,size);
    }

    @Override
    public List<SpShopStock201812> getTestDataAll() {
        return baseMapper.getTestDataAll();
    }
}
