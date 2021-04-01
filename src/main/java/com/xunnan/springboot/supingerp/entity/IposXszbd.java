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
 * 远程终端销售指标设置单
 * </p>
 *
 * @author lining
 * @since 2020-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class IposXszbd extends Model<IposXszbd> {

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
     * 年度
     */
    private Integer nd;

    /**
     * 上级组织ID
     */
    private Integer orgId;

    /**
     * 上级组织代码
     */
    private String orgdm;

    /**
     * 上级组织名称
     */
    private String orgmc;

    /**
     * 终端数量
     */
    private Integer zdsl;

    /**
     * 店均目标业绩
     */
    private BigDecimal je1;

    /**
     * 目标业绩总额
     */
    private BigDecimal je2;

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
     * 终止
     */
    private Integer zz;

    /**
     * 终止人
     */
    private String zzr;

    /**
     * 终止日期
     */
    private Integer zzrq;

    /**
     * 终止备注
     */
    private String zzbz;

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


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
