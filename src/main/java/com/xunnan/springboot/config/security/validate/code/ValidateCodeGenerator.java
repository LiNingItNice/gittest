package com.xunnan.springboot.config.security.validate.code;

import com.xunnan.springboot.config.security.validate.ImageCode;
import org.springframework.web.context.request.ServletWebRequest;

/**
 * 验证码生成器
 * @author lining
 * @date 2020/12/17 - 17:12
 */
public interface ValidateCodeGenerator {
    /**
     * 创建验证码
     */
    ImageCode createCode(ServletWebRequest request);
}
