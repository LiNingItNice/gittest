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
 * VIP卡类别表
 * </p>
 *
 * @author lining
 * @since 2020-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class IposViplb extends Model<IposViplb> {

    private static final long serialVersionUID=1L;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    private Integer pid;

    /**
     * 租户ID
     */
    private Integer tnId;

    /**
     * 类别代码
     */
    private String lbdm;

    /**
     * 类别名称
     */
    private String lbmc;

    /**
     * 系列ID
     */
    private Integer xlId;

    /**
     * 启用积分 - 开卡时的默认奖励积分
     */
    private Integer qyjf;

    /**
     * 基本金额积分比
     */
    private BigDecimal jfje;

    /**
     * 积分倍率
     */
    private BigDecimal jfbl;

    /**
     * 默认折扣
     */
    private BigDecimal zk;

    /**
     * 默认折上折
     */
    private BigDecimal zk2;

    /**
     * 折上折后最低有效折扣
     */
    private BigDecimal zkMin;

    /**
     * 折上折生效时的最大折扣
     */
    private BigDecimal zkLimit;

    /**
     * 有效期限  单位：月 设置为 0 时则认为无限期
     */
    private Integer yxqx;

    /**
     * 睡眠期限  单位：月 设置为 0 时则认为无限期 指VIP卡长时间不用后自动失效的期限
     */
    private Integer smqx;

    /**
     * 积分期限  单位：月 设置为 0 时则认为无限期 指积分的有效期限
     */
    private Integer jfqx;

    /**
     * 多品牌应用 1有效
     */
    private Integer ppkz;

    /**
     * 停止使用
     */
    private Integer ty;

    /**
     * 可储值卡 1有效
     */
    private Integer czk;

    /**
     * 表达式 0-大于 1-大于等于
     */
    private Integer bds;

    /**
     * 可消费的最低商品折扣 - 允许用卡消费的最低产品折扣
     */
    private BigDecimal spzk;

    /**
     * 补差折扣
     */
    private BigDecimal bczk;

    /**
     * 建档人
     */
    private String jdr;

    /**
     * 建档日期
     */
    private Integer jdrq;

    /**
     * 修改人
     */
    private String xgr;

    /**
     * 修改日期
     */
    private Integer xgrq;

    /**
     * 备注
     */
    private String bz;

    private Integer rowNo;

    private Integer alterdate;

    private LocalDateTime lastchanged;

    /**
     * 系列代码
     */
    private String xldm;

    /**
     * 密码类型:0为无密码，1为固定密码，2为随机密码
     */
    private Integer pwdtype;

    /**
     * 密码详情，若是固定密码，则是密码加密串；若是随机密码，则是密码长度
     */
    private String pwddetail;

    /**
     * 虚拟卡 1-有效
     */
    private Integer xnk;

    /**
     * 启用生日优惠，1-有效
     */
    private Integer sryh;

    /**
     * 折扣优惠方式，0-默认，1-指定折扣
     */
    private Integer yhfsZk;

    /**
     * 生日折扣
     */
    private BigDecimal yhZk;

    /**
     * 积分优惠方式，0-默认，1-指定积分倍率
     */
    private Integer yhfsJf;

    /**
     * 生日积分倍率
     */
    private BigDecimal yhJfbl;

    /**
     * 优惠时段，0-当月，1-当天，2-前后n天
     */
    private Integer yhsd;

    /**
     * 优惠天数(前置)，仅当优惠时段为 2 时有效
     */
    private Integer yhts;

    /**
     * 优惠消费次数，指生日优惠时累计可消费次数，为 0 时表示不控制
     */
    private Integer yhcs;

    /**
     * 优惠消费件数，指生日优惠时累计可消费件数，为 0 时表示不控制
     */
    private Integer yhsl;

    /**
     * 启用积分抵现，1-有效
     */
    private Integer jfdx;

    /**
     * 抵现时最小单位积分
     */
    private Integer dwjf;

    /**
     * 单位积分价值（元）
     */
    private BigDecimal dxbl;

    /**
     * 消费时积分抵现最高使用比例
     */
    private BigDecimal sybl;

    /**
     * 可使用积分抵现方式结算的最低商品折
     */
    private BigDecimal dxzk;

    /**
     * 抵现最小积分
     */
    private Integer zxjf;

    /**
     * 启用节假日积分，1-有效
     */
    private Integer jrjf;

    /**
     * 启用消费后自动延长有效期，1-有效
     */
    private Integer xfyq;

    /**
     * 延期后最大有效期限(月)
     */
    private Integer ycqx;

    /**
     * 启用生日提醒，1-有效
     */
    private Integer srtx;

    /**
     * 生日提醒天数，0表示当日
     */
    private Integer srtxTs;

    /**
     * 启用消费金额提醒，1-有效
     */
    private Integer jetx;

    /**
     * 提醒金额
     */
    private BigDecimal jetxJe;

    /**
     * 启用未消费提醒，1-有效
     */
    private Integer xftx;

    /**
     * 未消费天数，0表示当日
     */
    private Integer xftxTs;

    /**
     * 启用到期提醒，1-有效
     */
    private Integer dqtx;

    /**
     * 到期天数，1-有效
     */
    private Integer dqtxTs;

    /**
     * 启用积分提醒，1-有效
     */
    private Integer jftx;

    /**
     * 积分类型，0-累计积分，1-积分余额
     */
    private Integer jftxLx;

    /**
     * 积分值
     */
    private Integer jftxJf;

    /**
     * 启用分级积分抵现，1-有效
     */
    private Integer fjdx;

    /**
     * 优惠适用范围，0-同折扣适用范围 1-同积分适用范围 2-仅限发卡组织 3-仅限发卡终端
     */
    private Integer yhfw;

    /**
     * 启用按单价分级积分 0-不启用，1-启用
     */
    private Integer djfjjf;

    /**
     * 启用重要顾客提醒，1-有效(平均M个月每月消费N件以上商品)
     */
    private Integer zygktx;

    /**
     * 月数M
     */
    private Integer zygktxYs;

    /**
     * 商品数量N
     */
    private Integer zygktxSl;

    /**
     * 启用日常回访提醒，1-有效(未回访天数大于M天的顾客)
     */
    private Integer rchftx;

    /**
     * 天数M
     */
    private Integer rchftxTs;

    /**
     * 启用大单提醒，1-有效(在L个月内有单次消费M或N件以上商品)
     */
    private Integer ddtx;

    /**
     * 月数L
     */
    private Integer ddtxYs;

    /**
     * 商品数量M
     */
    private Integer ddtxSlm;

    /**
     * 商品数量N
     */
    private Integer ddtxSln;

    /**
     * 启用消费提醒，1-有效(消费过后 L 天或 M 天 或 N 天的顾客)
     */
    private Integer xfgktx;

    /**
     * 天数L
     */
    private Integer xfgktxTsl;

    /**
     * 天数M
     */
    private Integer xfgktxTsm;

    /**
     * 天数n
     */
    private Integer xfgktxTsn;

    /**
     * 开卡后推荐人奖励积分
     */
    private Integer tjrjljf;

    /**
     * 前台消费达标后的提示有效天数，默认为0-长期有效
     */
    private Integer txyxts;

    /**
     * 可打折
     */
    private Integer enaDz;

    /**
     * 可积分
     */
    private Integer enaJf;

    /**
     * 可享受生日优惠
     */
    private Integer enaSryh;

    /**
     * 可积分换购
     */
    private Integer enaJfhg;

    /**
     * 可响应促销活动里的VIP效应
     */
    private Integer enaVpxy;

    /**
     * 可积分抵现
     */
    private Integer enaJfdx;

    /**
     * 级别
     */
    private Integer jibie;

    /**
     * 最大延期月
     */
    private Integer zdyq;

    /**
     * 优惠天数(后置)，仅当优惠时段为 2 时有效
     */
    private Integer yhtsHz;

    /**
     * 启用限额控制：0-不控制，1-控制
     */
    private Integer qyxekz;

    /**
     * 使用会员价：0-不使用，1-使用
     */
    private Integer syhyj;

    /**
     * 优惠消费次数限制
     */
    private Integer yhcsxz;

    /**
     * 优惠消费件数限制
     */
    private Integer yhslxz;

    /**
     * 推荐人奖励积分规则 1-指定奖励积分(需要同时设置tjrjljf)，2-获得被推荐人首单等额积分
     */
    private Integer tjrjlgz;

    /**
     * 0-按月，1-按天
     */
    private Integer ddtxSjlx;

    /**
     * 单张小票最高使用积分 0 不限制
     */
    private Integer xpzdjf;

    /**
     * 启用满额折上折 1 启用
     */
    private Integer qymezsz;

    /**
     * 储值卡消费比例
     */
    private Integer czkXfbl;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
