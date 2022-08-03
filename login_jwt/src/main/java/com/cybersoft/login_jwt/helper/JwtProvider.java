package com.cybersoft.login_jwt.helper;

import java.util.Date;

import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtProvider {
	// Khai báo hàm tạo Token
	// Giải mã Token
	// Kiểm tra Token có phải do hệ thống sinh ra hay không
	
	// SECRECT_KEY = "admin@123" => encode
	private String SECRECT_KEY = "YWRtaW4xMjM0NTY3ODkwQDEyMzQ1Njc4OTBAYWRtaW4xMjM0NTY3ODkw";
	private long JWT_EXPIRED = 8 * 60 * 60 * 1000;
	private Gson gson = new Gson();
	
	public String generateToken(String data) {
		Date now = new Date();
		Date expiredDate = new Date(now.getTime() + JWT_EXPIRED);
		
		// String json = gson.toJson(user);
		
		return Jwts.builder()
				.setSubject(data)  // Dữ liệu muốn lưu kèm ở Token
				.setIssuedAt(now) // Ngày tạo token
				.setExpiration(expiredDate)  // Thời gian hết hạn của token
				
				.signWith(SignatureAlgorithm.HS256, SECRECT_KEY) // Thuật toán mã hóa và mã hóa dựa trẹn SECRECT_KEY
				.compact();
	}
	
	public String decodeToken(String token) {
		return Jwts.parser()
				.setSigningKey(SECRECT_KEY)    // Key mã hóa Token ban đầu
				.parseClaimsJws(token)    // truyền tham số token cần mã hóa
				.getBody().getSubject();  // Lấy giá trị		
	}
	
	public boolean validationToken(String token) {
		try {
			Jwts.parser()
			.setSigningKey(SECRECT_KEY)    // Key mã hóa Token ban đầu
			.parseClaimsJws(token);
			
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
}
