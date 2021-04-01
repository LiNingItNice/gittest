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
 * VIP卡充值调整单明细表
 * </p>
 *
 * @author lining
 * @since 2020-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class IposVpcztzdmx extends Model<IposVpcztzdmx> {

    private static final long serialVersionUID=1L;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    private Integer pid;

    /**
     * 租户ID
     */
    private Integer tnId;

    /**
     * VIP会员ID
     */
    private Integer vpId;

    /**
     * VIP卡号
     */
    private String vpdm;

    /**
     * 当前余额
     */
    private BigDecimal dqje;

    /**
     * 调整金额
     */
    private BigDecimal tzje;

    /**
     * 调整后金额
     */
    private BigDecimal thje;

    /**
     * 备注
     */
    private String bz;

    private Integer rowNo;

    private Integer alterdate;

    private LocalDateTime lastchanged;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
