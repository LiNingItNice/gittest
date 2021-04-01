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
 * 客户档案表(含职能客户定义)
 * </p>
 *
 * @author lining
 * @since 2020-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class IposComBaseKehu extends Model<IposComBaseKehu> {

    private static final long serialVersionUID=1L;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    private Integer pid;

    /**
     * 租户ID
     */
    private Integer tnId;

    /**
     * 树层次
     */
    private Integer layer;

    /**
     * 树结点链
     */
    private String arrange;

    /**
     * 客户代码
     */
    private String khdm;

    /**
     * 客户名称
     */
    private String khmc;

    /**
     * 客户代码2
     */
    private String khdm2;

    /**
     * 客户简称
     */
    private String khjc;

    /**
     * 助记符
     */
    private String zjf;

    /**
     * 上级客户id
     */
    private Integer sjkhId;

    /**
     * 部门编码
     */
    private String dpNo;

    /**
     * 部门名称
     */
    private String dpName;

    /**
     * 区域id
     */
    private Integer qyId;

    /**
     * 关联国家地区id(主要用于后续的国家地区分布销售地图)
     */
    private Integer distId;

    /**
     * 业务性质  1-总部 2-直营 3-加盟
     */
    private Integer ywxz;

    /**
     * 客户性质 	1-总部 2-分公司 3-代理商 4-直营店 5-加盟店
     */
    private Integer xzdm;

    /**
     * 客户类别id
     */
    private Integer lbId;

    /**
     * 客户级别
     */
    private String khjb;

    /**
     * 职能客户id
     */
    private Integer znId;

    /**
     * 职能描述
     */
    private String khzn;

    /**
     * POS类型 0-专卖店 1-店中店 2-商场专柜
     */
    private Integer poslx;

    /**
     * 员工id
     */
    private Integer ygId;

    /**
     * 收货价
     */
    private String jgsd1;

    /**
     * 终端售价
     */
    private String jgsd2;

    /**
     * 销售模式 0-普通 1-委托代销 2-直运销售
     */
    private Integer xsms;

    /**
     * 收货价折扣
     */
    private BigDecimal zk1;

    /**
     * 终端零售价折扣
     */
    private BigDecimal zk2;

    /**
     * 客户属性1id
     */
    private Integer sx1Id;

    /**
     * 客户属性2id
     */
    private Integer sx2Id;

    /**
     * 客户属性3id
     */
    private Integer sx3Id;

    /**
     * 客户属性4id
     */
    private Integer sx4Id;

    /**
     * 客户属性5id
     */
    private Integer sx5Id;

    /**
     * 客户属性6id
     */
    private Integer sx6Id;

    /**
     * 客户属性7id - 备用
     */
    private Integer sx7Id;

    /**
     * 客户属性8id - 备用
     */
    private Integer sx8Id;

    /**
     * 客户属性9id - 备用
     */
    private Integer sx9Id;

    /**
     * 客户属性10id - 备用
     */
    private Integer sx10Id;

    /**
     * 停用
     */
    private Integer ty;

    /**
     * 启用
     */
    private Integer qy;

    /**
     * 结算性质 0-不结算 1-发货结算 2-零售结算
     */
    private Integer jsxz;

    /**
     * 结算方式 0-月末结算 1-指定日结算
     */
    private Integer jsfs;

    /**
     * 制定结算日期
     */
    private Integer jsrq;

    /**
     * 税号
     */
    private Integer sh;

    /**
     * 保证金
     */
    private BigDecimal bzj;

    /**
     * 信用额度
     */
    private BigDecimal xyje;

    /**
     * 信用期限(天数)
     */
    private Integer xyqx;

    /**
     * 扣率
     */
    private BigDecimal kl;

    /**
     * 扣率公式
     */
    private String klgs;

    /**
     * 地址
     */
    private String dz;

    /**
     * 远程标识
     */
    private Integer yc;

    /**
     * 远程停用
     */
    private Integer ycty;

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
     * 手机号
     */
    private String handset;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 邮编
     */
    private String postcode;

    /**
     * email
     */
    private String email;

    /**
     * 地址1
     */
    private String dz1;

    /**
     * 负责人
     */
    private String fzr;

    /**
     * 店铺面积(mm)
     */
    private BigDecimal dpmj;

    /**
     * 员工人数
     */
    private Integer ygrs;

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
     * 备用字段1
     */
    private Integer byzd1;

    /**
     * 备用字段2
     */
    private Integer byzd2;

    /**
     * 备用字段3
     */
    private Integer byzd3;

    /**
     * 备用字段4
     */
    private String byzd4;

    /**
     * 备用字段5
     */
    private String byzd5;

    /**
     * 备用字段6
     */
    private String byzd6;

    /**
     * 备用字段7
     */
    private String byzd7;

    /**
     * 备用字段8
     */
    private String byzd8;

    /**
     * 区域代码
     */
    private String qydm;

    private String sx1dm;

    private String sx2dm;

    private String sx3dm;

    private String sx4dm;

    private String sx5dm;

    private String sx6dm;

    /**
     * 国家ID(标准行政区)
     */
    private Integer countryId;

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
     * GUID字段
     */
    private String gid;

    /**
     * GUID字段
     */
    private String pGid;

    /**
     * 客户名称2
     */
    private String khmc2;

    /**
     *  默认发货仓代码
     */
    private String fhcGid;

    /**
     * 默认中转仓代码
     */
    private String zzcGid;

    /**
     *  默认发货仓id
     */
    private Integer fhcId;

    /**
     * 默认中转仓id
     */
    private Integer zzcId;

    /**
     * 结算币种,关联币种表id
     */
    private Integer bzId;

    /**
     * 默认结算方式,关联结算方式表id
     */
    private Integer mrJsfs;

    /**
     * 启用品牌管理0-不启用，1-启用
     */
    private Integer ppgl;

    /**
     * 指定上级仓库范围标志位，0-不指定；1-指定
     */
    private Integer sjckfw;

    /**
     * 门店不可修改的参数
     */
    private String param1No;

    /**
     * 启用结算方式限制，0-不指定；1-指定
     */
    private Integer jsfskz;

    /**
     * 量体师代码
     */
    private String ltsdm;

    /**
     * 量体师名称
     */
    private String ltsmc;

    /**
     * 会员系列控制0-不启用，1-启用
     */
    private Integer hyxlkz;

    /**
     * 指定退货类型  0-不启用，1-启用
     */
    private Integer zdthlx;

    /**
     * 类别代码
     */
    private String lbdm;

    /**
     * 类别名称
     */
    private String lbmc;

    /**
     * 业务员代码
     */
    private String ywydm;

    /**
     * 发货单价进位处理：0-不处理 1-四舍五入 2-末位舍弃 3-进位处理
     */
    private Integer fhdjjcl;

    /**
     * 发货单价末位处理位：0-元 1-角 2-分
     */
    private Integer fhdjjclw;

    /**
     * 启用阿里云收银0-不启用，1-启用
     */
    private Integer qyaliyun;

    /**
     * 币种代码
     */
    private String bzdm;

    /**
     * 结算代码
     */
    private String jsdm;

    /**
     * 1：未抓取 2:已抓取
     */
    private Integer icrmIsFetch;

    /**
     * 补货线路代码
     */
    private Integer bhlx;

    /**
     * 补货级别
     */
    private String bhjb;

    /**
     * 补货级别名称
     */
    private String bhjbmc;

    /**
     * 是否切换IPOS
     */
    private Integer isQhIpos;

    /**
     * 零售加新增来源类型区别是否为零售  1-零售加，0-erp
     */
    private Integer lylx;

    /**
     * 零售加的门店Id
     */
    private String storeId;

    /**
     * 经度
     */
    private String longitude;

    /**
     * 纬度
     */
    private String latitude;

    /**
     * pos+定时任务管理
     */
    private Integer posCorn;

    /**
     * 时区
     */
    private String timezones;

    /**
     * 找零币种,关联币种表id
     */
    private Integer zlBzId;

    /**
     * 找零币种代码
     */
    private String zlBzdm;

    /**
     * 找零币种名称
     */
    private String zlBzmc;

    /**
     * 订货周期
     */
    private String dhzq;

    /**
     * 订货金额
     */
    private BigDecimal dhje;

    private Integer isBstyle;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
