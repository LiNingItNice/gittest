package com.xunnan.springboot.supingerp.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
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
public class ErpXhskdskmx extends Model<ErpXhskdskmx> {

    private static final long serialVersionUID=1L;

    @TableId(value = "DJBH", type = IdType.AUTO)
    private String djbh;

    private Integer mibh;

    private Integer mxbh;

    private String skzh;

    private BigDecimal skje;

    private String zczh;

    private BigDecimal zcje;

    private String bz;


    @Override
    protected Serializable pkVal() {
        return this.djbh;
    }

}
