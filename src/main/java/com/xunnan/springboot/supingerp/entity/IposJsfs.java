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
 * 前台收银结算方式
 * </p>
 *
 * @author lining
 * @since 2020-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class IposJsfs extends Model<IposJsfs> {

    private static final long serialVersionUID=1L;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    private Integer pid;

    /**
     * 租户ID
     */
    private Integer tnId;

    /**
     * 结算代码
     */
    private String jsdm;

    /**
     * 结算名称
     */
    private String jsmc;

    /**
     * 结算类别 0-现金类 1-银行卡类 2-礼券类 3-其他 4-订金
     */
    private Integer jslb;

    /**
     * 找零
     */
    private Integer zl;

    /**
     * 积分
     */
    private Integer jf;

    /**
     * 汇率
     */
    private BigDecimal hl;

    /**
     * 手续费
     */
    private BigDecimal sxf;

    /**
     * 对照码
     */
    private String dzm;

    /**
     * 停用
     */
    private Integer ty;

    /**
     * 快捷键
     */
    private String kjj;

    /**
     * 备注
     */
    private String bz;

    /**
     * 系统默认
     */
    private Integer xtmr;

    private Integer rowNo;

    private Integer alterdate;

    private LocalDateTime lastchanged;

    /**
     * 指定币种,关联ipos_bizhong
     */
    private Integer bzId;

    /**
     * 管理券号
     */
    private Integer glqh;

    /**
     * 储值卡类别
     */
    private Integer czklb;

    /**
     * 收银设备Id
     */
    private Integer wwsbId;

    /**
     * 收银设备代码
     */
    private String wwsbDm;

    /**
     * 收银设备名称
     */
    private String wwsbMc;

    /**
     * 线上支付标志位
     */
    private Integer xszf;

    /**
     * 阿里优惠券
     */
    private Integer alyhq;

    /**
     * 有效业绩计算
     */
    private Integer yxyjjs;

    /**
     * 计税价格计算
     */
    private Integer jsjgjs;

    /**
     * 折让 1 视同折让
     */
    private Integer isdiscount;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
