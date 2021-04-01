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
public class ErpSgGathering extends Model<ErpSgGathering> {

    private static final long serialVersionUID=1L;

    @TableId(value = "vMBillID", type = IdType.AUTO)
    private String vMBillID;

    @TableField("dtDate")
    private LocalDateTime dtDate;

    @TableField("vShop")
    private String vShop;

    @TableField("vPFCode")
    private String vPFCode;

    @TableField("vEmpCode")
    private String vEmpCode;

    @TableField("vSPCode")
    private String vSPCode;

    @TableField("fQuantity")
    private Double fQuantity;

    @TableField("fMoney")
    private Double fMoney;

    @TableField("fRealMoney")
    private Double fRealMoney;

    @TableField("fGetMoney")
    private Double fGetMoney;

    @TableField("fChange")
    private Double fChange;

    @TableField("fCutMoney")
    private Double fCutMoney;

    @TableField("fWRebate")
    private Double fWRebate;

    @TableField("vVIPCard")
    private String vVIPCard;

    @TableField("bPutup")
    private Integer bPutup;

    @TableField("bCancel")
    private Integer bCancel;

    @TableField("bTotal")
    private Integer bTotal;

    @TableField("bExchange")
    private Integer bExchange;

    @TableField("bReturnRate")
    private Integer bReturnRate;

    @TableField("vSPBillID")
    private String vSPBillID;

    @TableField("fOffSetCash")
    private Double fOffSetCash;

    @TableField("vSPosition")
    private String vSPosition;

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

    @TableField("fDefine8")
    private Double fDefine8;

    @TableField("vMemo")
    private String vMemo;

    @TableField("vCustID")
    private String vCustID;

    @TableField("vOrderID")
    private String vOrderID;

    @TableField("vLinkOrder")
    private String vLinkOrder;

    @TableField("bReturn")
    private Integer bReturn;

    @TableField("vLinkDJBH")
    private String vLinkDJBH;

    @TableField("vCxMode")
    private String vCxMode;

    @TableField("fSendCash")
    private Double fSendCash;

    @TableField("iVipPoints")
    private Integer iVipPoints;

    @TableField("iVipUpdateRule")
    private Double iVipUpdateRule;

    @TableField("fVipLimitedMoney")
    private Double fVipLimitedMoney;

    @TableField("PrintNumber")
    private String PrintNumber;

    @TableField("vDefine3")
    private String vDefine3;

    @TableField("vDefine4")
    private String vDefine4;

    @TableField("bCancelText")
    private String bCancelText;

    private String yddjbh;

    private Double djje;

    @TableField("vQDR")
    private String vQDR;

    @TableField("vGKMC")
    private String vGKMC;

    @TableField("vGKSJ")
    private String vGKSJ;

    @TableField("vXSLX")
    private String vXSLX;

    @TableField("vTGDY")
    private String vTGDY;

    @TableField("vYGDYMC")
    private String vYGDYMC;

    @TableField("vYGDYZJF")
    private String vYGDYZJF;

    @TableField("fDQVipLimitedMoney")
    private Double fDQVipLimitedMoney;

    @TableField("vZFR")
    private String vZFR;

    @TableField("vPritCount")
    private Integer vPritCount;

    private BigDecimal jsje;

    private BigDecimal yxyjje;

    @TableField("vYDJH")
    private String vYDJH;

    private String xsdd;

    private String zqbh;

    @TableField("OutTradeNo")
    private String OutTradeNo;


    @Override
    protected Serializable pkVal() {
        return this.vMBillID;
    }

}
