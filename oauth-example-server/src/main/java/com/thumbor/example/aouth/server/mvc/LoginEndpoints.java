
package com.thumbor.example.aouth.server.mvc;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by xushubing on 2018/8/24.
 */

@Controller
public class LoginEndpoints {

    @ExceptionHandler(Exception.class)
    public void handleException(Exception e) throws Exception {
        e.printStackTrace();
    }


    @RequestMapping("/toLogin")
    public String login(Model model) {
        //for debug
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return "login";
    }

   /* @GetMapping("/loginSuccess")
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
    }*/
}

