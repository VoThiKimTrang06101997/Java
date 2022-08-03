package com.cybersoft.demo_restful_api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cybersoft.demo_restful_api.pojo.Account;

/* @Controller: => Cho phép tạo ra 1 link trả ra giao diện HTML, JSP, ThymeLeaf  
 * @RestController: (@Controller, @ResponseBody) => Trả ra kiểu String => Xây dựng API.
 * @RequestMapping: => Tạo ra Link tương ứng với Class (giống Servlet).
 * 
 * POSTMAN:
 * GET: Để truyền tham số thì xài bên tab Param.
 * POST: Sử dụng tab Body 
 * - form-data: Dùng test dữ liệu có file hoặc không có file.
 * - form-urlencoded: Tham số sẽ được thấy ở link (không có nhận file).
 * - raw: Text, JSON (gặp miết)
 * 
 * */

@RestController
@RequestMapping("/account")
public class AccountController {
	@RequestMapping("")
	public String index() {
		return "Index";
	}
	
	@GetMapping("/create/{email}/{username}")
	public String createAccount(@PathVariable("email") String email, 
								@PathVariable("username") String username) {
		System.out.println("Email: " + email + " -Username: " + username);
		return "Hello Spring";
	}
	
	@PostMapping(value= "/update", consumes = "application/x-www-form-urlencoded")
	public String updateAccount(@RequestParam("username") String username, @RequestParam("password") String password) {
		System.out.println("Data: " + username + " - " + password);
		return "Update Account";
	}
}
