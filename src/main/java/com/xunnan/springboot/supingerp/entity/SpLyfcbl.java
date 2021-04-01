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
public class SpLyfcbl extends Model<SpLyfcbl> {

    private static final long serialVersionUID=1L;

    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    private String dls;

    private String qy;

    private String dp;

    private String dpbm;

    private String pp;

    private String zkd;

    private String nf;

    /**
     * 季节
     */
    private String jj;

    /**
     * 折扣区间
     */
    private String zk;

    /**
     * 金额标识
     */
    private String jebs;

    /**
     * 分成比例
     */
    private String fcbl;

    private String bz1;

    private String bz2;

    /**
     * 开始折扣
     */
    private String kszk;

    /**
     * 结束折扣
     */
    private String jszk;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
