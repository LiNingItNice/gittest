package com.xunnan.springboot.config.security.properties;

import lombok.Data;

/**
 * 验证码 配置类
 * @author lining
 * @date 2020/12/17 - 17:27
 */
@Data
public class ValidateCodeProperties {
    /**
     * 图形验证码 配置属性
     */
    private ImageCodeProperties image = new ImageCodeProperties();
}
