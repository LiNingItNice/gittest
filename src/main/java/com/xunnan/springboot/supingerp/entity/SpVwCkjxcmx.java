package com.xunnan.springboot.supingerp.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
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
public class SpVwCkjxcmx extends Model<SpVwCkjxcmx> {

    private static final long serialVersionUID=1L;

    @TableId(value = "ID", type = IdType.AUTO)
    private Long id;

    private String lx;

    private String djlx;

    private String lxmc;

    private String dj;

    private String djmc;

    private String djbh;

    private LocalDateTime rq;

    private String ydjh;

    private String qddm;

    private String dm1;

    @TableField(value = "DM1_1")
    private String dm11;

    private String ckdm;

    private String kwdm;

    private String ys;

    private String ysr;

    private LocalDateTime ysrq;

    private String sh;

    private String shr;

    private LocalDateTime shrq;

    private String qr;

    private String qrr;

    private LocalDateTime qrrq;

    private Integer mxbh;

    private String spdm;

    private String gg1dm;

    private String gg2dm;

    private BigDecimal ckj;

    @TableField(value = "DJ_3")
    private BigDecimal dj3;

    private BigDecimal sl;

    private BigDecimal je;

    private String lxdj;

    private String byzd3;

    @TableField(value = "RQ_4")
    private LocalDateTime rq4;

    private String zdr;

    private LocalDateTime jzrq;

    private String jz;

    private String fzxx;

    private String pcdm;

    /**
     * 0-生命周期外 1-生命周期内
     */
    private Integer smzqbj;

    /**
     * 0-特价 1-正价
     */
    private Integer zjtjbj;

    /**
     * 在途数量
     */
    private Integer ztsl;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
