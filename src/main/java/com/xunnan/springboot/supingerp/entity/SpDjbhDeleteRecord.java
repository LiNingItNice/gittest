package com.xunnan.springboot.supingerp.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 删除单据记录表
 * </p>
 *
 * @author lining
 * @since 2020-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SpDjbhDeleteRecord extends Model<SpDjbhDeleteRecord> {

    private static final long serialVersionUID=1L;

    private String ckdm;

    private String djbh;

    private String rq;

    private LocalDateTime createTime;

    /**
     * 类型 
     */
    private Integer type;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
