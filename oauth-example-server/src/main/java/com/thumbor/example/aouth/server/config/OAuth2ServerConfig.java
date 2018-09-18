/*
 * Copyright 2002-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.thumbor.example.aouth.server.config;

import com.thumbor.example.aouth.server.service.MyClientDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.redis.RedisTokenStore;

import javax.annotation.Resource;

/**
 * @author Rob Winch
 */
@Configuration
public class OAuth2ServerConfig {

    private static final String SPARKLR_RESOURCE_ID = "sparklr";

    @Configuration
    @EnableResourceServer
    protected static class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {

        @Override
        public void configure(ResourceServerSecurityConfigurer resources) {
            //resources。
            resources.resourceId(SPARKLR_RESOURCE_ID).stateless(false);
            //resources.resourceId(SPARKLR_RESOURCE_ID);
        }

        @Override
        public void configure(HttpSecurity http) throws Exception {
            http
                    .authorizeRequests()
                    .antMatchers("/order/**").authenticated()
                    .antMatchers("/product/**").access("#oauth2.hasScope('read') or (!#oauth2.isOAuth() and hasRole('ROLE_USER'))")//配置order访问控制，必须认证过后才可以访问
                    .antMatchers("/role/**").access("(!#oauth2.isOAuth() and hasRole('ROLE_USER'))");//配置order访问控制，必须认证过后才可以访问
        }
        //远程调用认证服务器，资源和认证分开
       /* @Bean
        public ResourceServerTokenServices tokenServices() {
            RemoteTokenServices remoteTokenServices = new RemoteTokenServices();
            remoteTokenServices.setCheckTokenEndpointUrl("http://localhost:9090/oauth/check_token");
            remoteTokenServices.setClientId("my-trusted-client-with-secret");
            remoteTokenServices.setClientSecret("somesecret");
            remoteTokenServices.setAccessTokenConverter(accessTokenConverter());
            return remoteTokenServices;
        }

        @Bean
        public AccessTokenConverter accessTokenConverter() {
            return new DefaultAccessTokenConverter();
        }*/
        //end

    }

    @Configuration
    @EnableAuthorizationServer
    protected static class AuthorizationServerConfiguration extends AuthorizationServerConfigurerAdapter {

        @Autowired
        private TokenStore tokenStore;


        @Autowired
        @Qualifier("authenticationManagerBean")
        private AuthenticationManager authenticationManager;

        @Autowired
        @Qualifier("userDetailsService")
        private UserDetailsService userDetailsService;

        @Autowired
        private MyClientDetailsService myClientDetailsService;


        @Resource
        private LettuceConnectionFactory lettuceConnectionFactory;


        @Override
        public void configure(ClientDetailsServiceConfigurer clients) throws Exception {

            clients.withClientDetails(myClientDetailsService);

        }

        @Bean
        public TokenStore tokenStore() {
            return new RedisTokenStore(lettuceConnectionFactory);
        }

        @Override
        public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
            endpoints.tokenStore(tokenStore)
                    .userDetailsService(userDetailsService)
                    .authenticationManager(authenticationManager);
        }

        @Override
        public void configure(AuthorizationServerSecurityConfigurer oauthServer) throws Exception {
            oauthServer
                    .realm("oauth2-resources")
                    .tokenKeyAccess("permitAll()") //url:/oauth/token_key,exposes public key for token verification if using JWT tokens
                    .checkTokenAccess("isAuthenticated()") //url:/oauth/check_token allow check token
                    .allowFormAuthenticationForClients();
        }

    }


}
