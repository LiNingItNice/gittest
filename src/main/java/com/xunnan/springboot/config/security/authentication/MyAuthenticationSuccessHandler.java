package com.xunnan.springboot.config.security.authentication;

import cn.hutool.core.codec.Base64;
import cn.hutool.json.JSONUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xunnan.springboot.config.security.properties.SecurityProperties;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.common.exceptions.UnapprovedClientAuthenticationException;
import org.springframework.security.oauth2.provider.*;
import org.springframework.security.oauth2.provider.token.AuthorizationServerTokenServices;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.function.ServerResponse;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 自定义登录成功处理类
 *
 * @author lining
 * @date 2020/12/17 - 16:47
 */
@Slf4j
@Component
public class MyAuthenticationSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler {
    /**
     * json 转换工具类
     */
    private ObjectMapper objectMapper;

    @Resource
    private SecurityProperties securityProperties;

    @Resource
    private ClientDetailsService clientDetailsService;

    @Resource
    private AuthorizationServerTokenServices authorizationServerTokenServices;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        logger.info("登录成功");

        //判断是json 格式返回 还是 view 格式返回
        /*if (LoginType.JSON.equals(securityProperties.getBrowser().getLoginType())){
            //将 authention 信息打包成json格式返回
            response.setContentType("application/json;charset=UTF-8");
            response.getWriter().write(objectMapper.writeValueAsString(authentication));
        }else {
            //返回view
            super.onAuthenticationSuccess(request,response,authentication);
        }*/

        String header = request.getHeader("Authorization");
        if (header == null && !header.startsWith("Basic")) {
            throw new UnapprovedClientAuthenticationException("请求投中无client信息");
        }
        String[] tokens = this.extractAndDecodeHeader(header, request);

        assert tokens.length == 2;

        //获取clientId 和 clientSecret
        String clientId = tokens[0];
        String clientSecret = tokens[1];

        //获取 ClientDetails
        ClientDetails clientDetails = clientDetailsService.loadClientByClientId(clientId);

        if (clientDetails == null) {
            throw new UnapprovedClientAuthenticationException("clientId 不存在" + clientId);
            //判断  方言  是否一致
        } else if (!StringUtils.equals(clientDetails.getClientSecret(), clientSecret)) {
            throw new UnapprovedClientAuthenticationException("clientSecret 不匹配" + clientId);
        }
        //密码授权 模式, 组建 authentication
        TokenRequest tokenRequest = new TokenRequest(MapUtils.EMPTY_SORTED_MAP, clientId, clientDetails.getScope(), "password");

        OAuth2Request oAuth2Request = tokenRequest.createOAuth2Request(clientDetails);
        OAuth2Authentication oAuth2Authentication = new OAuth2Authentication(oAuth2Request, authentication);

        OAuth2AccessToken token = authorizationServerTokenServices.createAccessToken(oAuth2Authentication);

        //判断是json 格式返回 还是 view 格式返回
        //将 authention 信息打包成json格式返回
        response.setContentType("application/json;charset=UTF-8");
        // response.getWriter().write(JSONUtil.toJsonStr(ServerResponse.createBySuccess(token)));
        response.getWriter().write(JSONUtil.toJsonStr(ServerResponse.async(token)));
    }


    /**
     * 解码请求头
     */
    private String[] extractAndDecodeHeader(String header, HttpServletRequest request) throws IOException {
        byte[] base64Token = header.substring(6).getBytes("UTF-8");

        byte[] decoded;
        try {
            decoded = Base64.decode(base64Token);
        } catch (IllegalArgumentException var7) {
            throw new BadCredentialsException("Failed to decode basic authentication token");
        }

        String token = new String(decoded, "UTF-8");
        int delim = token.indexOf(":");
        if (delim == -1) {
            throw new BadCredentialsException("Invalid basic authentication token");
        } else {
            return new String[]{token.substring(0, delim), token.substring(delim + 1)};
        }
    }
}
