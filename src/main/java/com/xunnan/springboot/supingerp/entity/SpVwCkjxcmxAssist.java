package com.xunnan.springboot.supingerp.entity;

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
public class SpVwCkjxcmxAssist extends Model<SpVwCkjxcmxAssist> {

    private static final long serialVersionUID=1L;

    @TableId(value = "DJBH", type = IdType.AUTO)
    private String djbh;


    @Override
    protected Serializable pkVal() {
        return this.djbh;
    }

}
