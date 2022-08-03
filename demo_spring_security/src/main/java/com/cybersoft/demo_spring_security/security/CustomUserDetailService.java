package com.cybersoft.demo_spring_security.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailService implements UserDetailsService {
	// Basic Authen: username_password => Mã hóa username và password
	// Bearer Authen: token (JWT)

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		/*
		 * Nơi tạo ra các user hợp lệ của hệ thống khi username và password người dùng nhập vào 
		sẽ được so sánh với user được định nghĩa ở UserDetail
		 * */
		
		// Lấy DataBase
		System.out.println("Kiểm tra User Detail");
		if(username.equals("admin")) {
			List<SimpleGrantedAuthority> roles = new ArrayList<SimpleGrantedAuthority>();
			SimpleGrantedAuthority rolesAdmin = new SimpleGrantedAuthority("ROLE_USER");
			roles.add(rolesAdmin);
			
			return new User("admin", "$2a$12$NZJioj1ZY.tcws3bVt16rOKHhK3qdlkvUFSIPlNAmmLfzPCdTefJG", roles);
		} else {
			throw new UsernameNotFoundException("User not found");
		}
		
	}
	
}
