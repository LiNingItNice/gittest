package com.xunnan.springboot.config.security.validate.code;

import com.xunnan.springboot.config.security.properties.SecurityProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * 验证码 实体类设置 类
 * @author lining
 * @date 2020/12/17 - 17:21
 */
@Configuration
public class ValidateCodeBeanConfig {

    @Resource
    private SecurityProperties securityProperties;

    /**
     * 在触发 ValidateCodeGenerator 之前会检测有没有imageCodeGenerator这个bean。
     */
    @Bean
    @ConditionalOnMissingBean(name = "imageCodeGenerator")
    public ValidateCodeGenerator imageCodeGenerator(){
        ImageCodeGenerator codeGenerator = new ImageCodeGenerator();
        codeGenerator.setSecurityProperties(securityProperties);
        return codeGenerator;
    }
}
