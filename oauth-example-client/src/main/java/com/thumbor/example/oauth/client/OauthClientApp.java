package com.thumbor.example.oauth.client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by xushubing on 2018/8/27.
 */
@SpringBootApplication()
@Slf4j

public class OauthClientApp {
    public static void main(String[] args) {

        SpringApplication.run(OauthClientApp.class, args);
    }
}
