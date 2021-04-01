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
 * 员工表，主要用于门店督导
 * </p>
 *
 * @author lining
 * @since 2020-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class IposYuangong extends Model<IposYuangong> {

    private static final long serialVersionUID=1L;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    private Integer pid;

    /**
     * 租户ID
     */
    private Integer tnId;

    /**
     * 员工代码
     */
    private String ygdm;

    /**
     * 姓名
     */
    private String ygmc;

    /**
     * 性别
     */
    private Integer xb;

    /**
     * 员工类型
     */
    private Integer yglx;

    /**
     * 所属组织
     */
    private Integer orgId;

    /**
     * 电话
     */
    private String dh;

    /**
     * 手机
     */
    private String sj;

    /**
     * 停用
     */
    private Integer ty;

    /**
     * 备注
     */
    private String bz;

    private LocalDateTime lastchanged;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
