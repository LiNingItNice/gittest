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
 * 终端零售退货单
 * </p>
 *
 * @author lining
 * @since 2020-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class IposLsthd extends Model<IposLsthd> {

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
     * 组织ID
     */
    private Integer orgId;

    /**
     * 终端ID
     */
    private Integer zdId;

    /**
     * 整单数量
     */
    private Integer sl;

    /**
     * 备用数量1
     */
    private Integer sl1;

    /**
     * 备用数量2
     */
    private Integer sl2;

    /**
     * 备用数量3
     */
    private Integer sl3;

    /**
     * 整单金额
     */
    private BigDecimal je;

    /**
     * 备用金额1
     */
    private BigDecimal je1;

    /**
     * 备用金额2
     */
    private BigDecimal je2;

    /**
     * 备用金额3
     */
    private BigDecimal je3;

    /**
     * 确认标志 制单方向为总部时，确认标志反馈回总部
     */
    private Integer qr;

    /**
     * 确认日期 制单方向为终端时，确认标志反馈回终端
     */
    private Integer qrrq;

    /**
     * 提交标志
     */
    private Integer tj;

    /**
     * 提交日期
     */
    private Integer tjrq;

    /**
     * 制单方向 0-总部制单 1-终端制单
     */
    private Integer zdfx;

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

    private Integer rowNo;

    private Integer alterdate;

    private LocalDateTime lastchanged;

    /**
     * GUID字段
     */
    private String gid;

    /**
     * 终端库位Id
     */
    private Integer kwId;

    /**
     * 终端代码
     */
    private String zddm;

    /**
     * 终端名称
     */
    private String zdmc;

    /**
     * 计税金额
     */
    private BigDecimal jsje;

    /**
     * 有效业绩金额
     */
    private BigDecimal yxyjje;

    /**
     * 按品牌日结，需要记录pp_id
     */
    private Integer ppId;

    /**
     * 品牌代码
     */
    private String ppdm;

    /**
     * 品牌名称
     */
    private String ppmc;

    /**
     * 来源系统 -1-ipos非网络订单 0-iPOS、1-EC、2-Retail、3-ERP、4-M6
     */
    private Integer lyxt;

    /**
     * 销售类型默认0
     */
    private Integer xslx;

    /**
     * 打印次数
     */
    private Integer dycs;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
