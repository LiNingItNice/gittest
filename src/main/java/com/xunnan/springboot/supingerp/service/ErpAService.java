package com.xunnan.springboot.supingerp.service;

import com.xunnan.springboot.supingerp.entity.ErpA;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xunnan.springboot.supingerp.entity.SpShopStock201812;
import com.xunnan.springboot.supingerp.entity.SpShopStock201812Copy2;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lining
 * @since 2020-11-18
 */
public interface ErpAService extends IService<ErpA> {


    List<SpShopStock201812Copy2> getTestData(Integer index, Integer size);

    List<SpShopStock201812> getTestDataAll();
}
