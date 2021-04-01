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
public class ErpLsxhdzpUpdate extends Model<ErpLsxhdzpUpdate> {

    private static final long serialVersionUID=1L;

    @TableId(value = "DJBH", type = IdType.AUTO)
    private String djbh;

    private Integer mibh;

    private Integer mxbh;

    private String state;

    private String spdm;

    private String gg1dm;

    private String gg2dm;

    private BigDecimal sl;

    private BigDecimal sl1;

    private BigDecimal ckj;

    private BigDecimal zk;

    private BigDecimal dj;

    private BigDecimal dj1;

    private BigDecimal je;

    private BigDecimal je1;

    private String byzd1;

    private String byzd2;

    private String byzd3;

    private String byzd4;

    private String byzd5;

    private String byzd6;

    private BigDecimal byzd7;

    private BigDecimal byzd8;

    private String bz;

    private BigDecimal dj3;

    private String pcdm;

    private LocalDateTime createTime;


    @Override
    protected Serializable pkVal() {
        return this.djbh;
    }

}
