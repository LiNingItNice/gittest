package com.xunnan.springboot.config.security;

import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

/**
 * UserDetail 类
 *
 * @author lining
 * @date 2020/12/17 - 16:43
 */
@Component
@Slf4j
public class MyUserDetailsService implements UserDetailsService {
    //    @Autowired
//    private //在这里注入mapper，再想ia面根据用户名做信息查找
//     @Reference(version = "2.0.0")
//     private UserService userService;

    /**
     * 重写PasswordEncoder  接口中的方法，实例化加密策略
     *
     * @return 返回 BCrypt 加密策略
     */
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    // @Autowired
    // private PasswordEncoder passwordEncoder;

    /**
     * 加载用户数据 , 返回UserDetail 实例
     *
     * @param username 用户登录username
     * @return 返回User实体类 做用户校验
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        log.info("登录用户名:" + username);
        /*// 根据用户名查询用户的密码
        String password = passwordEncoder.encode("123456");
        //User三个参数   (用户名+密码+权限)
        //根据查找到的用户信息判断用户是否被冻结
        log.info("数据库密码:" + password);
        return new User(username, password,
                true, true, true, true,
                AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));*/

        String passwd = "";
        System.out.println("收到的账号"+username);
        /*if (CheckFormat.isEmail(username)){
            passwd = userService.selectPasswdByEmail(username);
        }else if (CheckFormat.isPhone(username)){
            passwd = userService.selectPasswdByPhone(username);
        }else {
            throw new RuntimeException("登录账号不存在");
        }*/

        if (StringUtils.isNotBlank(username)) {

        }else {
            throw new RuntimeException("登录账号不存在");
        }
        System.out.println("查到的密码"+passwd);
        return new User(username, passwd, AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_USER"));
    }
}
