package com.cybersoft.cineflix_api.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomFileDetailService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		List<SimpleGrantedAuthority> files = new ArrayList<SimpleGrantedAuthority>();
		SimpleGrantedAuthority fileSystem = new SimpleGrantedAuthority("ROLE_USER");
		files.add(fileSystem);
				
		return new User ("filesystem", "$2a$12$NT/mBcaG7VxjGOxg8zT7I.A0O.Z0qhmTPJiuTHHO2s1IAylRv35bG", files) ;
	}
	
}
