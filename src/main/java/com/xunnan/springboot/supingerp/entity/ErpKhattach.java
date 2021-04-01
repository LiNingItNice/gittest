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
public class ErpKhattach extends Model<ErpKhattach> {

    private static final long serialVersionUID=1L;

    @TableId(value = "KHDM", type = IdType.AUTO)
    private String khdm;

    private String jyxz;

    private String jyxs;

    private BigDecimal yymj;

    private Integer lc;

    private Integer cs;

    private Integer dd;

    private Integer zj;

    private Integer zfrq;

    private String zffs;

    private String xxbb;

    private String cgcc;

    private String hth;

    private LocalDateTime hstart;

    private LocalDateTime hend;

    private LocalDateTime ksrq;

    private String cg;

    private LocalDateTime cgrq;

    private String bz;

    private String byzd1;

    private String byzd2;

    private Integer byzd3;

    private BigDecimal byzd4;

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

    private String kwdm;

    private String byzd16;

    private String byzd17;

    private String byzd18;

    private String byzd19;

    private String byzd20;

    private String thkwdm;

    private Integer fkqx;

    private BigDecimal yfkbl;

    private String bgzfhj;


    @Override
    protected Serializable pkVal() {
        return this.khdm;
    }

}
