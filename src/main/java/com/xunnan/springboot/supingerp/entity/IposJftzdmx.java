package com.xunnan.springboot.supingerp.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 积分调整单明细表
 * </p>
 *
 * @author lining
 * @since 2020-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class IposJftzdmx extends Model<IposJftzdmx> {

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
     * 当前积分
     */
    private Integer dqjf;

    /**
     * 调整积分
     */
    private Integer tzjf;

    /**
     * 积分余额
     */
    private Integer ljjf;

    /**
     * 备注
     */
    private String bz;

    private Integer rowNo;

    private Integer alterdate;

    private LocalDateTime lastchanged;

    /**
     * VIP卡号
     */
    private String vpdm;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
