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
 * 
 * </p>
 *
 * @author lining
 * @since 2020-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ErpSgGatherings extends Model<ErpSgGatherings> {

    private static final long serialVersionUID=1L;

    @TableId(value = "vLBillID", type = IdType.AUTO)
    private String vLBillID;

    @TableField("vMBillID")
    private String vMBillID;

    @TableField("vPFCode")
    private String vPFCode;

    @TableField("vShop")
    private String vShop;

    @TableField("vEmpCode")
    private String vEmpCode;

    @TableField("vStyle")
    private String vStyle;

    @TableField("vColor")
    private String vColor;

    @TableField("vSize")
    private String vSize;

    @TableField("vInvBarCode")
    private String vInvBarCode;

    @TableField("vInvName")
    private String vInvName;

    @TableField("fQuantity")
    private Double fQuantity;

    @TableField("fRebate")
    private Double fRebate;

    @TableField("fRebate1")
    private Double fRebate1;

    @TableField("fPrice")
    private Double fPrice;

    @TableField("fRealPrice")
    private Double fRealPrice;

    @TableField("fMoney")
    private Double fMoney;

    @TableField("fRealMoney")
    private Double fRealMoney;

    @TableField("bSendInv")
    private Integer bSendInv;

    @TableField("bPromote")
    private Integer bPromote;

    @TableField("iPromoteStyle")
    private Integer iPromoteStyle;

    @TableField("iNo")
    private Integer iNo;

    @TableField("vSPBillID")
    private String vSPBillID;

    @TableField("iCBillID")
    private Integer iCBillID;

    @TableField("vOldStyle")
    private String vOldStyle;

    @TableField("vMemo")
    private String vMemo;

    @TableField("bSPrice")
    private Integer bSPrice;

    @TableField("bGiftCard")
    private Integer bGiftCard;

    @TableField("vDefine1")
    private String vDefine1;

    @TableField("vDefine2")
    private String vDefine2;

    @TableField("iDefine3")
    private Integer iDefine3;

    @TableField("fDefine4")
    private Double fDefine4;

    @TableField("fDefine5")
    private Double fDefine5;

    @TableField("bDefine6")
    private Integer bDefine6;

    @TableField("dtDefine7")
    private LocalDateTime dtDefine7;

    @TableField("vCxMode")
    private String vCxMode;

    @TableField("vCxDJBH")
    private String vCxDJBH;

    @TableField("iCxNo")
    private Integer iCxNo;

    @TableField("fOldRealPrice")
    private Double fOldRealPrice;

    @TableField("fOldRebate")
    private Double fOldRebate;

    @TableField("fOldRebate1")
    private Double fOldRebate1;

    @TableField("bVipXyJfFlag")
    private Integer bVipXyJfFlag;

    @TableField("iUsePoints")
    private Double iUsePoints;

    @TableField("bDefinePoints")
    private Integer bDefinePoints;

    @TableField("fPointPrice")
    private Double fPointPrice;

    @TableField("bUsePoints")
    private Integer bUsePoints;

    private String zkdy;

    @TableField("bPointSYSP")
    private Integer bPointSYSP;

    @TableField("bPointHGFS")
    private Integer bPointHGFS;

    @TableField("fOriginPrice")
    private Double fOriginPrice;

    @TableField("UseLQK")
    private String UseLQK;

    @TableField("LQKCard")
    private String LQKCard;

    private String lqkfw;

    private Double lqkxfje1;

    private Double lqkxfje2;

    private Double lqkfsje1;

    private Double lqkfsje2;

    private Double lqkbcje1;

    private Double lqkbcje2;

    private Double lqkbczk1;

    private Double lqkbczk2;

    @TableField("vYGDYZJF")
    private String vYGDYZJF;

    private BigDecimal jsjg;

    private BigDecimal jishuije;

    private BigDecimal yxyjje;

    @TableField("vCxHdMc_iPOS")
    private String vcxhdmcIpos;

    @TableField("vZJF")
    private String vZJF;

    @TableField("vXxj")
    private Double vXxj;

    private String tjsp;

    private Double kl;

    @TableField("spStatus")
    private String spStatus;


    @Override
    protected Serializable pkVal() {
        return this.vLBillID;
    }

}
