package com.thumbor.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by xushubing on 2018/8/24.
 */
@SpringBootApplication()
@Slf4j
public class OauthServerApp {
    public static void main(String[] args) {

        SpringApplication.run(OauthServerApp.class, args);
    }
}
