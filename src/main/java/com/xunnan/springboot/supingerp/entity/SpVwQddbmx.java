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
 * 
 * </p>
 *
 * @author lining
 * @since 2020-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SpVwQddbmx extends Model<SpVwQddbmx> {

    private static final long serialVersionUID=1L;

    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    private String djlx;

    private String djmc;

    private String djbh;

    private LocalDateTime rq;

    private String ydjh;

    private String qddm;

    private String ygdm;

    private String dm1;

    private String dm11;

    private String dm2;

    private String dm21;

    private String dm3;

    private String dm31;

    private String dm4;

    private String dm41;

    private String tj;

    private String xc;

    private String ys;

    private String ysr;

    private LocalDateTime ysrq;

    private String sh;

    private String shr;

    private LocalDateTime shrq;

    private String jz;

    private String zdr;

    private String byzd2;

    private String byzd5;

    private String byzd6;

    private LocalDateTime rq4;

    private String bz;

    private String lxdj;

    private String byzd3;

    private String djxz;

    private LocalDateTime yxrq;

    private Integer mxbh;

    private String spdm;

    private String gg1dm;

    private String gg2dm;

    private BigDecimal sl;

    private BigDecimal sl1;

    private BigDecimal sl2;

    private BigDecimal ckj;

    private BigDecimal zk;

    private String qydm;

    private BigDecimal dj;

    private BigDecimal dj3;

    private BigDecimal je;

    private BigDecimal je1;

    private BigDecimal je2;

    private String zy;

    private BigDecimal hh;

    private String sp;

    private String fplx;

    private BigDecimal byzd12;

    private BigDecimal byzd13;

    private LocalDateTime rq1;

    private LocalDateTime rq2;

    private String ll;

    private String zfr;

    private LocalDateTime zfrq;

    private String zf;

    private String dm6;

    private String fzxx;

    private String djh;

    private String byzd7;

    private BigDecimal zrje;

    private String jshb;

    private String pcdm;

    private String glck;

    private BigDecimal glje;

    private BigDecimal hbhl;

    private BigDecimal qdcbdj;

    /**
     * 日期-年月
     */
    private String rqYearmonth;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
