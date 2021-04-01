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
 * VIP充值结算明细表
 * </p>
 *
 * @author lining
 * @since 2020-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class IposVpczdJs extends Model<IposVpczdJs> {

    private static final long serialVersionUID=1L;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    private Integer pid;

    /**
     * 结算ID
     */
    private Integer jsId;

    /**
     * 结算代码
     */
    private String jsdm;

    /**
     * 结算名称
     */
    private String jsmc;

    /**
     * 金额
     */
    private BigDecimal je;

    /**
     * 备注
     */
    private String bz;

    private LocalDateTime lastchanged;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
