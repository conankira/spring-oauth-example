package com.thumbor.example.aouth.server.mvc;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.common.exceptions.OAuth2Exception;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xushubing on 2018/8/24.
 */
@RestController
public class LoginEndpoints {

    @ExceptionHandler(OAuth2Exception.class)
    public void handleException(OAuth2Exception e) throws Exception {
        e.printStackTrace();
    }


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
