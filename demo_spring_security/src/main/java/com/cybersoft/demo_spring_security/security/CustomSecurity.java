package com.cybersoft.demo_spring_security.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/*
 * Dùng để custom lại tất cả những phương thức liên quan tới chứng thực
 * */

@Configuration
@EnableWebSecurity
public class CustomSecurity extends WebSecurityConfigurerAdapter {
	@Autowired
	CustomUserDetailService customUserDetailService;
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		auth.userDetailsService(customUserDetailService).passwordEncoder(passwordEncoder());
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		// Nơi định nghĩa liên quan tới quyền hoặc chứng thực cho API nào đó
		// antMatchers: Định nghĩa đường dẫn sẽ có quyền và role tương ứng.
		// authenticated: Phải bắt buộc chứng thực.
		// permitAll: Không cần chứng thực.
		
		http.authorizeHttpRequests()
		.antMatchers("/demo/user").hasRole("USER")
		.antMatchers("/demo/admin").hasRole("ADMIN")
		.antMatchers("/demo/guest").hasRole("GUEST")
		.antMatchers("/demo/logout").permitAll()
		.and().logout()
		// .anyRequest().authenticated()
		.and().httpBasic();
	}
}
