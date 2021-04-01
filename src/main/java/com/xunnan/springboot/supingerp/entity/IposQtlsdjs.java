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
 * 终端零售小票结算明细
 * </p>
 *
 * @author lining
 * @since 2020-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class IposQtlsdjs extends Model<IposQtlsdjs> {

    private static final long serialVersionUID=1L;

    @TableId(value = "Id", type = IdType.AUTO)
    private Long Id;

    private Long pid;

    /**
     * 租户ID
     */
    private Integer tnId;

    /**
     * 结算ID
     */
    private Integer jsId;

    /**
     * 代码
     */
    private String dm;

    /**
     * 金额
     */
    private BigDecimal je;

    /**
     * 关联资金账户ID
     */
    private Integer zhId;

    /**
     * 备注
     */
    private String bz;

    private Integer rowNo;

    private Integer alterdate;

    private LocalDateTime lastchanged;

    /**
     * 使用积分
     */
    private Integer jf;

    /**
     * 店铺结算币id
     */
    private Integer bzId;

    /**
     * 汇率
     */
    private String hl;

    /**
     * 外币金额
     */
    private String wbJe;

    /**
     * 汇差金额
     */
    private String hcJe;

    /**
     * 外币币种id
     */
    private Integer wbId;

    /**
     * 实收金额
     */
    private String ssJe;

    /**
     * 单据编号
     */
    private String djh;

    /**
     * 退款金额
     */
    private BigDecimal tkJe;

    /**
     * 订金结算金额
     */
    private BigDecimal djJe;

    /**
     * 收银机流水号 撤消时使用
     */
    @TableField("cashTraceNo")
    private String cashTraceNo;

    /**
     * 系统参照号 退货时使用
     */
    @TableField("sysRefNo")
    private String sysRefNo;

    /**
     * 手续费
     */
    private BigDecimal sxf;

    /**
     * 计税价格计算
     */
    private Integer jsjgjs;

    /**
     * 有效业绩计算
     */
    private Integer yxyjjs;

    /**
     * 1：未抓取 2:已抓取
     */
    private Integer icrmIsFetch;

    /**
     * 外币实收金额
     */
    private BigDecimal wbssJe;

    /**
     * 外币找零金额
     */
    private BigDecimal wbzlJe;

    /**
     * 本位币找零金额
     */
    private BigDecimal bwbzlJe;

    /**
     * 充值折扣
     */
    private BigDecimal czzk;

    /**
     * 类型 0 正常 1 由订金单结算方式带入
     */
    private Integer tp;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
