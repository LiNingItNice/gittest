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
 * 综合办销售收入&成本报表(汇总表)
 * </p>
 *
 * @author lining
 * @since 2020-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SpSaleIncomeSummary extends Model<SpSaleIncomeSummary> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 销售归属年月
     */
    @TableField("billDate_yearMonth")
    private String billdateYearmonth;

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
     * 货品品牌代码(商品表BYZD3)
     */
    private String brandCode;

    /**
     * 货品品牌
     */
    private String brandName;

    /**
     * 货品数量
     */
    private Integer goodsNum;

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
     * 创建时间
     */
    private LocalDateTime createTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
