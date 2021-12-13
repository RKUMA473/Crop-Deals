package com.SpingBootProject.Admin.Service;

import com.SpingBootProject.Admin.Service.Model.FarmerUser;
import com.SpingBootProject.Admin.Service.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


//@EnableWebSecurity
//public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
//    @Autowired
//    private FarmerUser farmerUser;
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth)throws Exception {
//
//    //Set Our Configuration on the auth Object
//
//        auth.inMemoryAuthentication()
//                .withUser("admin")
//                .password("admin")
//                .roles("ADMIN")
//                .and()
//                .withUser("farmer")
//                .password("farmer")
//                .roles("FARMER")
//                .and()
//                .withUser("dealer")
//                .password("dealer")
//                .roles("DEALER");
//
//    }
//       @Bean
//        public PasswordEncoder getPasswordEncoder(){
//            return NoOpPasswordEncoder.getInstance();}
//
//            @Override
//            protected void configure(HttpSecurity http) throws Exception{
//            http.authorizeRequests()
//                    .antMatchers("/admin").hasRole("ADMIN")
//                    .antMatchers("/farmer").hasAnyRole("FARMER","ADMIN")
//                    .antMatchers("/dealer").hasRole("DEALER")
//                    .antMatchers("/","static/css","static/js").permitAll()
//                    .and().formLogin();
//
//    }

