package com.xunnan.springboot.supingerp.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.sql.Blob;
import com.baomidou.mybatisplus.annotation.TableField;
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
public class ErpQddbdConfirm extends Model<ErpQddbdConfirm> {

    private static final long serialVersionUID=1L;

    @TableId(value = "DJBH", type = IdType.AUTO)
    private String djbh;

    private LocalDateTime rq;

    private String ydjh;

    private String djxz;

    private String fplx;

    private String lxdj;

    private Integer days;

    private String dm1;

    private String dm11;

    private String dm2;

    private String dm21;

    private String dm3;

    private String dm31;

    private String dm4;

    private String dm41;

    private String qddm;

    private String qydm;

    private String ygdm;

    private BigDecimal sl;

    private BigDecimal sl1;

    private BigDecimal sl2;

    private BigDecimal sl3;

    private BigDecimal bzsl;

    private BigDecimal je;

    private BigDecimal je1;

    private BigDecimal je2;

    private BigDecimal je3;

    private BigDecimal bzje;

    private BigDecimal cj;

    private String tj;

    private LocalDateTime tjrq;

    private String xc;

    private LocalDateTime xcrq;

    private String ys;

    private LocalDateTime ysrq;

    private String jz;

    private LocalDateTime jzrq;

    private String js;

    private LocalDateTime jsrq;

    private String sh;

    private LocalDateTime shrq;

    private String sp;

    private LocalDateTime sprq;

    private String ll;

    private LocalDateTime llrq;

    private String zdr;

    private String ysr;

    private String jzr;

    private String jsr;

    private String shr;

    private String spr;

    private String llr;

    private LocalDateTime yxrq;

    private LocalDateTime rq1;

    private LocalDateTime rq2;

    private LocalDateTime rq3;

    private LocalDateTime rq4;

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

    private String zs;

    private String zsr;

    private LocalDateTime zsrq;

    private String dm5;

    private String dm51;

    private String dm6;

    private String dm61;

    private String byzd16;

    private String byzd17;

    private String byzd18;

    private Integer byzd19;

    private BigDecimal byzd20;

    private String hh;

    private Integer zdhhzq;

    private BigDecimal whhk;

    private String zdhhk;

    private String jshb;

    private BigDecimal hbhl;

    private String fzxx;

    private String fp;

    private String glck;

    private String glkw;

    private String xsfy;

    private BigDecimal zrje;

    private BigDecimal zrhje;

    private String cy;

    private BigDecimal glje;

    private String cydh;

    private String cx;

    private String flowPath;

    private String flowStatus;

    @TableField("IsFocus")
    private String IsFocus;

    @TableField("LastChanged")
    private Blob LastChanged;

    @TableField("Is_Move")
    private String isMove;

    @TableField("MoveRq")
    private LocalDateTime MoveRq;

    private Integer isIpos;

    private String custFgsdm;


    @Override
    protected Serializable pkVal() {
        return this.djbh;
    }

}
