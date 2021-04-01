package com.xunnan.springboot.supingerp.mapper;

import com.xunnan.springboot.supingerp.entity.ErpA;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xunnan.springboot.supingerp.entity.SpShopStock201812;
import com.xunnan.springboot.supingerp.entity.SpShopStock201812Copy2;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lining
 * @since 2020-11-18
 */
public interface ErpAMapper extends BaseMapper<ErpA> {

    // List<SpShopStock201812> getTestData();

    List<SpShopStock201812Copy2> getTestData(@Param("index") Integer index, @Param("size") Integer size);

    List<SpShopStock201812> getTestDataAll();
}
