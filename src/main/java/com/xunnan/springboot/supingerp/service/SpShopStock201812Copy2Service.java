package com.xunnan.springboot.supingerp.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xunnan.springboot.supingerp.entity.SpShopStock201812Copy2;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 店铺_库存数据(还是店的维度) 服务类
 * </p>
 *
 * @author lining
 * @since 2020-11-19
 */
public interface SpShopStock201812Copy2Service extends IService<SpShopStock201812Copy2> {

    List<SpShopStock201812Copy2> pageFindData(Page page);
}
