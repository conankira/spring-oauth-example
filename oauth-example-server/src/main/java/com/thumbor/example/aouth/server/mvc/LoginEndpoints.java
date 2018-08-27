package com.thumbor.example.aouth.server.mvc;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xushubing on 2018/8/24.
 */
@RestController
public class LoginEndpoints {

    @GetMapping("/login")
    public String login() {
        //for debug
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return "login";
    }

    @GetMapping("/loginSuccess")
    public String loginSuccess() {
        //for debug
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return "login";
    }

    @GetMapping("/logout")
    public String logout() {
        //for debug
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return "logout";
    }
}
