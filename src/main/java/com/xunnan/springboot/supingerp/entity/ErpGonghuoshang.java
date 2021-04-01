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
public class ErpGonghuoshang extends Model<ErpGonghuoshang> {

    private static final long serialVersionUID=1L;

    @TableId(value = "GHSDM", type = IdType.AUTO)
    private String ghsdm;

    private String ghsmc;

    private String zjf;

    private String xzdm;

    private String qddm;

    private String lbdm;

    private String qydm;

    private String ygdm;

    private String dz;

    private String lxr;

    private String fzr;

    private String yb;

    private String dh1;

    private String dh2;

    private String dh3;

    private String sj;

    private String cz;

    private String ch;

    private String email;

    private String web;

    private String khh;

    private String zh;

    private String sh;

    private String fr;

    private String hjkm;

    private String jgsd;

    private BigDecimal zk;

    private BigDecimal hhk;

    private String hy;

    private LocalDateTime sr;

    private String sfz;

    private String jshb;

    private String ckdm;

    private String kwdm;

    private String bz;

    private String tzsy;

    private String byzd1;

    private String byzd2;

    private String byzd3;

    private String byzd4;

    private String byzd5;

    private String byzd6;

    private String byzd7;

    private Integer byzd8;

    private Integer byzd9;

    private Integer byzd10;

    private BigDecimal byzd11;

    private BigDecimal byzd12;

    private BigDecimal byzd13;

    private LocalDateTime byzd14;

    private LocalDateTime byzd15;

    private String fplx;

    @TableField("CreateDate")
    private LocalDateTime CreateDate;

    @TableField("Createer")
    private String Createer;

    @TableField("ModifyDate")
    private LocalDateTime ModifyDate;

    @TableField("Modifyer")
    private String Modifyer;

    private String hsdx;

    private BigDecimal ghsbzj;

    private String jszq;

    private String province;

    private String city;

    private String county;

    @TableField("LastChanged")
    private Blob LastChanged;


    @Override
    protected Serializable pkVal() {
        return this.ghsdm;
    }

}
