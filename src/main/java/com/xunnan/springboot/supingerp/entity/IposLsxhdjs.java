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
 * 终端零售销货单商品结算明细
 * </p>
 *
 * @author lining
 * @since 2020-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class IposLsxhdjs extends Model<IposLsxhdjs> {

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
     * 金额
     */
    private BigDecimal je;

    private Integer rowNo;

    private Integer alterdate;

    private LocalDateTime lastchanged;

    /**
     * GUID字段
     */
    private String gid;

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
     * 单据编号
     */
    private String djh;

    /**
     * 计税价格计算
     */
    private Integer jsjgjs;

    /**
     * 有效业绩计算
     */
    private Integer yxyjjs;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
