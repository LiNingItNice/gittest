package com.xunnan.springboot.config.security.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Security 属性 类
 * @author lining
 * @date 2020/12/17 - 16:37
 */
// 获取配置属性
@Data
@ConfigurationProperties(prefix = "fantj.security")
@Component
public class SecurityProperties {
    /**
     * 浏览器 属性类
     */
    private BrowserProperties browser = new BrowserProperties();

    /**
     * 验证码 属性类
     */
    private ValidateCodeProperties code = new ValidateCodeProperties();
}
