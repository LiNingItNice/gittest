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
public class SpGhzk extends Model<SpGhzk> {

    private static final long serialVersionUID=1L;

    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    private String cj;

    private String dls;

    private String dlsbm;

    private String pp;

    private String nf;

    private String jj;

    private String zkd;

    private String ksrq;

    private String jsrq;

    private String xszt;

    private String xsztbm;

    private String zk;

    private String bz1;

    private String bz2;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
