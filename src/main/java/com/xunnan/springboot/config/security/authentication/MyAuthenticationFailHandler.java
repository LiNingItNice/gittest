package com.xunnan.springboot.config.security.authentication;

import cn.hutool.json.JSON;
import cn.hutool.json.JSONUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xunnan.springboot.config.security.properties.SecurityProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.function.ServerResponse;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 自定义登录失败处理器
 *
 * @author lining
 * @date 2020/12/17 - 16:50
 */
@Slf4j
@Component
public class MyAuthenticationFailHandler extends SimpleUrlAuthenticationFailureHandler {
    /**
     * json 转换工具类
     */
    private ObjectMapper objectMapper;

    @Resource
    private SecurityProperties securityProperties;

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException e) throws IOException, ServletException {

        logger.info("登录失败");

        //如果是json 格式
        /*if (LoginType.JSON.equals(securityProperties.getBrowser().getLoginType())){
            //设置状态码
            response.setStatus(500);
            //将 登录失败 信息打包成json格式返回
            response.setContentType("application/json;charset=UTF-8");
            response.getWriter().write(objectMapper.writeValueAsString(e));
        }else{
            //如果不是json格式，返回view
            super.onAuthenticationFailure(request,response,e);
        }*/

        //设置状态码
        response.setStatus(500);
        response.setContentType("application/json;charset=UTF-8");
        //将 登录失败 信息打包成json格式返回
        // response.getWriter().write(JSONUtil.toJsonStr(ServerResponse.createByErrorMessage(e.getMessage())));
        response.getWriter().write(JSONUtil.toJsonStr(ServerResponse.async(e.getMessage())));

    }
}
