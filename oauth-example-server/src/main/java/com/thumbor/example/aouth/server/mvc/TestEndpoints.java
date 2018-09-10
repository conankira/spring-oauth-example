package com.thumbor.example.aouth.server.mvc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xushubing on 2018/8/24.
 */
@RestController
@Slf4j
public class TestEndpoints {

    @Autowired
    private RedisConnectionFactory redisConnectionFactory;

    @Autowired
    private TokenStore tokenStore;
    @GetMapping("/product/{id}")
    public String getProduct(@PathVariable String id) {
        //for debug
        log.info("{}",redisConnectionFactory.getConnection());
        log.info("{}",tokenStore.findTokensByClientId("my-trusted-client-with-secret"));
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return "product id : " + id;
    }

    @GetMapping("/order/{id}")
    public String getOrder(@PathVariable String id) {
        //for debug
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return "order id : " + id;
    }
}
