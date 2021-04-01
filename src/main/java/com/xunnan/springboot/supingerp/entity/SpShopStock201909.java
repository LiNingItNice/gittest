package com.xunnan.springboot.supingerp.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
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
public class SpShopStock201909 extends Model<SpShopStock201909> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 店铺代码
     */
    private String shopCode;

    /**
     * 商品代码
     */
    private String goodsCode;

    /**
     * 商品规格1(颜色)
     */
    private String goodsColor;

    /**
     * 商品规格2(尺寸)
     */
    private String goodsSize;

    private String shopDate;

    /**
     * 日期(时间戳形式)
     */
    @TableField("shop_date_timeStamp")
    private Integer shopDateTimestamp;

    /**
     * 日期-年
     */
    private String dateYear;

    /**
     * 日期-月
     */
    private String dateMonth;

    /**
     * 日期-天
     */
    private String dateDay;

    /**
     * 日期-周几
     */
    private Integer dateWeek;

    /**
     * 当天总库存数
     */
    private Integer stockNum;

    /**
     * 当天总库存金额
     */
    private BigDecimal stockAmount;

    /**
     * 断码库存金额
     */
    private BigDecimal brokenCodeAmount;

    /**
     * 断码库存数量
     */
    private Integer brokenCodeNum;

    /**
     * 生命周期内库存金额
     */
    @TableField("lifeTime_amount")
    private BigDecimal lifetimeAmount;

    /**
     * 生命周期内库存数量
     */
    @TableField("lifeTime_num")
    private Integer lifetimeNum;

    /**
     * 生命周期内非断码金额
     */
    @TableField("lifeTime_notBrokenCode_amount")
    private BigDecimal lifetimeNotbrokencodeAmount;

    /**
     * 生命周期内非断码数量
     */
    @TableField("lifeTime_notBrokenCode_num")
    private Integer lifetimeNotbrokencodeNum;

    /**
     * 特价库存金额
     */
    private BigDecimal bargainAmount;

    /**
     * 特价库存数量
     */
    private Integer bargainNum;

    /**
     * 正价库存金额
     */
    private BigDecimal normalAmount;

    /**
     * 正价库存数量
     */
    private Integer normalNum;

    /**
     * 在途库存金额
     */
    @TableField("underWay_amount")
    private BigDecimal underwayAmount;

    /**
     * 在途库存数量
     */
    @TableField("underWay_num")
    private Integer underwayNum;

    /**
     * 非断码库存金额
     */
    @TableField("notBroken_code_amount")
    private BigDecimal notbrokenCodeAmount;

    /**
     * 非断码库存数量
     */
    @TableField("notBroken_code_num")
    private Integer notbrokenCodeNum;

    /**
     * 无效库存金额
     */
    private BigDecimal invalidAmount;

    /**
     * 无效库存数量
     */
    private Integer invalidNum;

    /**
     * 生命周期外库存金额
     */
    @TableField("outLife_amount")
    private BigDecimal outlifeAmount;

    /**
     * 生命周期外库存数量
     */
    @TableField("outLife_num")
    private Integer outlifeNum;

    /**
     * 断码标记(0-断码 1-非断码)
     */
    private Integer brokenCodeFlag;

    /**
     * 生命周期标记(0-生命周期外/过期 1-生命周期内)
     */
    private Integer lifeCycleFlag;

    /**
     * 正价标价(0-特价 1-正价)
     */
    private Integer normalFlag;

    /**
     * 有效标记(1-生命周期内非断码/有效，0-无效/剩余的三种情况)
     */
    private Integer invalidFlag;

    /**
     * 在库数量
     */
    @TableField("inWareHouse_num")
    private Integer inwarehouseNum;

    /**
     * 在库金额
     */
    @TableField("inWareHouse_amount")
    private BigDecimal inwarehouseAmount;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
