package com.xunnan.springboot.config.security.validate;

import lombok.Data;

import java.awt.image.BufferedImage;
import java.time.LocalDateTime;

/**
 * 验证码信息类
 * @author lining
 * @date 2020/12/17 - 17:11
 */
@Data
public class ImageCode {

    /**
     * 图片
     */
    private BufferedImage image;
    /**
     * 随机数
     */
    private String code;
    /**
     * 过期时间
     */
    private LocalDateTime expireTime;

    public ImageCode(BufferedImage image, String code, LocalDateTime expireTime) {
        this.image = image;
        this.code = code;
        this.expireTime = expireTime;
    }
    public ImageCode(BufferedImage image, String code, int  expireIn) {
        this.image = image;
        this.code = code;
        //当前时间  加上  设置过期的时间
        this.expireTime = LocalDateTime.now().plusSeconds(expireIn);
    }

    public boolean isExpried(){
        //如果 过期时间 在 当前日期 之前，则验证码过期
        return LocalDateTime.now().isAfter(expireTime);
    }
}
