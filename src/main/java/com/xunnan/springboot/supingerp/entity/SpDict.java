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
public class SpDict extends Model<SpDict> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 类型编码
     */
    private String dictCode;

    /**
     * 类型名称
     */
    private String dictName;

    /**
     * 类型
     */
    private String dictType;

    /**
     * 状态(0-正常 1-停用,默认0)
     */
    private Integer dictStatus;

    /**
     * 描述/备注
     */
    private String dictRemark;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
