package com.xunnan.springboot.supingerp.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 店员档案表
 * </p>
 *
 * @author lining
 * @since 2020-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class IposDianyuan extends Model<IposDianyuan> {

    private static final long serialVersionUID=1L;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    private Integer pid;

    /**
     * 租户ID
     */
    private Integer tnId;

    /**
     * 店员代码
     */
    private String dydm;

    /**
     * 店员名称
     */
    private String dymc;

    /**
     * 性别  0-男 1-女
     */
    private Integer xb;

    /**
     * 生日
     */
    private Integer sr;

    /**
     * 店员类型  0-店长 1-收银员 2-导购员
     */
    private Integer dylx;

    /**
     * 终端ID
     */
    private Integer zdId;

    /**
     * ?
     */
    private Integer zhId;

    /**
     * 停用
     */
    private Integer ty;

    /**
     * 启用
     */
    private Integer qy;

    /**
     * 电话
     */
    private String dh;

    /**
     * 手机
     */
    private String sj;

    /**
     * 地址
     */
    private String dz;

    /**
     * email
     */
    private String email;

    /**
     * 最小折扣
     */
    private String zdzk;

    /**
     * 最大折扣
     */
    private String zgzk;

    /**
     * 签名码
     */
    private String qmm;

    /**
     * 备注
     */
    private String bz;

    /**
     * 系统默认
     */
    private Integer xtmr;

    /**
     * 操作用户代码?
     */
    private String sfNo;

    private Integer rowNo;

    private Integer alterdate;

    private LocalDateTime lastchanged;

    /**
     * 是否被用过，0-没有用过，可以删除，1-已经在小票中存在，不能删除
     */
    private Integer sy;

    /**
     * 默认导购员为1，否则为0
     */
    private Integer mrdgy;

    /**
     * 上传标记
     */
    private Integer up;

    /**
     * 金额最大调整值
     */
    private BigDecimal zdtzz;

    /**
     * 控制金额调整0:代表不控制，1:代表控制
     */
    private Integer zdtzzkz;

    /**
     * 店员对照码,用于erp店员回传
     */
    private String dzm;

    /**
     * 店员级别
     */
    private Integer jbId;

    /**
     * 控制单价调整0:代表不控制，1:代表控制
     */
    private Integer djtzkz;

    /**
     * 单价最大调整值
     */
    private BigDecimal djtzMax;

    /**
     * 单价最小调整值
     */
    private BigDecimal djtzMin;

    /**
     * 终端代码
     */
    private String zddm;

    /**
     * 级别代码
     */
    private String jbdm;

    /**
     * 1：未抓取 2:已抓取
     */
    private Integer icrmIsFetch;

    /**
     * 启用默认收银台
     */
    private Integer qyMrsyt;

    /**
     * 收银台Id号
     */
    private Integer mrsyt;

    /**
     * 库位Id
     */
    private Integer kwId;

    /**
     * 主管 最低折扣
     */
    private BigDecimal zgzdzk;

    /**
     * 主管 最高折扣
     */
    private BigDecimal zgzgzk;

    /**
     * 1 储值卡销售折扣范围有效
     */
    private Integer xszkkz;

    /**
     * 储值卡销售折扣范围 最低折扣
     */
    private BigDecimal xszdzk;

    /**
     * 储值卡销售折扣范围 最高折扣
     */
    private BigDecimal xszgzk;

    /**
     * 签名码修改日期
     */
    private Integer qmxgrq;

    /**
     * 零售+店员
     */
    private String employeeNum;

    /**
     * 天梭导购Id
     */
    private String passportEmployeeId;

    /**
     * 取消签名码
     */
    private Integer qxqmm;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
