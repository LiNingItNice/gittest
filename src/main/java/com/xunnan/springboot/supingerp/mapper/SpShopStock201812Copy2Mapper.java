package com.xunnan.springboot.supingerp.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xunnan.springboot.supingerp.entity.SpShopStock201812Copy2;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 店铺_库存数据(还是店的维度) Mapper 接口
 * </p>
 *
 * @author lining
 * @since 2020-11-19
 */
public interface SpShopStock201812Copy2Mapper extends BaseMapper<SpShopStock201812Copy2> {

    List<SpShopStock201812Copy2> pageFindData(@Param("page") Page page);
}
