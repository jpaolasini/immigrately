/*
 * Copyright (c) 2020 - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Jason Paolasini <jason.paolasini@gmail.com>
 */

package com.immigrately.uluru.security;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .mvcMatchers("/**/*.{js,html,css}").permitAll()
                .mvcMatchers("/", "/index.html").permitAll()
                .anyRequest().authenticated();
    }
}
