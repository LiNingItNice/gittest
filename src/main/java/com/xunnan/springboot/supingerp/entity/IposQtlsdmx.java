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
 * 终端零售小票单商品明细
 * </p>
 *
 * @author lining
 * @since 2020-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class IposQtlsdmx extends Model<IposQtlsdmx> {

    private static final long serialVersionUID=1L;

    @TableId(value = "Id", type = IdType.AUTO)
    private Long Id;

    private Long pid;

    /**
     * 组织ID
     */
    private Integer orgId;

    /**
     * 终端ID
     */
    private Integer zdId;

    /**
     * 确认标记位：1-已确认 0-未确认
     */
    private Integer qr;

    /**
     * 确认日期
     */
    private Integer qrrq;

    /**
     * VIP卡号
     */
    private String vpdm;

    /**
     * 挂单小票标志位
     */
    private Integer gd;

    /**
     * 作废小票标志位
     */
    private Integer zf;

    private Long djId;

    /**
     * 租户ID
     */
    private Integer tnId;

    /**
     * 导购员ID
     */
    private Integer dgyId;

    /**
     * 让利标志 (1有效)
     */
    private Integer rl;

    /**
     * ?(可能是让利的来源依据,待定)
     */
    private Integer rlcxId;

    /**
     * 商品条码
     */
    private String sptm;

    /**
     * 商品ID
     */
    private Integer spId;

    /**
     * 颜色ID
     */
    private Integer gg1Id;

    /**
     * 尺码ID
     */
    private Integer gg2Id;

    /**
     * 批次ID
     */
    private Integer gg3Id;

    /**
     * 数量
     */
    private Integer sl;

    /**
     * 标准价格
     */
    private BigDecimal bzj;

    /**
     * 参考价
     */
    private BigDecimal ckj;

    /**
     * 实际折扣
     */
    private String zk;

    /**
     * 显示折扣
     */
    private String zk1;

    /**
     * 原始折扣
     */
    private String zk2;

    /**
     * 商品折扣
     */
    private BigDecimal spzk;

    /**
     * 实际单价
     */
    private String dj;

    /**
     * 显示单价
     */
    private String dj1;

    /**
     * 原始单价
     */
    private String dj2;

    /**
     * 商品单价
     */
    private BigDecimal spdj;

    /**
     * 标准金额
     */
    private BigDecimal bzje;

    /**
     * 实际金额
     */
    private String je;

    /**
     * 显示金额
     */
    private String je1;

    /**
     * 原始金额
     */
    private String je2;

    /**
     * 让利金额，供取单时用
     */
    private String jeRl;

    /**
     * 积分倍率
     */
    private BigDecimal jfbl;

    /**
     * 积分金额
     */
    private BigDecimal jfje;

    /**
     * 显示积分金额
     */
    private BigDecimal jfje1;

    /**
     * 赠品 1有效
     */
    private Integer zp;

    /**
     * 整单促销赠品标志
     */
    private Integer zdzp;

    /**
     * 促销 1捆绑有效，2整单有效，3全部有效
     */
    private Integer cx;

    /**
     * 捆绑ID
     */
    private String kbId;

    /**
     * 陈列位置
     */
    private String clwz;

    /**
     * 捆绑商品组(捆绑促销分组唯一标识)
     */
    private String kbspId;

    /**
     * 整单促销ID
     */
    private Integer zdcxId;

    /**
     * 商品状态 0-正常 1-促销 2-换购 3-赠品 4-让利 5-补差优惠 6-VIP叠加优惠 7-生日优惠 8-整单叠加优惠  9-积分换购 11-换货，12-已换货,13-打折券,14-产品定制,15-外卡叠加优惠,16-满购品
     */
    private Integer spStatus;

    /**
     * 促销状态 (用于内部计算)
     */
    private Integer status;

    /**
     * 折扣店员(记录较低折扣下使用签名码的店员ID，与店员表的MID 相关联)
     */
    private Integer zkdyId;

    /**
     * 陈列位置(用于记录所销售商品在店铺里的陈列位置)
     */
    private Integer clId;

    /**
     * 备注
     */
    private String bz;

    private Integer rowNo;

    private Integer alterdate;

    private LocalDateTime lastchanged;

    /**
     * 换购时所使用的积分
     */
    private Integer jf;

    /**
     * 是否是捆绑分级促销，供取单时用;新促销记录：是否手工指定促销方案
     */
    private Integer kbfj;

    private Long thId;

    private Long thMxid;

    /**
     * 退换货最原始明细Id
     */
    private Long thhMxid;

    /**
     * 已退数量
     */
    private Integer thSl;

    /**
     * 终端库位Id
     */
    private Integer kwId;

    /**
     * 商品代码
     */
    private String spdm;

    /**
     * 商品名称
     */
    private String spmc;

    /**
     * 规格1代码
     */
    private String gg1dm;

    /**
     * 规格1名称
     */
    private String gg1mc;

    /**
     * 规格1描述
     */
    private String gg1nt;

    /**
     * 规格2代码
     */
    private String gg2dm;

    /**
     * 规格2名称
     */
    private String gg2mc;

    /**
     * 导购员id字符串，以逗号隔开多个导购员的id
     */
    private String dgyListId;

    /**
     * 默认导购员名称字符串，以逗号隔开多个导购员的名称
     */
    private String dgyListMc;

    /**
     * 导购员权重字符串，以逗号隔开多个导购员的权重
     */
    private String dgyListQz;

    /**
     * 导购员业绩字符串，以逗号隔开多个导购员的业绩
     */
    private String dgyListYj;

    /**
     * 默认导购员代码字符串，以逗号隔开多个导购员的代码
     */
    private String dgyListDm;

    /**
     * 批次代码
     */
    private String gg3dm;

    /**
     * 批次名称
     */
    private String gg3mc;

    /**
     * 单据编号
     */
    private String djh;

    /**
     * 折扣券打折优惠金额
     */
    private BigDecimal dzyhje;

    /**
     * 打折券折扣
     */
    private BigDecimal dzzk;

    /**
     * 打折券卡号
     */
    private String dzbh;

    /**
     * 前台收银时该商品是否手动改过价
     */
    private Integer qtsygj;

    /**
     * 该明细不写入帐表,0表示写入，1表示不写入
     */
    private Integer bcybbtj;

    /**
     * 定制单据号
     */
    private String dzDjh;

    /**
     * 捆绑促销商品描述id，供挂单取单时用;新促销记录：是否捆绑价商品
     */
    private Integer kbcxSpid;

    /**
     * 该商品调价前的价格，供挂单取单时用
     */
    private String ckjI;

    /**
     * 捆绑促销分级让利金额，供挂单取单时使用
     */
    private String kbfjRl;

    /**
     * 品牌ID
     */
    private Integer ppId;

    /**
     * 退换货原因
     */
    private String thhyy;

    /**
     * 实际折扣，精确到8位小数，供挂单取单时用
     */
    private String sjzk;

    /**
     * 挂单取单时用;此商品已经打上捆绑促销标记并且不再参与整单打折;新促销记录：所有能响应的促销信息
     */
    private String kbzddzNo;

    /**
     * 活动代码
     */
    private String hddm;

    /**
     * 活动名称
     */
    private String hdmc;

    /**
     * 扣率
     */
    private BigDecimal kl;

    /**
     * vip限额商品,0不是，1-是
     */
    private Integer vpxe;

    /**
     * 整单促销换购品，供挂单取单时使用
     */
    private Integer zdfjid;

    /**
     * 成本价
     */
    private BigDecimal cbj;

    /**
     * 有效销售数量
     */
    private Integer yxsl;

    /**
     * 是否能用折扣券,0不是，1-是
     */
    private Integer zkqSy;

    /**
     * 挂单取单时用，商品调价状态
     */
    private Integer tj;

    /**
     * 礼品赠送单号
     */
    private Integer gift;

    /**
     * 计税价格
     */
    private BigDecimal jsjg;

    /**
     * 计税金额
     */
    private BigDecimal jishuije;

    /**
     * 有效业绩金额
     */
    private BigDecimal yxyjje;

    /**
     * 订金单号
     */
    private String djdh;

    /**
     * app对应的唯一键(ipos+)
     */
    private String detailIndex;

    /**
     * 改价原因
     */
    private String gjyy;

    /**
     * SKU
     */
    private String sku;

    /**
     * 主管折扣
     */
    private BigDecimal zgzk;

    /**
     * 虚销金额
     */
    private BigDecimal xnje;

    /**
     * 预售数量
     */
    private Integer yssl;

    /**
     * 0可整单退,1可部分退
     */
    private Integer thcl;

    /**
     * qrrq(YYYY-mm-dd)格式
     */
    private String qrrqDate;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
