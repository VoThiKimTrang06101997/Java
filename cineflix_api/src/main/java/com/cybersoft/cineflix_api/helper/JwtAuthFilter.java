package com.cybersoft.cineflix_api.helper;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import com.cybersoft.cineflix_api.security.UserService;
import com.google.gson.Gson;

public class JwtAuthFilter extends OncePerRequestFilter {
	@Autowired
	JwtProvider jwtProvider;

	@Autowired
	AuthenticationManager authenticationManager;

	@Autowired
	UserService userService;

	private Gson gson = new Gson();

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		// Cho phép đi tiếp tục vào đường dẫn mà User đang gọi
		if (request.getServletPath().startsWith("/api/v1/login")) {
			filterChain.doFilter(request, response);
			return;
		}
		// TODO Auto-generated method stub
		String token = getJwtToken(request);

		if (jwtProvider.validationToken(token)) {
			// Token hợp lệ
			String jsonData = jwtProvider.decodeToken(token);
			System.out.println("Kiểm tra Data Token: " + jsonData);

			// User user = gson.fromJson(jsonData, User.class);
			User userDetail = (User) userService.loadUserByUsername(jsonData);

			// Gọi đăng nhập của Spring Security
			UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(
					userDetail, null, userDetail.getAuthorities());
			authenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));

			// Authentication authentication =
			// authenticationManager.authenticate(authenticationToken);
			SecurityContextHolder.getContext().setAuthentication(authenticationToken);

			// Gọi lại hàm đăng nhập mặc định của Spring Security
			
		} else {
			// Token không phải do hệ thống sinh ra
			System.out.println("Auth: Đăng nhập thất bại");
		}
		
		filterChain.doFilter(request, response);
	}

	private String getJwtToken(HttpServletRequest request) {
		String authenToken = request.getHeader("Authorization");
		if (StringUtils.hasText(authenToken) && authenToken.contains("Bearer")) {
			// Loại bỏ chữ Bearer và lấy phần Token đằng sau Bearer
			String token = authenToken.substring(7);
			return token;
		}
		return null;
	}

}
