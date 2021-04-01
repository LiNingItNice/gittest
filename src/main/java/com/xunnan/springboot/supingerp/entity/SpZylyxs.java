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
public class SpZylyxs extends Model<SpZylyxs> {

    private static final long serialVersionUID=1L;

    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    private String sddm;

    private String djbh;

    private String dt;

    private String spdm;

    private String gg1dm;

    private String gg2dm;

    private String hplxdm;

    private String hplx;

    private String jjdm;

    private String jj;

    private String bddm;

    private String bd;

    private String zkddm;

    private String zkd;

    private String ppdm;

    private String pp;

    private String nf;

    private String sl;

    private String ckj;

    private String je;

    private String zk;

    /**
     * 分成比例
     */
    private String fcbl;

    /**
     * 销售收入
     */
    private String sr;

    /**
     * 0-直营 1-联营
     */
    private String lx;

    /**
     * 年月日
     */
    private String nyr;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
