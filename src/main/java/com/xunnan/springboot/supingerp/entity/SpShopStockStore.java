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
public class SpShopStockStore extends Model<SpShopStockStore> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 店铺代码
     */
    private String shopCode;

    /**
     * 日期
     */
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
     * 在库总数量
     */
    @TableField("onWareHouse_num")
    private Integer onwarehouseNum;

    /**
     * 在库总金额
     */
    @TableField("onWareHouse_amount")
    private BigDecimal onwarehouseAmount;

    /**
     * 在途库存数量
     */
    @TableField("underWay_num")
    private Integer underwayNum;

    /**
     * 在途库存金额
     */
    @TableField("underWay_amount")
    private BigDecimal underwayAmount;

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
     * 有效库存金额
     */
    private BigDecimal effectiveAmount;

    /**
     * 有效库存数量
     */
    private Integer effectiveNum;

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
     * 销售数量(售罄率表字段 开始)
     */
    private Integer saleNum;

    /**
     * 销售金额
     */
    private BigDecimal saleAmount;

    /**
     * 生命周期内销售金额
     */
    @TableField("inLife_sale_amount")
    private BigDecimal inlifeSaleAmount;

    /**
     * 生命周期内销售数量
     */
    @TableField("inLife_sale_num")
    private Integer inlifeSaleNum;

    /**
     * 累计收货金额
     */
    private BigDecimal confirmAmount;

    /**
     * 累计收货数量
     */
    private Integer confirmNum;

    /**
     * 生命周期内累计收货金额
     */
    @TableField("inLife_confirm_amount")
    private BigDecimal inlifeConfirmAmount;

    /**
     * 生命周期内累计收货数量
     */
    @TableField("inLife_confirm_num")
    private Integer inlifeConfirmNum;

    /**
     * 销售金额(过去一年)
     */
    @TableField("lastYear_saleAmount")
    private BigDecimal lastyearSaleamount;

    /**
     * 销售数量(过去一年)
     */
    @TableField("lastYear_saleNum")
    private Integer lastyearSalenum;

    /**
     * 配货金额（过去一年）
     */
    @TableField("lastYear_distributionAmount")
    private BigDecimal lastyearDistributionamount;

    /**
     * 配货数量（过去一年）
     */
    @TableField("lastYear_distributionNum")
    private Integer lastyearDistributionnum;

    /**
     * 采购金额（过去一年）
     */
    @TableField("lastYear_purchaseAmount")
    private BigDecimal lastyearPurchaseamount;

    /**
     * 采购数量（过去一年）售罄率表字段 截止)
     */
    @TableField("lastYear_purchaseNum")
    private Integer lastyearPurchasenum;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
