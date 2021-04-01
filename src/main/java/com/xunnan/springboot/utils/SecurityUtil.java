package com.xunnan.springboot.utils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.context.SecurityContextImpl;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @author lining
 * @date 2020/12/30 - 23:07
 */
@Slf4j
@Component
public class SecurityUtil {
    @Autowired
    @Qualifier("myUserDetailsService")
    private UserDetailsService userDetailsService;

    public void logInAs(String username) {
        UserDetails user = userDetailsService.loadUserByUsername(username);

        if (user == null) {
            throw new IllegalArgumentException("User"+username+"doesn't exist, please a valid user");
        }
        log.info("> Logged in as: "+username);

        SecurityContextHolder.setContext(
                new SecurityContextImpl(
                        new Authentication() {
                            @Override
                            public Collection<? extends GrantedAuthority> getAuthorities() {
                                return user.getAuthorities();
                            }

                            @Override
                            public Object getCredentials() {
                                return user.getPassword();
                            }

                            @Override
                            public Object getDetails() {
                                return user;
                            }

                            @Override
                            public Object getPrincipal() {
                                return user;
                            }

                            @Override
                            public boolean isAuthenticated() {
                                return true;
                            }

                            @Override
                            public void setAuthenticated(boolean b) throws IllegalArgumentException {

                            }

                            @Override
                            public String getName() {
                                return user.getUsername();
                            }
                        }
                )
        );
        org.activiti.engine.impl.identity.Authentication.setAuthenticatedUserId(username);
    }
}
