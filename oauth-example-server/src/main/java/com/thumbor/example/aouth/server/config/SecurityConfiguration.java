package com.thumbor.example.aouth.server.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(jsr250Enabled = true)
@Order(1)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Bean
    public static Pbkdf2PasswordEncoder passwordEncoder() {
        return new Pbkdf2PasswordEncoder();
    }

    @Autowired
    private AuthenticationProvider securityProvider;

    @Autowired
    public void globalUserDetails(AuthenticationManagerBuilder auth) throws Exception {

        auth.authenticationProvider(securityProvider);

    }

    @Override
    @Order(2)
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/webjars/**", "/images/**", "/oauth/uncache_approvals", "/oauth/cache_approvals", "/toLogin/**");
    }

    @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Override
    @Order(3)
    protected void configure(HttpSecurity http) throws Exception {
  /*      http.requestMatchers()
                .antMatchers("/login", "/oauth/authorize")
                .and()
                .authorizeRequests()
                .anyRequest().authenticated()
                .and()
                .formLogin().permitAll();*/

      /*  http.authorizeRequests().anyRequest().authenticated()
                .and()
                .authorizeRequests()
                .antMatchers("/oauth/**").permitAll()
                .and()
                .formLogin().loginPage("/toLogin")// 登录url请求路径 (3)
                .defaultSuccessUrl("/httpapi").permitAll()
                .and() // 登录成功跳转路径url(4)
                .logout().permitAll()
                .and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.NEVER);
*/

        // @formatter:off
        http
                .requestMatchers().anyRequest()
                .and()
                .authorizeRequests()
                .antMatchers("/oauth/**").permitAll()
                .and()
                .formLogin()
                .loginProcessingUrl("/login")
                .failureUrl("/login?authentication_error=true")
                .loginPage("/login");
        // @formatter:on
    }

  /*  @Override
    protected void configure(HttpSecurity http) throws Exception {
        // @formatter:off
        http
                .authorizeRequests()
                .antMatchers("/login").permitAll()
                .anyRequest().hasRole("USER")
                .and()
                .exceptionHandling()
                .accessDeniedPage("/login?authorization_error=true")
                .and()
                // TODO: put CSRF protection back into this endpoint
                .csrf()
                .requireCsrfProtectionMatcher(new AntPathRequestMatcher("/oauth/authorize"))
                .disable()
                .logout()
                .logoutUrl("/logout")
                .logoutSuccessUrl("/loginSuccess")
                .and()
                .formLogin()
                .loginProcessingUrl("/login")
                .failureUrl("/login?authentication_error=true")
                .loginPage("/login");
        // @formatter:on
    }*/
}
