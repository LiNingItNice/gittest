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
 * 终端每日销售记录表
 * </p>
 *
 * @author lining
 * @since 2020-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class IposXsjlb extends Model<IposXsjlb> {

    private static final long serialVersionUID=1L;

    @TableId(value = "Id", type = IdType.AUTO)
    private Long Id;

    private Long pid;

    /**
     * 租户ID
     */
    private Integer tnId;

    /**
     * 终端ID
     */
    private Integer zdId;

    /**
     * 营业日期
     */
    private Integer rq;

    /**
     * 最新操作时间
     */
    private Integer czrq;

    /**
     * 开始营业时间
     */
    private Integer rqS;

    /**
     * 结束营业时间
     */
    private Integer rqE;

    /**
     * 当前营业状态：0-未营业、 1-营业中、 2-营业结束
     */
    private Integer yyzt;

    /**
     * 销售日结标志
     */
    private Integer rj;

    /**
     * 平均气温(℃)
     */
    private BigDecimal qw;

    /**
     * 天气
     */
    private String tq;

    /**
     * 当日销售数
     */
    private Integer xssl;

    /**
     * 当日销售额
     */
    private BigDecimal xsje;

    /**
     * 零售金额(不包括退货)
     */
    private BigDecimal lsje;

    /**
     * 当日零退数
     */
    private Integer ltsl;

    /**
     * 当日零退额
     */
    private BigDecimal ltje;

    /**
     * 来客数
     */
    private Integer gksl;

    /**
     * 成交笔数
     */
    private Integer xpsl;

    /**
     * 销售连带率
     */
    private BigDecimal ldl;

    /**
     * 客单价
     */
    private BigDecimal gkdj;

    /**
     * 当日新增顾客数
     */
    private Integer xzgk;

    /**
     * 当日VIP开卡数
     */
    private Integer xzvp;

    /**
     * VIP消费额
     */
    private BigDecimal vpje;

    /**
     * VIP消费占比
     */
    private BigDecimal vpbl;

    /**
     * VIP销售连带率
     */
    private BigDecimal vpldl;

    /**
     * VIP客单价
     */
    private BigDecimal vpdj;

    /**
     * 前日结存数
     */
    private Integer qcsl;

    /**
     * 当日结存数
     */
    private Integer qmsl;

    /**
     * 当日入库数
     */
    private Integer jhsl;

    /**
     * 当日退仓数
     */
    private Integer thsl;

    /**
     * 当日横调入数
     */
    private Integer drsl;

    /**
     * 当日横调出数
     */
    private Integer dcsl;

    /**
     * 当日店长工作小结
     */
    private String note;

    private Integer rowNo;

    private Integer alterdate;

    private LocalDateTime lastchanged;

    /**
     * 天气类型,包括：0 - 晴,1 - 阴,2 - 多云,3 - 雨,4 - 阵雨,5 - 雪
     */
    private Integer tqlx;

    /**
     * 营业当天默认的库位id
     */
    private Integer kwId;

    /**
     * 标准金额
     */
    private BigDecimal bzje;

    /**
     * 试戴数
     */
    private Integer trynum;

    /**
     * VIP客单数
     */
    private Integer xpslVp;

    /**
     * VIP零售数量
     */
    private Integer lsslVp;

    /**
     * VIP零售金额
     */
    private BigDecimal lsjeVp;

    /**
     * VIP零退数量
     */
    private Integer ltslVp;

    /**
     * VIP零退金额
     */
    private BigDecimal ltjeVp;

    /**
     * 有效小票
     */
    private Integer yxxp;

    /**
     * 有效销售数量
     */
    private Integer yxsl;

    /**
     * icrm 1：未抓取 2:已抓取
     */
    private Integer icrmIsFetch;

    /**
     * 有效业绩金额
     */
    private BigDecimal yxyjje;

    /**
     * rq转yyyy-mm-dd
     */
    private String rqDate;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
