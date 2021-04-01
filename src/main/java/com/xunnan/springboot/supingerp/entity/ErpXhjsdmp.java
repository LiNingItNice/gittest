package com.xunnan.springboot.supingerp.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author lining
 * @since 2020-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ErpXhjsdmp extends Model<ErpXhjsdmp> {

    private static final long serialVersionUID=1L;

    @TableId(value = "DJBH", type = IdType.AUTO)
    private String djbh;

    private Integer mibh;

    private Integer mxbh;

    private String djxz;

    private String lxdj;

    private LocalDateTime rq;

    private String spdm;

    private BigDecimal sl;

    private BigDecimal sl1;

    private BigDecimal sl2;

    private BigDecimal sl3;

    private BigDecimal bzsl;

    private BigDecimal ckj;

    private BigDecimal zk;

    private BigDecimal dj;

    private BigDecimal dj1;

    private BigDecimal dj2;

    private BigDecimal dj3;

    private BigDecimal je;

    private BigDecimal je1;

    private BigDecimal je2;

    private BigDecimal je3;

    private BigDecimal bzje;

    private BigDecimal bzs;

    private BigDecimal hh;

    private String bz;

    private String byzd1;

    private String byzd2;

    private String byzd3;

    private String byzd4;

    private String byzd5;

    private String byzd6;

    private String byzd7;

    private BigDecimal byzd8;

    private BigDecimal byzd9;

    private BigDecimal byzd10;

    private BigDecimal byzd11;

    private BigDecimal byzd12;

    private BigDecimal byzd13;

    private LocalDateTime byzd14;

    private LocalDateTime byzd15;


    @Override
    protected Serializable pkVal() {
        return this.djbh;
    }

}
