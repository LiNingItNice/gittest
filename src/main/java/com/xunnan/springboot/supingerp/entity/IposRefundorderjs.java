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
 * vip充值退款单退款单结算明细表
 * </p>
 *
 * @author lining
 * @since 2020-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class IposRefundorderjs extends Model<IposRefundorderjs> {

    private static final long serialVersionUID=1L;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    /**
     * 关联终端储值卡退款单ipos_refundorder的id
     */
    private Integer pid;

    /**
     * 租户ID
     */
    private Integer tnId;

    /**
     * 结算方式id，关联结算方式表的id
     */
    private Integer jsId;

    /**
     * 销售金额
     */
    private BigDecimal tkje;

    /**
     * 备注
     */
    private String bz;

    /**
     * 结算代码
     */
    private String jsdm;

    private LocalDateTime lastchanged;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
