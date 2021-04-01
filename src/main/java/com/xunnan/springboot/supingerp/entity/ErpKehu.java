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
public class ErpKehu extends Model<ErpKehu> {

    private static final long serialVersionUID=1L;

    /**
     * 客户代码
     */
    @TableId(value = "KHDM", type = IdType.AUTO)
    private String khdm;

    /**
     * 客户名称
     */
    private String khmc;

    /**
     * 助记符
     */
    private String zjf;

    /**
     * 渠道代码
     */
    private String qddm;

    /**
     * 类别代码
     */
    private String lbdm;

    /**
     * 区域代码
     */
    private String qydm;

    /**
     * 员工代码
     */
    private String ygdm;

    /**
     * 性质/类型代码(1-批发 2-店铺 3-客户)
     */
    private String xzdm;

    /**
     * 仓库代码
     */
    private String ckdm;

    private String pmkulb;

    private String dz;

    private String lxr;

    /**
     * 负责人
     */
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

    private BigDecimal xyje;

    private BigDecimal hhk;

    private String hy;

    private LocalDateTime sr;

    private String sfz;

    private String jshb;

    private String bz;

    private String tzsy;

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

    private String isuse;

    @TableField("Expr")
    private String Expr;

    /**
     * 客户属性（分公司）
     */
    private String khsx1;

    /**
     * 客户属性（商品）
     */
    private String khsx2;

    /**
     * 店铺类型（总部）
     */
    private String khsx3;

    /**
     * 店铺区域（总部）
     */
    private String khsx4;

    /**
     * 区域(运营)
     */
    private String khsx5;

    /**
     * 地区(运营)
     */
    private String khsx6;

    private String byzd16;

    private String byzd17;

    private String byzd18;

    private String byzd19;

    private String byzd20;

    private String byzd21;

    private String byzd22;

    private BigDecimal byzd23;

    private BigDecimal byzd24;

    private LocalDateTime byzd25;

    private String byzd26;

    private String byzd27;

    private String byzd28;

    private String byzd29;

    private String byzd30;

    private String byzd31;

    private LocalDateTime byzd32;

    private String sdjgcl;

    private String fplx;

    @TableField("LastChanged")
    private Blob LastChanged;

    private String hsdx;

    private String tjsd;

    private String wbbm;

    private String th;

    private String fzxy;

    private String province;

    private String city;

    private String county;

    private String pmkhlb;

    private String upload;

    private String custXjd;

    private String custDplx;

    private String custXiaoqu;

    private String custCwdm;

    private String custCwbm;

    @TableField("CUST_test")
    private String custTest;

    private BigDecimal custXsmj;


    @Override
    protected Serializable pkVal() {
        return this.khdm;
    }

}
