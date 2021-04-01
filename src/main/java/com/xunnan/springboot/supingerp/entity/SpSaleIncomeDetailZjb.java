package com.xunnan.springboot.supingerp.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 综合办销售收入&成本报表(明细表)
 * </p>
 *
 * @author lining
 * @since 2020-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SpSaleIncomeDetailZjb extends Model<SpSaleIncomeDetailZjb> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 单据日期年月日
     */
    private String billDate;

    /**
     * 区域代码
     */
    private String areaCode;

    /**
     * 区域名称
     */
    private String areaName;

    /**
     * 店铺代码
     */
    private String shopCode;

    /**
     * 店铺名称
     */
    private String shopName;

    /**
     * 货品类型代码(FJSX14)
     */
    private String goodsTypeCode;

    /**
     * 货品类型名称(FJSX14)
     */
    private String goodsTypeName;

    /**
     * 货品年份(商品属性表 BYZD8)
     */
    private String goodsYear;

    /**
     * 货品季节代码(商品属性表 BYZD5)
     */
    private String goodsSeasonCode;

    /**
     * 货品季节
     */
    private String goodsSeasonName;

    /**
     * 货品波段代码(商品表FJSX4)
     */
    private String goodsBandCode;

    /**
     * 货品波段
     */
    private String goodsBandName;

    /**
     * 货品折扣段代码(FJSX5)
     */
    private String discountSegmentCode;

    /**
     * 货品折扣段
     */
    private String discountSegmentName;

    /**
     * 货品品牌代码(商品表BYZD3)
     */
    private String brandCode;

    /**
     * 货品品牌
     */
    private String brandName;

    /**
     * 发货数量
     */
    private Integer goodsNum;

    /**
     * 吊牌金额
     */
    private BigDecimal tagAmount;

    /**
     * 销售数量
     */
    private Integer saleNum;

    /**
     * 店铺销售金额
     */
    private BigDecimal saleAmount;

    /**
     * 收入结算折扣比例
     */
    private BigDecimal discountRatio;

    /**
     * 销售收入
     */
    private BigDecimal saleIncome;

    /**
     * 销售成本
     */
    private BigDecimal saleCost;

    /**
     * 销售毛利
     */
    private BigDecimal saleGrossProfit;

    /**
     * 0-直营店 1-加盟  2-联营
     */
    private Integer shopType;

    /**
     * 记录创建时间
     */
    private LocalDateTime createTime;

    /**
     * 年月
     */
    @TableField("billDate_yearMonth")
    private String billdateYearmonth;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
