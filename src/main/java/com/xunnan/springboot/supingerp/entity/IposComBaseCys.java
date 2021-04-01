package com.xunnan.springboot.supingerp.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 承运商
 * </p>
 *
 * @author lining
 * @since 2020-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class IposComBaseCys extends Model<IposComBaseCys> {

    private static final long serialVersionUID=1L;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    private Integer pid;

    /**
     * 租户ID
     */
    private Integer tnId;

    /**
     * 承运商代码
     */
    private String cysdm;

    /**
     * 承运商名称
     */
    private String cysmc;

    /**
     * 组织ID
     */
    private Integer orgId;

    /**
     * 联系人
     */
    private String lxr;

    /**
     * 负责人
     */
    private String fzr;

    /**
     * 邮编
     */
    private String yb;

    /**
     * 电话1
     */
    private String dh1;

    /**
     * 电话2
     */
    private String dh2;

    /**
     * 电话3
     */
    private String dh3;

    /**
     * 传真
     */
    private String cz;

    /**
     * 手机1
     */
    private String sj1;

    /**
     * 手机2
     */
    private String sj2;

    /**
     * 电子邮箱
     */
    private String email;

    /**
     * 备注
     */
    private String bz;

    /**
     * 网址
     */
    private String wz;

    /**
     * 地址
     */
    private String dz;

    /**
     * 组织代码
     */
    private String orgDm;

    /**
     * 组织名称
     */
    private String orgMc;

    private Integer rowNo;

    private Integer alterdate;

    private LocalDateTime lastchanged;

    /**
     * 快递鸟对照码
     */
    private String kdndzm;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
