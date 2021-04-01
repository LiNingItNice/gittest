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
 * 顾客资料
 * </p>
 *
 * @author lining
 * @since 2020-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class IposCustomer extends Model<IposCustomer> {

    private static final long serialVersionUID=1L;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    private Integer pid;

    /**
     * 租户ID
     */
    private Integer tnId;

    /**
     * 顾客代码
     */
    private String gkdm;

    /**
     * 顾客名称
     */
    private String gkmc;

    /**
     * 顾客名称2(昵称)
     */
    private String gkmc2;

    /**
     * 区域ID
     */
    private Integer qyId;

    /**
     * 所属组织ID
     */
    private Integer orgId;

    /**
     * 所属终端ID
     */
    private Integer zdId;

    /**
     * 所属会员系列ID
     */
    private Integer xlId;

    /**
     * 店员ID
     */
    private Integer dyId;

    /**
     * VIP会员标志 0-普通顾客 1-待发卡 2-VIP会员
     */
    private Integer vip;

    /**
     * ?
     */
    private Integer uplbId;

    /**
     * ?
     */
    private Integer upje;

    /**
     * 性别 0-男 1-女
     */
    private Integer xb;

    /**
     * 阳历生日
     */
    private Integer sr1;

    /**
     * 阴历生日
     */
    private Integer sr2;

    /**
     * 婚姻状况 0-单身 1-已婚 2-其他
     */
    private Integer maritalstatus;

    /**
     * 结婚日期
     */
    private Integer weddingday;

    /**
     * 身高  单位：cm
     */
    private BigDecimal height;

    /**
     * 体重  单位：kg
     */
    private BigDecimal weight;

    /**
     * 体态特征
     */
    private String mark;

    /**
     * 衣码
     */
    private String size1;

    /**
     * 裤码
     */
    private String size2;

    /**
     * 鞋码
     */
    private String size3;

    /**
     * 地址
     */
    private String dz;

    /**
     * 邮编
     */
    private String yb;

    /**
     * 手机
     */
    private String sj;

    /**
     * 电话
     */
    private String dh;

    /**
     * 证件号码
     */
    private String zjh;

    /**
     * email
     */
    private String email;

    /**
     * qq
     */
    private String qq;

    /**
     * msn
     */
    private String msn;

    /**
     * ww
     */
    private String ww;

    /**
     * 国家地区ID
     */
    private Integer countryId;

    /**
     * 教育程度ID
     */
    private Integer educationId;

    /**
     * 职业ID
     */
    private Integer jobId;

    /**
     * 会员属性1ID集合 取属性的多个ID值，中间以逗号分隔
     */
    private String sx1List;

    /**
     * 会员属性1附加描述
     */
    private String sx1Note;

    /**
     * 会员属性2ID集合 取属性的多个ID值，中间以逗号分隔
     */
    private String sx2List;

    /**
     * 会员属性2附加描述
     */
    private String sx2Note;

    /**
     * 会员属性3ID集合 取属性的多个ID值，中间以逗号分隔
     */
    private String sx3List;

    /**
     * 会员属性3附加描述
     */
    private String sx3Note;

    /**
     * 会员属性4ID集合 取属性的多个ID值，中间以逗号分隔
     */
    private String sx4List;

    /**
     * 会员属性4附加描述
     */
    private String sx4Note;

    /**
     * 会员属性5ID集合 取属性的多个ID值，中间以逗号分隔
     */
    private String sx5List;

    /**
     * 会员属性5附加描述
     */
    private String sx5Note;

    /**
     * 会员属性6ID集合 取属性的多个ID值，中间以逗号分隔
     */
    private String sx6List;

    /**
     * 会员属性6附加描述
     */
    private String sx6Note;

    /**
     * 会员属性7ID集合 取属性的多个ID值，中间以逗号分隔
     */
    private String sx7List;

    /**
     * 会员属性7附加描述
     */
    private String sx7Note;

    /**
     * 会员属性8ID集合 取属性的多个ID值，中间以逗号分隔
     */
    private String sx8List;

    /**
     * 会员属性8附加描述
     */
    private String sx8Note;

    /**
     * 会员属性9ID集合 取属性的多个ID值，中间以逗号分隔
     */
    private String sx9List;

    /**
     * 会员属性9附加描述
     */
    private String sx9Note;

    /**
     * 会员属性10ID集合 取属性的多个ID值，中间以逗号分隔
     */
    private String sx10List;

    /**
     * 会员属性10附加描述
     */
    private String sx10Note;

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
     * 推荐人姓名
     */
    private String tjr;

    /**
     * 推荐人手机
     */
    private String tjrsj;

    /**
     * 启用
     */
    private Integer qy;

    /**
     * 启用日期
     */
    private Integer qyrq;

    /**
     * 停用
     */
    private Integer ty;

    /**
     * 停用日期
     */
    private Integer tyrq;

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
     * 职业代码
     */
    private String jobDm;

    /**
     * 区域代码
     */
    private String qyDm;

    /**
     * 国家地区代码
     */
    private String countryDm;

    /**
     * 终端代码
     */
    private String orgDm;

    /**
     * 组织代码
     */
    private String zdDm;

    /**
     * 教育程度代码
     */
    private String educationDm;

    /**
     * 属性1代码
     */
    private String vpsx1Dm;

    /**
     * 属性2代码
     */
    private String vpsx2Dm;

    /**
     * 属性3代码
     */
    private String vpsx3Dm;

    /**
     * 属性4代码
     */
    private String vpsx4Dm;

    /**
     * 属性5代码
     */
    private String vpsx5Dm;

    /**
     * 属性6代码
     */
    private String vpsx6Dm;

    /**
     * 省份ID(标准行政区)
     */
    private Integer provinceId;

    /**
     * 城市ID(标准行政区)
     */
    private Integer cityId;

    /**
     * 地区ID(标准行政区)
     */
    private Integer districtId;

    /**
     * 不可编辑，新增时固定为ipos 0-ipos 1-openshop 2-taobao 3-paipai 4-dangdang 5-jingdong 13-M6 14-icrm 99-厂家网
     */
    private Integer lylx;

    /**
     * 不可编辑，新增时固定为0
     */
    private Integer sy;

    /**
     * 存档编号
     */
    private String cdbh;

    /**
     * 入会方式 0空值 1一次性入会 2累计入会 3推荐入会 4关系户 5商场会员 6其他 7 天梭
     */
    private Integer rhfs;

    /**
     * 入会日期
     */
    private Integer rhrq;

    /**
     * 奖励 1 表示已经给推荐人奖励积分
     */
    private Integer jl;

    /**
     * 头像文件名
     */
    private String headphoto;

    /**
     * 推荐顾客Id
     */
    private Integer tjgkId;

    /**
     * 回访次数
     */
    private Integer hfcs;

    /**
     * 最近回访日期
     */
    private Integer zjhfrq;

    /**
     * 最近回访人
     */
    private String hfr;

    /**
     * 生日(只保存月份和日期)
     */
    private String birth;

    /**
     * 接待店员
     */
    private String jddy;

    /**
     * 接待店员ID
     */
    private Integer jddyId;

    /**
     * 奖励推荐人积分
     */
    private Integer jltjrjf;

    /**
     * 推荐人卡号
     */
    private String tjrvpdm;

    /**
     * 推荐人单号
     */
    private String tjrxfdh;

    /**
     * 推荐人金额(根据tjrxfdh获取金额)
     */
    private BigDecimal tjrxfje;

    /**
     * 用于记录准会员的消费金额
     */
    private BigDecimal zhyJe;

    /**
     * 用于记录准会员的消费数量
     */
    private Integer zhySl;

    /**
     * 资料完整性
     */
    private Integer zlws;

    /**
     * 是否接收短信
     */
    private Integer jsdx;

    /**
     * 登记组织ID
     */
    private Integer djOrg;

    /**
     * 登记终端ID
     */
    private Integer djZd;

    /**
     * 会员属性1名称集合 取属性的多个名称值，中间以逗号分隔
     */
    private String sx1ListMc;

    /**
     * 会员属性2名称集合 取属性的多个名称值，中间以逗号分隔
     */
    private String sx2ListMc;

    /**
     * 会员属性3名称集合 取属性的多个名称值，中间以逗号分隔
     */
    private String sx3ListMc;

    /**
     * 会员属性4名称集合 取属性的多个名称值，中间以逗号分隔
     */
    private String sx4ListMc;

    /**
     * 会员属性5名称集合 取属性的多个名称值，中间以逗号分隔
     */
    private String sx5ListMc;

    /**
     * 会员属性6名称集合 取属性的多个名称值，中间以逗号分隔
     */
    private String sx6ListMc;

    /**
     * 会员属性7名称集合 取属性的多个名称值，中间以逗号分隔
     */
    private String sx7ListMc;

    /**
     * 会员属性8名称集合 取属性的多个名称值，中间以逗号分隔
     */
    private String sx8ListMc;

    /**
     * 会员属性9名称集合 取属性的多个名称值，中间以逗号分隔
     */
    private String sx9ListMc;

    /**
     * 会员属性10名称集合 取属性的多个名称值，中间以逗号分隔
     */
    private String sx10ListMc;

    /**
     * 证件类型：1-身份证 2-护照 3-台胞证 4-港澳通行证 5-其它
     */
    private Integer zjlx;

    /**
     * 1：未抓取 2:已抓取
     */
    private Integer icrmIsFetch;

    /**
     * 制单人
     */
    private Integer zdr;

    /**
     * 广州凯丽，审核状态,0未审核,1通过,2未通过
     */
    private Integer gzklShzt;

    /**
     * 广州凯丽，未通过原因
     */
    private String gzklShbz;

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
     * 会员属性11ID集合 取属性的多个ID值，中间以逗号分隔
     */
    private String sx11List;

    /**
     * 会员属性11附加描述
     */
    private String sx11Note;

    /**
     * 会员属性11名称集合 取属性的多个名称值，中间以逗号分隔
     */
    private String sx11ListMc;

    /**
     * 会员属性12ID集合 取属性的多个ID值，中间以逗号分隔
     */
    private String sx12List;

    /**
     * 会员属性12附加描述
     */
    private String sx12Note;

    /**
     * 会员属性12名称集合 取属性的多个名称值，中间以逗号分隔
     */
    private String sx12ListMc;

    /**
     * 会员属性13ID集合 取属性的多个ID值，中间以逗号分隔
     */
    private String sx13List;

    /**
     * 会员属性13附加描述
     */
    private String sx13Note;

    /**
     * 会员属性13名称集合 取属性的多个名称值，中间以逗号分隔
     */
    private String sx13ListMc;

    /**
     * 会员属性14ID集合 取属性的多个ID值，中间以逗号分隔
     */
    private String sx14List;

    /**
     * 会员属性14附加描述
     */
    private String sx14Note;

    /**
     * 会员属性14名称集合 取属性的多个名称值，中间以逗号分隔
     */
    private String sx14ListMc;

    /**
     * 会员属性15ID集合 取属性的多个ID值，中间以逗号分隔
     */
    private String sx15List;

    /**
     * 会员属性15附加描述
     */
    private String sx15Note;

    /**
     * 会员属性15名称集合 取属性的多个名称值，中间以逗号分隔
     */
    private String sx15ListMc;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
