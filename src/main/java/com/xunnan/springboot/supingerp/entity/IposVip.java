package com.xunnan.springboot.supingerp.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * VIP卡资料表
 * </p>
 *
 * @author lining
 * @since 2020-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class IposVip extends Model<IposVip> {

    private static final long serialVersionUID=1L;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    private Integer pid;

    /**
     * 租户ID
     */
    private Integer tnId;

    /**
     * 卡号
     */
    private String vpdm;

    /**
     * 会员名称
     */
    private String vpmc;

    /**
     * 系列ID
     */
    private Integer xlId;

    /**
     * VIP类别ID
     */
    private Integer lbId;

    /**
     * 顾客ID
     */
    private Integer gkId;

    /**
     * 发卡组织ID
     */
    private Integer orgId;

    /**
     * 发卡终端ID
     */
    private Integer zdId;

    /**
     * 适用范围 0-全部 1-按组织机构 2-按终端
     */
    private Integer syfw;

    /**
     * VIP卡状态 0-未启用 1-正常 2-停用,4-挂失,5-休眠
     */
    private Integer status;

    /**
     * 启用  即开卡
     */
    private Integer qy;

    /**
     * 启用日期
     */
    private Integer qyrq;

    /**
     * 到期日期 即失效日期 默认根据其卡类别的有效期限计算而来 当其卡类别中设置了睡眠期限，则要在每次发生消费后更新该失效日期
     */
    private Integer yxrq;

    /**
     * 停止使用
     */
    private Integer ty;

    /**
     * 停用日期
     */
    private Integer tyrq;

    /**
     * 换卡类型 0 升级换卡 1 挂失换卡 2 过期换卡 9 其他
     */
    private Integer hklx;

    /**
     * 换卡标志
     */
    private Integer hk;

    /**
     * 换卡日期
     */
    private Integer hkrq;

    /**
     * 挂失标志
     */
    private Integer gs;

    /**
     * 挂失日期
     */
    private Integer gsrq;

    /**
     * 唤醒
     */
    private Integer hx;

    /**
     * 唤醒日期
     */
    private Integer hxrq;

    /**
     * 休眠
     */
    private Integer xm;

    /**
     * 休眠日期
     */
    private Integer xmrq;

    /**
     * 新卡ID
     */
    private Integer vpId2;

    /**
     * 首次消费日期
     */
    private Integer scrq;

    /**
     * 首次消费数量
     */
    private Integer scsl;

    /**
     * 首次消费金额
     */
    private BigDecimal scje;

    /**
     * 首次消费关联小票单号
     */
    private String scdh;

    /**
     * 累计消费次数
     */
    private Integer xfcs;

    /**
     * 累计消费数量
     */
    private Integer xfsl;

    /**
     * 累计消费金额
     */
    private BigDecimal xfje;

    /**
     * 累计优惠金额
     */
    private BigDecimal yhje;

    /**
     * 累计消费积分
     */
    private Integer xfjf;

    /**
     * 兑换积分
     */
    private Integer dhjf;

    /**
     * 积分余额(当前积分)
     */
    private Integer dqjf;

    /**
     * 最近消费日
     */
    private Integer zjrq;

    /**
     * 最近消费数量
     */
    private Integer zjsl;

    /**
     * 最近消费金额
     */
    private BigDecimal zjje;

    /**
     * 赠予金额
     */
    private BigDecimal zyje;

    /**
     * 赠予积分
     */
    private Integer zyjf;

    private String password;

    /**
     * 储值卡余额 (系统自动回写，不可编辑)
     */
    private BigDecimal czDqje;

    /**
     * 储值卡余额有效期 (系统自动回写，不可编辑)
     */
    private Integer czYxrq;

    /**
     * 储值卡累计充值金额 (系统自动回写，不可编辑)
     */
    private BigDecimal czCzje;

    /**
     * 储值卡最近充值日期 (系统自动回写，不可编辑)
     */
    private Integer czCzrq;

    /**
     * 储值卡累计消费金额 (系统自动回写，不可编辑)
     */
    private BigDecimal czXfje;

    /**
     * 储值卡累计消费数量 (系统自动回写，不可编辑)
     */
    private Integer czXfsl;

    /**
     * 储值卡最近充值金额 (系统自动回写，不可编辑)
     */
    private BigDecimal czZcje;

    /**
     * 储值卡最近消费日期(系统自动回写，不可编辑)
     */
    private Integer czXfrq;

    /**
     * 储值卡最近消费金额(系统自动回写，不可编辑)
     */
    private BigDecimal czZxje;

    /**
     * 储值卡最近消费数量(系统自动回写，不可编辑)
     */
    private Integer czZxsl;

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
     * 类别代码
     */
    private String lbdm;

    /**
     * 系列代码
     */
    private String xldm;

    /**
     * 终端代码
     */
    private String orgdm;

    /**
     * 组织代码
     */
    private String zddm;

    /**
     * 顾客代码
     */
    private String gkdm;

    /**
     * 来源类型 0-ipos 1-openshop 2-taobao 3-paipai 4-dangdang 5-jingdong 6-erp 13-M6 99-厂家网
     */
    private Integer lylx;

    /**
     * 发卡类型id,关联ipos_vpfklx表
     */
    private Integer fklxId;

    /**
     * 0-同折扣适用范围；1-按组织机构；2-按终端
     */
    private Integer jfsyfw;

    /**
     * 手机
     */
    private String sj;

    /**
     * 阳历生日
     */
    private String sr1;

    /**
     * 存档编号
     */
    private String cdbh;

    /**
     * 锁定积分
     */
    private Integer sdjf;

    /**
     * 生日(只保存月份和日期)
     */
    private String birth;

    /**
     * 预处理标记0-没有预处理，1-预停用，2-预升级，3-预休眠
     */
    private Integer tktx;

    /**
     * 经手店员
     */
    private Integer jsdy;

    /**
     * 所属终端ID
     */
    private Integer sszdId;

    /**
     * 开卡品牌
     */
    private Integer ppId;

    /**
     * 所属组织ID
     */
    private Integer ssorgId;

    /**
     * 特殊日期
     */
    private Integer sr2;

    /**
     * 充值折扣
     */
    private BigDecimal zk;

    /**
     * 1：未抓取 2:已抓取
     */
    private Integer icrmIsFetch;

    /**
     * 制单人
     */
    private Integer zdr;

    /**
     * 降级检测时间
     */
    private Integer degradeCheckrq;

    /**
     * 状态备注
     */
    private String ztbz;

    /**
     * 充值范围 0-全部 1-同投放终端 2-同折扣适用范围 3-按组织机构 4-按终端 5-同积分适用范围 6-同所属组织 7-同所属终端
     */
    private Integer czfw;

    /**
     * 原手机号
     */
    private String ysj;

    /**
     * crm的会员id
     */
    private String crmId;

    /**
     * FirstName
     */
    @TableField("FirstName")
    private String FirstName;

    /**
     * LastName
     */
    @TableField("LastName")
    private String LastName;

    /**
     * OtherName
     */
    @TableField("OtherName")
    private String OtherName;

    /**
     * FullName
     */
    @TableField("FullName")
    private String FullName;

    /**
     * 变现金额
     */
    private BigDecimal bxje;

    /**
     * 会员通混淆手机号加密结果为MD5(MD5("tmall"+$content+$key))
     */
    private String passportMixMobile;

    /**
     * 是否绑定passport,0：否，1:是
     */
    private Integer passportIsBind;

    /**
     * 会员绑定的商户品牌
     */
    private String passportSellerName;

    private Integer versions;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
