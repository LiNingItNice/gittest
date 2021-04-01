package com.xunnan.springboot.config.security.validate;

import javax.security.sasl.AuthenticationException;

/**
 * 自定义 验证码异常类
 * @author lining
 * @date 2020/12/17 - 17:25
 */
public class ValidateCodeException extends AuthenticationException {
    public ValidateCodeException(String msg) {
        super(msg);
    }
}
