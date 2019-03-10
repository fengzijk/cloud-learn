package com.fengzijk.eureka.server.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * -------------------------------------------------
 *
 * @ProjectName : cloud-learn
 * @Descprition :  the actuator endpoints accessible:
 * @Author : fengzijk
 * @email: guozhifengvip@163.com
 * @Time : 2019/3/10 1:30
 * --------------------------------------------------
 */
@Configuration
public  class SecurityPermitAllConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().anyRequest().permitAll()
                .and().csrf().disable();
    }
}