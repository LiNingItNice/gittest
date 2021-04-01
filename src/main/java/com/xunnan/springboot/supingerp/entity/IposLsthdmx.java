package com.xunnan.springboot.supingerp.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 终端零售退货单商品明细
 * </p>
 *
 * @author lining
 * @since 2020-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class IposLsthdmx extends Model<IposLsthdmx> {

    private static final long serialVersionUID=1L;

    @TableId(value = "Id", type = IdType.AUTO)
    private Long Id;

    private Long pid;

    private Long djId;

    /**
     * 组织ID
     */
    private Integer orgId;

    /**
     * 终端ID
     */
    private Integer zdId;

    /**
     * 确认标记位：1-已确认 0-未确认
     */
    private Integer qr;

    /**
     * 确认日期
     */
    private Integer qrrq;

    /**
     * 制单方向：0-总部制单 1-终端制单
     */
    private Integer zdfx;

    /**
     * 租户ID
     */
    private Integer tnId;

    /**
     * 商品ID
     */
    private Integer spId;

    /**
     * 颜色ID
     */
    private Integer gg1Id;

    /**
     * 尺码ID
     */
    private Integer gg2Id;

    /**
     * 批次ID
     */
    private Integer gg3Id;

    /**
     * 数量
     */
    private Integer sl;

    /**
     * 备用数量1
     */
    private Integer sl1;

    /**
     * 备用数量2
     */
    private Integer sl2;

    /**
     * 备用数量3
     */
    private Integer sl3;

    /**
     * 标准价格
     */
    private BigDecimal bzj;

    /**
     * 参考价
     */
    private BigDecimal ckj;

    /**
     * 折扣
     */
    private BigDecimal zk;

    /**
     * 单价
     */
    private BigDecimal dj;

    /**
     * 金额
     */
    private BigDecimal je;

    /**
     * 备用金额1
     */
    private BigDecimal je1;

    /**
     * 备用金额2
     */
    private BigDecimal je2;

    /**
     * 备用金额3
     */
    private BigDecimal je3;

    /**
     * 小票编号
     */
    private String xpbh;

    /**
     * 备注
     */
    private String bz;

    private Integer rowNo;

    private Integer alterdate;

    private LocalDateTime lastchanged;

    /**
     * GUID字段
     */
    private String gid;

    /**
     * VIP代码
     */
    private String vpdm;

    /**
     * 顾客代码
     */
    private String gkdm;

    /**
     * 店员Id
     */
    private Integer dyId;

    /**
     * 销售时间
     */
    private Integer xsrq;

    /**
     * 终端库位Id
     */
    private Integer kwId;

    /**
     * 商品代码
     */
    private String spdm;

    /**
     * 商品名称
     */
    private String spmc;

    /**
     * 规格1代码
     */
    private String gg1dm;

    /**
     * 规格1名称
     */
    private String gg1mc;

    /**
     * 规格1描述
     */
    private String gg1nt;

    /**
     * 规格2代码
     */
    private String gg2dm;

    /**
     * 规格2名称
     */
    private String gg2mc;

    /**
     * 扣率
     */
    private BigDecimal kl;

    /**
     * 默认导购员代码字符串，以逗号隔开多个导购员的代码
     */
    private String dgyListDm;

    /**
     * 默认导购员名称字符串，以逗号隔开多个导购员的名称
     */
    private String dgyListMc;

    /**
     * 导购员id字符串，以逗号隔开多个导购员的id
     */
    private String dgyListId;

    /**
     * 结算额
     */
    private BigDecimal jsje;

    /**
     * 批次代码
     */
    private String gg3dm;

    /**
     * 批次名称
     */
    private String gg3mc;

    /**
     * 单据编号
     */
    private String djh;

    /**
     * 活动代码
     */
    private String hddm;

    /**
     * 活动名称
     */
    private String hdmc;

    /**
     * 成本价
     */
    private BigDecimal cbj;

    /**
     * 商品状态 0-正常 1-促销 2-换购 3-赠品 4-让利 5-补差优惠 6-VIP叠加优惠
     */
    private Integer spStatus;

    /**
     * 计税价格
     */
    private BigDecimal jsjg;

    /**
     * 计税金额
     */
    private BigDecimal jishuije;

    /**
     * 有效业绩金额
     */
    private BigDecimal yxyjje;

    /**
     * SKU
     */
    private String sku;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
