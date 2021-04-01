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
 * 终端零售小票单
 * </p>
 *
 * @author lining
 * @since 2020-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class IposQtlsd extends Model<IposQtlsd> {

    private static final long serialVersionUID=1L;

    @TableId(value = "Id", type = IdType.AUTO)
    private Long Id;

    private Long pid;

    private Long tnId;

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
     * 营业日期
     */
    private Integer yyrq;

    /**
     * 组织ID
     */
    private Integer orgId;

    /**
     * 终端ID
     */
    private Integer zdId;

    /**
     * 收银台ID
     */
    private Integer sytId;

    /**
     * 收银台编号
     */
    private String sytdm;

    /**
     * 收银员ID
     */
    private Integer syyId;

    /**
     * 导购员ID
     */
    private Integer dgyId;

    /**
     * 顾客编号
     */
    private String gkdm;

    /**
     * VIP卡号
     */
    private String vpdm;

    /**
     * 整单数量
     */
    private Integer sl;

    /**
     * 促销商品数量
     */
    private Integer cxsl;

    /**
     * 整单金额
     */
    private BigDecimal je;

    /**
     * 标准金额
     */
    private BigDecimal bzje;

    /**
     * 抹零金额
     */
    private BigDecimal mlje;

    /**
     * 收款金额
     */
    private BigDecimal skje;

    /**
     * 找零金额
     */
    private BigDecimal zlje;

    /**
     * 让利金额
     */
    private BigDecimal rlje;

    /**
     * 优惠金额
     */
    private BigDecimal yhje;

    /**
     * 礼券金额
     */
    private BigDecimal lqje;

    /**
     * 单笔小票所获得的积分值
     */
    private Integer jf;

    /**
     * 积分金额
     */
    private BigDecimal jfje;

    /**
     * 积分金额2?
     */
    private BigDecimal jfje1;

    /**
     * 折扣
     */
    private BigDecimal zk;

    /**
     * 店铺督导id，关联【ipos_yuangong】表的id
     */
    private Integer ygId;

    /**
     * 活动扣率id，关联表【ipos_zdklb】的 id
     */
    private Integer klId;

    /**
     * 扣率
     */
    private BigDecimal kl;

    /**
     * 挂单 1有效
     */
    private Integer gd;

    /**
     * 作废 1有效
     */
    private Integer zf;

    /**
     * 汇总 1有效
     */
    private Integer hz;

    /**
     * 日结的时间
     */
    private Integer hzsj;

    /**
     * 退货 1有效
     */
    private Integer th;

    /**
     * 提交标志
     */
    private Integer tj;

    /**
     * 提交日期
     */
    private Integer tjrq;

    /**
     * 制单人
     */
    private String zdr;

    /**
     * 制单日期
     */
    private Integer zdrq;

    /**
     * 备注
     */
    private String bz;

    /**
     * 小票结算唯一值，用于记录判断是否是重复录入单据
     */
    private String rowNo;

    private Integer alterdate;

    private LocalDateTime lastchanged;

    /**
     * 单笔小票所使用的兑换
     */
    private Integer dhjf;

    /**
     * 生日优惠数量
     */
    private Integer sryhsl;

    /**
     * 积分换购数量
     */
    private Integer jfhgsl;

    /**
     * 终端库位Id
     */
    private Integer kwId;

    /**
     * 商场卡号
     */
    private String sckh;

    /**
     * 商场折扣
     */
    private BigDecimal sczk;

    /**
     * 商场让利金额
     */
    private BigDecimal jeScrl;

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
     * 默认导购员代码字符串，以逗号隔开多个导购员的代码
     */
    private String dgyListDm;

    /**
     * 顾客名称
     */
    private String gkmc;

    /**
     * 抵现积分
     */
    private String dxjf;

    /**
     * 离线单据提交标记
     */
    private Integer up;

    /**
     * 前台小票打印次数
     */
    private Integer dycs;

    /**
     * 销售类型默认0
     */
    private Integer xslx;

    /**
     * 零售销货单单据编号
     */
    private String lsdh;

    /**
     * 零售退货单单据编号
     */
    private String ltdh;

    /**
     * 终端代码
     */
    private String zddm;

    /**
     * 终端名称
     */
    private String zdmc;

    /**
     * 存储满购整单id，供取单使用
     */
    private Integer zdcxId;

    /**
     * 满购标记，供取单使用
     */
    private Integer mgTj;

    /**
     * 存储满购金额，供取单使用
     */
    private String mgJe;

    /**
     * 存储赠券金额，供取单使用
     */
    private String zqJe;

    /**
     * 外卡卡号
     */
    private String wkkh;

    /**
     * 外卡折扣
     */
    private String wkzk;

    /**
     * 外卡能否与vip叠加使用
     */
    private Integer yxdjsy;

    /**
     * VIP卡号ID
     */
    private Integer vpId;

    /**
     * VIP系列ID
     */
    private Integer vpxlId;

    /**
     * VIP类别ID
     */
    private Integer vplbId;

    /**
     * 外卡类别ID
     */
    private Integer wklbId;

    /**
     * vip限额数量
     */
    private Integer vpxesl;

    /**
     * 1：未抓取 2:已抓取
     */
    private Integer icrmIsFetch;

    /**
     * 网络订单ID
     */
    private Integer webId;

    /**
     * 连带率计算小票是否有效:1-有效
     */
    private Integer xpyx;

    /**
     * 小票有效数量
     */
    private Integer yxsl;

    /**
     * 快递公司ID
     */
    private Integer shippingId;

    /**
     * 快递公司名称
     */
    private String shippingName;

    /**
     * 快递单号
     */
    private String shippingSn;

    /**
     * 来源系统 -1-ipos非网络订单 0-iPOS、1-EC、2-Retail、3-ERP、4-M6 99-趣搭魔镜
     */
    private Integer lyxt;

    /**
     * 网络订单单号
     */
    private String wlddBh;

    /**
     * 借卡卡号
     */
    private String jkVpdm;

    /**
     * 借卡卡类别
     */
    private Integer jkVplbId;

    /**
     * 计税金额
     */
    private BigDecimal jsje;

    /**
     * 有效业绩金额
     */
    private BigDecimal yxyjje;

    /**
     * 记录推荐人VIP卡的卡号
     */
    private String tjr;

    /**
     * 记录本次消费的推荐人可以返现的金额
     */
    private BigDecimal fxje;

    /**
     * 记录本次消费的推荐人可以返现的积分
     */
    private Integer fxjf;

    /**
     * 记录本次消费是否已经返现
     */
    private Integer isfx;

    /**
     * 安全码
     */
    private String aqm;

    /**
     * pos+设备编号
     */
    private String deviceSn;

    /**
     * 趣搭魔镜1：未抓取 2:已抓取
     */
    private Integer qdmjIsFetch;

    /**
     * 现金券卡号，扣除现金券金额时才有效
     */
    private String xjqbh;

    /**
     * 现金券优惠金额，扣除现金券金额时才有效
     */
    private BigDecimal xjqje;

    /**
     * 更次
     */
    private Integer gc;

    /**
     * 主管折扣
     */
    private BigDecimal zgzk;

    /**
     * 积分抵现金额
     */
    private BigDecimal jfdxje;

    /**
     * 员工工号
     */
    private String ygCode;

    /**
     * 主管折扣的店员代码
     */
    private String zgzkdyDm;

    /**
     * 虚销金额
     */
    private BigDecimal xnje;

    /**
     * 预售订单
     */
    private Integer ysdd;

    /**
     * 预售订单取货完成
     */
    private Integer ysqh;

    /**
     * 会员搜索关键字
     */
    private String vpSearchKeyword;

    /**
     * 是否赊销订单 
     */
    private Integer isSx;

    /**
     * 老佛爷小票单拆分标识: 0-未拆分; 1-已拆分; 2-无需拆分(例如:拆分出来的子单); 
     */
    private Integer cfFlag;

    /**
     * icrm生日优惠code_id
     */
    private String icrmFavourCode;

    /**
     * 是否推送到小票助手，0：未推送，1：推送成功
     */
    private Integer xpzsIsFetch;

    /**
     * 赊销单是否还款 0未还款  1已经还款
     */
    private Integer isSxClean;

    /**
     * 状态码 0(0000 0000) 默认; 1(0000 00001) 已上传北鼎; 2(0000 00010) 北鼎扣减抵现积分;
     */
    private Integer statusCode;

    /**
     * 下单门店代码
     */
    private String xdmd;

    /**
     * 下单门店名称
     */
    private String xdmdmc;

    /**
     * 下单门店id
     */
    private Integer xdmdid;

    private Boolean ispost;

    /**
     * rq转日期(yyyy-mm-dd)
     */
    private String rqDate;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
