package com.thumbor.example.aouth.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.*;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * Created by thumbor on 2018/8/27.
 */
@Service("securityProvider")
public class SecurityProvider implements AuthenticationProvider {
    private UserDetailsService userDetailsService;

    public SecurityProvider(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    @Autowired
    private Pbkdf2PasswordEncoder pbkdf2PasswordEncoder;

    @Override
    public Authentication authenticate(Authentication authenticate) throws AuthenticationException {
        UsernamePasswordAuthenticationToken token
                = (UsernamePasswordAuthenticationToken) authenticate;
        String username = token.getName();
        UserDetails userDetails = null;

        if (username != null) {
            userDetails = userDetailsService.loadUserByUsername(username);
        }
        System.out.println("$$" + userDetails);

        if (userDetails == null) {
            throw new UsernameNotFoundException("用户名/密码无效");
        } else if (!userDetails.isEnabled()) {
            System.out.println("jinyong用户已被禁用");
            throw new DisabledException("用户已被禁用");
        } else if (userDetails.isAccountNonExpired()) {
            System.out.println("guoqi账号已过期");
            throw new LockedException("账号已过期");
        } else if (userDetails.isAccountNonLocked()) {
            System.out.println("suoding账号已被锁定");
            throw new LockedException("账号已被锁定");
        } else if (userDetails.isCredentialsNonExpired()) {
            System.out.println("pingzheng凭证已过期");
            throw new LockedException("凭证已过期");
        }

        String password = userDetails.getPassword();

        boolean match = pbkdf2PasswordEncoder.matches(token.getCredentials().toString(), password);
        //与authentication里面的credentials相比较
        if (!match) {
            throw new BadCredentialsException("Invalid username/password");
        }
        //授权
        return new UsernamePasswordAuthenticationToken(userDetails, password, userDetails.getAuthorities());
    }

    @Override
    public boolean supports(Class<?> authentication) {
        //返回true后才会执行上面的authenticate方法,这步能确保authentication能正确转换类型
        return UsernamePasswordAuthenticationToken.class.equals(authentication);
    }

}
