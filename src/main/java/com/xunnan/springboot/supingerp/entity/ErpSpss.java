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
public class ErpSpss extends Model<ErpSpss> {

    private static final long serialVersionUID=1L;

    @TableId(value = "SPDM", type = IdType.AUTO)
    private String spdm;

    private String qydm;

    private LocalDateTime ssrq;

    private String byzd1;

    private String byzd2;

    private Integer byzd3;

    private BigDecimal byzd4;


    @Override
    protected Serializable pkVal() {
        return this.spdm;
    }

}
