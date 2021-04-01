package com.xunnan.springboot.config.security;

/**
 * 判断json/html 请求 返回不同的结果
 * @ 注解@ResponseStatus ：响应状态码 UNAUTHORIZED(401, "Unauthorized")
 * Created by Fant.J.
 */

import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.xunnan.springboot.config.security.properties.SecurityProperties;
import com.xunnan.springboot.config.security.support.SimpleResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
import org.springframework.security.web.savedrequest.RequestCache;
import org.springframework.security.web.savedrequest.SavedRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *  响应状态码 UNAUTHORIZED(401, "Unauthorized")
 * @author lining
 * @date 2020/12/17 - 16:17
 */
@ResponseStatus(code = HttpStatus.UNAUTHORIZED)
@RestController
@Slf4j
public class BrowerSecurityController {
    /**
     * 重定向策略
     */
    private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

    /**
     * 把当前的请求缓存到session
     */
    private RequestCache requestCache = new HttpSessionRequestCache();

    /**
     * 注入security属性配置
     */
    @Resource
    private SecurityProperties securityProperties;

    /**
     * 当需要身份认证时，跳转到这里
     */
    @RequestMapping(value = "/authentication/require")
    public SimpleResponse requireAuthentication(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // 拿到请求对象
        SavedRequest savedRequest = requestCache.getRequest(request, response);
        if (savedRequest != null) {
        //    获取跳转URL
            String targetUrl = savedRequest.getRedirectUrl();
            log.info("引发跳转的请求是：{}",targetUrl);

        //判断targetUrl是不是.html结尾，如果是：跳转到登录页面（返回view）
            if (StringUtils.endsWithIgnoreCase(targetUrl, ".html")) {
                String redirectUrl = securityProperties.getBrowser().getLoginPage();
                redirectStrategy.sendRedirect(request,response,redirectUrl);
            }
        }
        //如果不是，返回一个json 字符串
        return new SimpleResponse("访问的服务需要身份认证，请引导用户到登录页");
    }
}
