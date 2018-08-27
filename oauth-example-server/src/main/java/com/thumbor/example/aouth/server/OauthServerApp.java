package com.thumbor.example.aouth.server;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by xushubing on 2018/8/24.
 */
@SpringBootApplication()
@MapperScan("com.thumbor.example.aouth.server.db.dao")
@Slf4j
public class OauthServerApp {
    public static void main(String[] args) {

        SpringApplication.run(OauthServerApp.class, args);
    }
}
