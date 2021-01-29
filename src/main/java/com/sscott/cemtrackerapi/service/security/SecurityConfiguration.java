package com.sscott.cemtrackerapi.service.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


/*
    JPA does not provide out of the box implementation for authentication
 */
@EnableWebSecurity//tells spring security this is config class
public class SecurityConfiguration  extends WebSecurityConfigurerAdapter {


    @Autowired
    MyUserDetailsService userDetailService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailService);
    }

    //authorizes everything excepti /register
    //username must be entered not email
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf()
                .disable()
                .authorizeRequests()
                .antMatchers("/api/auth/v1/login")
                .permitAll()
                .antMatchers("/api/v1/register")
                .permitAll()
                .antMatchers("/register")
                .permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .httpBasic();

        http.requiresChannel()
                .requestMatchers(r -> r.getHeader("X-Forwarded-Proto") != null)
                .requiresSecure();
    }



    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
