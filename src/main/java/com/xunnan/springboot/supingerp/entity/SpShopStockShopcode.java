package com.xunnan.springboot.supingerp.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 店铺_库存数据(还是店的维度)
 * </p>
 *
 * @author lining
 * @since 2020-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SpShopStockShopcode extends Model<SpShopStockShopcode> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 店铺代码
     */
    private String shopCode;

    /**
     * 店铺ID
     */
    private Integer shopId;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
