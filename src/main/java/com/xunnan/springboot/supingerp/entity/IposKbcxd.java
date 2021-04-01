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
 * 捆绑促销单
 * </p>
 *
 * @author lining
 * @since 2020-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class IposKbcxd extends Model<IposKbcxd> {

    private static final long serialVersionUID=1L;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    private Integer pid;

    /**
     * 租户ID
     */
    private Integer tnId;

    /**
     * 单据编号
     */
    private String djbh;

    /**
     * 原单据号
     */
    private String ydjh;

    /**
     * 日期
     */
    private Integer rq;

    /**
     * 上级组织ID
     */
    private Integer orgId;

    /**
     * 上级组织代码
     */
    private String orgdm;

    /**
     * 上级组织名称
     */
    private String orgmc;

    /**
     * 活动名称
     */
    private String hdmc;

    /**
     * 活动开始日期
     */
    private Integer rq1;

    /**
     * 活动结束日期
     */
    private Integer rq2;

    /**
     * 促销类型 0-折扣 1-捆绑价 2-优惠价
     */
    private Integer cxlx;

    /**
     * 默认值
     */
    private BigDecimal mrz;

    /**
     * 分级促销 1有效
     */
    private Integer fjcx;

    /**
     * 促销对象(适用范围) 0-通用 1-VIP卡不参加活动 2-仅适用于VIP会员
     */
    private Integer cxdx;

    /**
     * 调价控制 1有效
     */
    private Integer tjkz;

    private Integer kbsl;

    /**
     * 捆绑方式 0-任意捆绑 1-不同商品范围捆绑 2-同款商品捆绑
     */
    private Integer kbfs;

    private Integer zpsl;

    /**
     * 时段约束控制 1有效
     */
    private Integer sdkz;

    /**
     * 开始时段
     */
    private Integer tm1;

    /**
     * 结束时段
     */
    private Integer tm2;

    /**
     * 促销日控制 1有效
     */
    private Integer cxrkz;

    /**
     * 促销日
     */
    private String cxr;

    /**
     * 审批
     */
    private Integer sp;

    /**
     * 审批人
     */
    private String spr;

    /**
     * 审批日期
     */
    private Integer sprq;

    /**
     * 终止
     */
    private Integer zz;

    /**
     * 终止人
     */
    private String zzr;

    /**
     * 终止日期
     */
    private Integer zzrq;

    /**
     * 终止备注
     */
    private String zzbz;

    /**
     * 制单人
     */
    private String zdr;

    /**
     * 制单日期
     */
    private Integer zdrq;

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
     * 优先级0-9,0优先级最高
     */
    private Integer level;

    /**
     * 结算方式
     */
    private Integer jsxz;

    /**
     * 图片地址
     */
    private String html;

    /**
     * 买高赠低
     */
    private Integer mgzd;

    /**
     * 调价商品参与促销
     */
    private Integer tjcx;

    /**
     * 与整单促销叠加 0-不叠加，1-叠加
     */
    private Integer dj;

    /**
     * 允许按sku设置促销品
     */
    private Integer spSku;

    /**
     * 优先级0-9,0优先级最高
     */
    private Integer level0;

    /**
     * 积分倍率是否继承 0-不继承 1-继承
     */
    private Integer jfblJc;

    /**
     * 允许使用折扣券
     */
    private Integer yxzkq;

    /**
     * 商品促销折扣有效,默认为0
     */
    private Integer cxzkYx;

    /**
     * 外卡折扣有效，废除
     */
    private Integer wkzkYx;

    /**
     * 促销适用对象，逗号隔开：1-普通顾客，2-VIP会员，3-外卡会员
     */
    private String sydx;

    /**
     * 分级让利
     */
    private Integer fjrl;

    /**
     * 参考价下拉框选项：0-标准售价、1-售价1、2-售价2、3-售价3、4-售价4，默认为标准售价
     */
    private Integer ckjtype;

    /**
     * 调折商品参与促销
     */
    private Integer tzspcx;

    /**
     * 捆绑促销商品不参与整单打折
     */
    private Integer bcyzddz;

    /**
     * 扣率调整
     */
    private Integer kltz;

    /**
     * 限额卡不参与促销
     */
    private Integer xebcycx;

    /**
     * 允许退换货
     */
    private Integer yxthh;

    /**
     * 0-设置低价品价格,1-设置低价品折扣
     */
    private Integer mgzdspsz;

    /**
     * 低价品价格/低价品折扣
     */
    private BigDecimal mgzdspjg;

    /**
     * 促销活动分组id
     */
    private Integer cxhdzId;

    /**
     * VIP会员使用会员价
     */
    private Integer viphyj;

    /**
     * 自动响应促销
     */
    private Integer zdxycx;

    /**
     * 具体VIP卡
     */
    private Integer jtvip;

    /**
     * 分级折扣可循环
     */
    private Integer fjzkKxh;

    /**
     * 分级折扣
     */
    private Integer fjzk;

    /**
     * 默认折扣
     */
    private String mrzk;

    /**
     * 换购条件
     */
    private Integer hgtj;

    /**
     * 0-应用促销后商品金额，1-促销商品标准金额
     */
    private Integer hgtj1;

    /**
     * 0:>=，1:>
     */
    private Integer hgtj2;

    /**
     * 换购金额
     */
    private BigDecimal hgje;

    /**
     * 1：未抓取 2:已抓取
     */
    private Integer icrmIsFetch;

    /**
     * 是否需要激活码
     */
    private Integer isNeedJhm;

    /**
     * 促销价格继承
     */
    private Integer cxjgjc;

    /**
     * VIP效应中的卡类别可响应促销
     */
    private Integer vplbxycx;

    /**
     * 激活码值
     */
    private String jhmValue;

    /**
     * 套餐促销标记
     */
    private Integer isTccx;

    /**
     * 允许叠加
     */
    private Integer isYxdj;

    /**
     * 1 整单退
     */
    private Integer yxthhZd;

    /**
     * 换购品允许使用折扣券
     */
    private Integer hgpYxzkq;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
