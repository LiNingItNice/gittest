package com.xunnan.springboot.supingerp.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
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
public class ErpXtrzb extends Model<ErpXtrzb> {

    private static final long serialVersionUID=1L;

    private String jq;

    private LocalDateTime dt;

    private String czdx;

    private String djmc;

    private String djbh;

    private String cz;

    private String zymc;

    private Integer module;

    private String guid;

    private String ip;

    private String execmodule;

    private String ydjh;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
