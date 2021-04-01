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
 * 小票单导购员业绩明细表
 * </p>
 *
 * @author lining
 * @since 2020-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class IposQtlsdyj extends Model<IposQtlsdyj> {

    private static final long serialVersionUID=1L;

    @TableId(value = "Id", type = IdType.AUTO)
    private Long Id;

    private Long pid;

    /**
     * 导购员Id
     */
    private Integer dgyId;

    /**
     * 导购员名称
     */
    private String dgyMc;

    /**
     * 导购员业绩金额
     */
    private BigDecimal je;

    /**
     * 导购员业绩数量
     */
    private String sl;

    private LocalDateTime lastchanged;

    /**
     * 导购员业绩金额(标准金额)
     */
    private String bzje;

    /**
     * 单据编号
     */
    private String djh;

    /**
     * 导购员代码
     */
    private String dgyDm;

    /**
     * 有效销售数量
     */
    private String yxsl;

    /**
     * 有效业绩金额
     */
    private BigDecimal yxyjje;

    /**
     * 虚销金额
     */
    private BigDecimal xnje;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
