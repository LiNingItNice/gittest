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
 * vip充值退款单退款单
 * </p>
 *
 * @author lining
 * @since 2020-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class IposRefundorder extends Model<IposRefundorder> {

    private static final long serialVersionUID=1L;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    private Integer pid;

    /**
     * 租户ID
     */
    private Integer tnId;

    /**
     * 单据编号
     */
    private String djbh;

    /**
     * 原单据号
     */
    private String ydjh;

    /**
     * 日期
     */
    private Integer rq;

    /**
     * 组织ID
     */
    private Integer orgId;

    /**
     * 终端ID
     */
    private Integer zdId;

    /**
     * 顾客ID
     */
    private Integer gkId;

    /**
     * 手机
     */
    private String sj;

    /**
     * 退款金额
     */
    private BigDecimal tkje;

    /**
     * 导购员ID
     */
    private Integer dgyId;

    /**
     * 审批
     */
    private Integer sp;

    /**
     * 审批人
     */
    private String spr;

    /**
     * 审批日期
     */
    private Integer sprq;

    /**
     * 制单人
     */
    private String zdr;

    /**
     * 制单日期
     */
    private Integer zdrq;

    /**
     * 修改人
     */
    private String xgr;

    /**
     * 修改日期
     */
    private Integer xgrq;

    /**
     * 备注
     */
    private String bz;

    private Integer rowNo;

    private Integer alterdate;

    private LocalDateTime lastchanged;

    /**
     * VIP卡ID
     */
    private Integer vpId;

    /**
     * VIP卡号
     */
    private String vpdm;

    /**
     * 会员名称
     */
    private String vpmc;

    /**
     * 顾客代码
     */
    private String gkdm;

    /**
     * 账面余额
     */
    private BigDecimal dqje;

    /**
     * 充值折扣
     */
    private BigDecimal zk;

    /**
     * 退款后账面余额
     */
    private BigDecimal qmje;

    /**
     * 导购员
     */
    private String dgy;

    /**
     * 1：未抓取 2:已抓取
     */
    private Integer icrmIsFetch;

    /**
     * 扣减积分
     */
    private Integer kjjf;

    /**
     * 收银台id
     */
    private Integer sytId;

    /**
     * 收银台代码
     */
    private String sytDm;

    /**
     * 充值折扣（原充值金额+现充值金额/总金额(包括赠送金额)） ipos_vip 充值的折扣
     */
    private BigDecimal czzk;

    private Boolean ispost;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
