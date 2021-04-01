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
 * 积分调整单
 * </p>
 *
 * @author lining
 * @since 2020-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class IposJftzd extends Model<IposJftzd> {

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
     * 调整类型 0-增加 1-减少 2-清零 4-积分补偿(负积分调整为0)
     */
    private Integer tzlx;

    /**
     * 积分有效期限（月） 单位：月仅在调整类型为增加时有效
     */
    private Integer jfqx;

    /**
     * 默认调整积分
     */
    private Integer tzjf;

    /**
     * 调整积分总额
     */
    private Integer jf;

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
     * 组织ID
     */
    private Integer orgId;

    /**
     * 终端ID
     */
    private Integer zdId;

    /**
     * 积分产生开始日期
     */
    private Integer jfrqStart;

    /**
     * 积分产生结束日期
     */
    private Integer jfrqEnd;

    /**
     * 小票结算造成负积分, 抵消负积分所需补偿金额
     */
    private BigDecimal bcje;

    /**
     * 收银台代码
     */
    private String sytDm;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
