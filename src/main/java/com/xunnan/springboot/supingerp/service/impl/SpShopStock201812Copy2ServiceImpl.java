package com.xunnan.springboot.supingerp.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xunnan.springboot.supingerp.entity.SpShopStock201812Copy2;
import com.xunnan.springboot.supingerp.mapper.SpShopStock201812Copy2Mapper;
import com.xunnan.springboot.supingerp.service.SpShopStock201812Copy2Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 店铺_库存数据(还是店的维度) 服务实现类
 * </p>
 *
 * @author lining
 * @since 2020-11-19
 */
@Service
public class SpShopStock201812Copy2ServiceImpl extends ServiceImpl<SpShopStock201812Copy2Mapper, SpShopStock201812Copy2> implements SpShopStock201812Copy2Service {

    @Override
    public List<SpShopStock201812Copy2> pageFindData(Page page) {
        return baseMapper.pageFindData(page);
    }
}
