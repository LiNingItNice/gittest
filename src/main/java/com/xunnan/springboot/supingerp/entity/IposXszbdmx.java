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
 * 远程终端销售指标设置单详情
 * </p>
 *
 * @author lining
 * @since 2020-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class IposXszbdmx extends Model<IposXszbdmx> {

    private static final long serialVersionUID=1L;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    private Integer pid;

    /**
     * 租户ID
     */
    private Integer tnId;

    /**
     * 终端ID
     */
    private Integer zdId;

    /**
     * 终端代码
     */
    private String zddm;

    /**
     * 终端名称
     */
    private String zdmc;

    /**
     * 上年销售额
     */
    private BigDecimal snje;

    /**
     * 预计增长率
     */
    private BigDecimal zzl;

    /**
     * 本年指标总额
     */
    private BigDecimal bnje;

    /**
     * 1月目标业绩
     */
    private BigDecimal je01;

    /**
     * 2月目标业绩
     */
    private BigDecimal je02;

    /**
     * 3月目标业绩
     */
    private BigDecimal je03;

    /**
     * 4月目标业绩
     */
    private BigDecimal je04;

    /**
     * 5月目标业绩
     */
    private BigDecimal je05;

    /**
     * 6月目标业绩
     */
    private BigDecimal je06;

    /**
     * 7月目标业绩
     */
    private BigDecimal je07;

    /**
     * 8月目标业绩
     */
    private BigDecimal je08;

    /**
     * 9月目标业绩
     */
    private BigDecimal je09;

    /**
     * 10月目标业绩
     */
    private BigDecimal je10;

    /**
     * 11月目标业绩
     */
    private BigDecimal je11;

    /**
     * 12月目标业绩
     */
    private BigDecimal je12;

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
