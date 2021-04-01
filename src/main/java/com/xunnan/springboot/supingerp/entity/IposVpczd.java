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
 * VIP充值单
 * </p>
 *
 * @author lining
 * @since 2020-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class IposVpczd extends Model<IposVpczd> {

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
     * VIP会员ID
     */
    private Integer vpId;

    /**
     * 充值方式ID
     */
    private Integer czfsId;

    /**
     * 原卡余额 从原卡资料表中读取
     */
    private BigDecimal dqjeS;

    /**
     * 原卡有效期 从原卡资料表中读取
     */
    private Integer yxrqS;

    /**
     * 支付金额
     */
    private BigDecimal fkje;

    /**
     * 回馈比例 根据充值方式自动计算出回馈比例
     */
    private BigDecimal hkbl;

    /**
     * 回馈金额 根据充值方式自动计算出
     */
    private BigDecimal hkje;

    /**
     * 充值金额 (充值金额=支付金额+回馈金额)
     */
    private BigDecimal je;

    /**
     * 充后余额(充后余额=原卡余额+充值金额)
     */
    private BigDecimal dqjeE;

    /**
     * 充后有效期  根据充值方式自动计算新的有效期
     */
    private Integer yxrqE;

    /**
     * 积分比例 根据充值方式自动计算出积分比例
     */
    private BigDecimal jfbl;

    /**
     * 积分金额 根据充值方式自动算出可享受积分的金额基数
     */
    private BigDecimal jfje;

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
     * 导购员
     */
    private String dgy;

    /**
     * 导购员id
     */
    private Integer dgyId;

    /**
     * 单据类型 1总部权限 2门店权限
     */
    private Integer flag;

    /**
     * 1：未抓取 2:已抓取
     */
    private Integer icrmIsFetch;

    /**
     * 收银台id
     */
    private Integer sytId;

    /**
     * 收银台代码
     */
    private String sytDm;

    /**
     * 回馈积分
     */
    private Integer jf;

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
