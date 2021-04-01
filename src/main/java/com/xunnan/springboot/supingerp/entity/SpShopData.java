package com.xunnan.springboot.supingerp.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 店铺数据表
 * </p>
 *
 * @author lining
 * @since 2020-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SpShopData extends Model<SpShopData> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 客户_店铺编码(对应ERP的客户表KHDM)
     */
    private String shopCode;

    /**
     * 营业日期
     */
    private LocalDate shopDate;

    /**
     * 客流量
     */
    private Integer passengerFlow;

    /**
     * 成交率(下面的客单数/客流量)
     */
    private BigDecimal dealRate;

    /**
     * 有效金额(用来计算客单价的)
     */
    private BigDecimal effectiveAmount;

    /**
     * 客单数
     */
    private Integer customersNumber;

    /**
     * 客单价(=上面的有效金额/客单数)
     */
    private BigDecimal perTicketSales;

    /**
     * 配装单数(购买两件以上的销售单数量)
     */
    private Integer packingList;

    /**
     * 特价销售金额
     */
    private BigDecimal specialSaleAmount;

    /**
     * 特价销售数量
     */
    private Integer specialSaleNumber;

    /**
     * 销售总单数(用于计算连单率)
     */
    private Integer saleAllOrderNumber;

    /**
     * 销售总件数量(用于计算连单率)
     */
    private Integer saleAllNumber;

    /**
     * 连单率(=销售总件数/销售总单数)
     */
    private BigDecimal evenSingleRate;

    /**
     * 日期(时间戳)
     */
    @TableField("shop_date_timeStamp")
    private Integer shopDateTimestamp;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
