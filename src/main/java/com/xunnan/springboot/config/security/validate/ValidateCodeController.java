package com.xunnan.springboot.config.security.validate;

import com.xunnan.springboot.config.security.validate.code.ValidateCodeGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.connect.web.HttpSessionSessionStrategy;
import org.springframework.social.connect.web.SessionStrategy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.ServletWebRequest;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author lining
 * @date 2020/12/17 - 17:09
 */
@RestController
public class ValidateCodeController {
    public static final String SESSION_KEY = "SESSION_KEY_IMAGE_CODE";
    /**
     * 引入 session
     */
    private SessionStrategy sessionStrategy = new HttpSessionSessionStrategy();

    @Autowired
    private ValidateCodeGenerator imageCodeGenerator;

    @GetMapping("/code/image")
    public void createCode(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ImageCode imageCode = imageCodeGenerator.createCode(new ServletWebRequest(request));
        //将随机数 放到Session中
        sessionStrategy.setAttribute(new ServletWebRequest(request),SESSION_KEY,imageCode);
        //写给response 响应
        ImageIO.write(imageCode.getImage(),"JPEG",response.getOutputStream());
    }
}
