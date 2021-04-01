package com.xunnan.springboot.supingerp.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

import lombok.*;

/**
 * <p>
 * 
 * </p>
 *
 * @author lining
 * @since 2020-11-18
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = false)
public class ErpA extends Model<ErpA> {

    private static final long serialVersionUID=1L;

    @TableId(value = "CKDM", type = IdType.AUTO)
    private String ckdm;

    @Override
    protected Serializable pkVal() {
        return this.ckdm;
    }

}
