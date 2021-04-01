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
public class ErpQudao extends Model<ErpQudao> {

    private static final long serialVersionUID=1L;

    @TableId(value = "QDDM", type = IdType.AUTO)
    private String qddm;

    private String qdmc;

    private String lbdm;

    private String qydm;

    private String ygdm;

    private Integer qdjb;

    private String sjqd;

    private String qddj;

    private String dz;

    private String lxr;

    private String fzr;

    private String yb;

    private String dh1;

    private String dh2;

    private String dh3;

    private String dh4;

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

    private BigDecimal xyje;

    private BigDecimal hhk;

    private String bz;

    private String qd0;

    private String qd1;

    private String qd2;

    private String qd3;

    private String qd4;

    private String qd5;

    private String xtmr;

    private String byzd1;

    private String byzd2;

    private Integer byzd3;

    private BigDecimal byzd4;

    private String byzd5;

    private String byzd6;

    private String jdr;

    private LocalDateTime jdrq;

    private String xgr;

    private LocalDateTime xgrq;

    private String djrqfw;

    private Integer djqsrq;

    private Integer djzzrq;

    private String ydm;

    private String yszx;

    private String cycl;

    private String ysrk;

    private String province;

    private String city;

    private String county;

    @TableField("LastChanged")
    private Blob LastChanged;


    @Override
    protected Serializable pkVal() {
        return this.qddm;
    }

}
