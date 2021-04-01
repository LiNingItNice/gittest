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
public class ErpCangku extends Model<ErpCangku> {

    private static final long serialVersionUID=1L;

    /**
     * 仓库代码
     */
    @TableId(value = "CKDM", type = IdType.AUTO)
    private String ckdm;

    /**
     * 仓库名称
     */
    private String ckmc;

    /**
     * 助记符
     */
    private String zjf;

    /**
     * 渠道代码
     */
    private String qddm;

    private String gcdm;

    /**
     * 仓库类别(关联表拿)
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
     * 性质代码
     */
    private String xzdm;

    /**
     * 地址
     */
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

    private String bz;

    private String jgsd;

    /**
     * 仓库属性（分公司）
     */
    private String cksx1;

    /**
     * 仓库属性（商品）
     */
    private String cksx2;

    /**
     * 仓库属性（总部）
     */
    private String cksx3;

    /**
     * 分公司（总部商品）
     */
    private String cksx4;

    /**
     * 仓库属性5
     */
    private String cksx5;

    /**
     * 仓库属性6
     */
    private String cksx6;

    private BigDecimal zk;

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

    private Integer hyzq;

    private String xgr;

    private LocalDateTime xgrq;

    private String gcmr;

    @TableField("LastChanged")
    private Blob LastChanged;

    private String tjsd;

    private String slbz;

    private String slyc;

    private String wymzk;

    @TableField("WithoutCode")
    private String WithoutCode;

    @TableField("WithoutCode2")
    private String WithoutCode2;

    @TableField("Longitude")
    private String Longitude;

    @TableField("Latitude")
    private String Latitude;

    private String province;

    private String city;

    private String county;

    private String ckbpj;

    @TableField("CUST_KField1")
    private String custKfield1;

    private String custBm;

    private String custLd;

    private String custDq;

    private String custXjd;

    private String custDplx;

    private String custXiaoqu;


    @Override
    protected Serializable pkVal() {
        return this.ckdm;
    }

}
