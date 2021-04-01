package com.xunnan.springboot.supingerp.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.sql.Blob;
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
public class ErpShangpin extends Model<ErpShangpin> {

    private static final long serialVersionUID=1L;

    /**
     * 商品代码
     */
    @TableId(value = "SPDM", type = IdType.AUTO)
    private String spdm;

    /**
     * 商品名称
     */
    private String spmc;

    /**
     * 助记符
     */
    private String zjf;

    /**
     * 单位名称(关联字典表去拿)
     */
    private String dwmc;

    /**
     * 大类
     */
    private String fjsx1;

    /**
     * 品类
     */
    private String fjsx2;

    /**
     * 子类
     */
    private String fjsx3;

    /**
     * 波段(关联字典表去拿)
     */
    private String fjsx4;

    /**
     * 折扣段(关联字典表去拿)
     */
    private String fjsx5;

    /**
     * 单位(关联字典表去拿)
     */
    private String fjsx6;

    /**
     * 标准进价(成本价)
     */
    private BigDecimal bzjj;

    /**
     * 进价1
     */
    private BigDecimal jj1;

    /**
     * 进价2
     */
    private BigDecimal jj2;

    /**
     * 标准售价(吊牌价)
     */
    private BigDecimal bzsj;

    /**
     * 售价1
     */
    private BigDecimal sj1;

    /**
     * 售价2
     */
    private BigDecimal sj2;

    /**
     * 售价3
     */
    private BigDecimal sj3;

    /**
     * 售价4
     */
    private BigDecimal sj4;

    private String pic;

    private String bzdw;

    private Integer bzsl;

    private String sptm;

    private String bzhu;

    private String tzsy;

    private BigDecimal kcsl;

    private BigDecimal cbje;

    private String byzd1;

    private String byzd2;

    /**
     * 品牌(关联字典表去拿)
     */
    private String byzd3;

    /**
     * 阿里大类
     */
    private String byzd4;

    /**
     * 季节(关联表拿值)
     */
    private String byzd5;

    private String byzd6;

    private String byzd7;

    /**
     * 年份
     */
    private Integer byzd8;

    private Integer byzd9;

    private Integer byzd10;

    private BigDecimal byzd11;

    private BigDecimal byzd12;

    private BigDecimal byzd13;

    private LocalDateTime byzd14;

    private LocalDateTime byzd15;

    private String byzd16;

    private String byzd17;

    private String byzd18;

    private String byzd19;

    private String byzd20;

    private String byzd21;

    private String byzd22;

    private BigDecimal byzd23;

    private BigDecimal byzd24;

    private BigDecimal byzd25;

    /**
     * 主题(关联字典表去拿)
     */
    private String fjsx7;

    /**
     * 设计师(关联字典表去拿)
     */
    private String fjsx8;

    /**
     * 供应商(关联字典表去拿)
     */
    private String fjsx9;

    /**
     * 产地(关联字典表去拿)
     */
    private String fjsx10;

    /**
     * 价格带(关联字典表去拿)
     */
    private String fjsx11;

    /**
     * 款式定义(关联字典表去拿)
     */
    private String fjsx12;

    /**
     * 款式风格(关联字典表去拿)
     */
    private String fjsx13;

    /**
     * 组别(关联字典表去拿)
     */
    private String fjsx14;

    /**
     * 尺码范围(关联字典表去拿)
     */
    private String fjsx15;

    /**
     * 代卖款(关联字典表去拿)
     */
    private String fjsx16;

    private Integer printcount;

    private LocalDateTime printtime;

    @TableField("LastChanged")
    private Blob LastChanged;

    private String online;

    private String qypcgl;

    private String bag;

    private String sybzts;

    private String jsjm;

    @TableField("State")
    private Integer State;

    private BigDecimal weight;

    private String custBanxing;

    private String custKuoxing;

    private String custKuxing;

    private String custQunxing;

    private String custLingxing;

    private String custXiuxing;

    private String custSfps;

    /**
     * 计划上市时间
     */
    private LocalDateTime planTime;

    /**
     * 实际上市时间
     */
    private LocalDateTime actualTime;


    @Override
    protected Serializable pkVal() {
        return this.spdm;
    }

}
