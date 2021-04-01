package com.xunnan.springboot.supingerp.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
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
public class ErpGuige1 extends Model<ErpGuige1> {

    private static final long serialVersionUID=1L;

    @TableId(value = "GGDM", type = IdType.AUTO)
    private String ggdm;

    private String ggmc;

    private String color;

    private String rgb;

    private String cmyk;

    private String byzd1;

    private String byzd2;

    private Integer byzd3;

    private BigDecimal byzd4;

    private String ggmsxx;

    private String tybj;

    private String js;

    @TableField("LastChanged")
    private Blob LastChanged;


    @Override
    protected Serializable pkVal() {
        return this.ggdm;
    }

}
