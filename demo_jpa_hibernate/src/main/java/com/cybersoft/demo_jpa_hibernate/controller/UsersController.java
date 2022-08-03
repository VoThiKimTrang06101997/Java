package com.cybersoft.demo_jpa_hibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cybersoft.demo_jpa_hibernate.entity.Roles;
import com.cybersoft.demo_jpa_hibernate.entity.Users;
import com.cybersoft.demo_jpa_hibernate.services.UsersServiceImp;
import com.cybersoft.demo_jpa_hibernate.services.UsersServices;

@RestController
@RequestMapping("/account")
public class UsersController {
	@Autowired
	UsersServiceImp serviceImp;
//	UsersServices usersServices;
	
	@GetMapping("")
	public ResponseEntity<?> index() {
		
		return new ResponseEntity<List<Users>>(serviceImp.getAllUsers(), HttpStatus.OK);
	}
	
	@GetMapping("/{username}")
	public ResponseEntity<?> getUsersByUserName(@PathVariable("username") String username) {
		return new ResponseEntity<List<Users>>(serviceImp.getUsersByUserName(username), HttpStatus.OK);
	}

	
	/* Tạo API thêm Users mới 
	 * Tạo API xóa Users theo Id
	 * */
	
//	@PostMapping("/create")
//	public ResponseEntity<?> addUser(@RequestParam("username") String username,
//									 @RequestParam("role_id") int role_id
//			){
//		Users users = new Users();
//		users.setUserName(username);
//		
//		Roles roles = new Roles();
//		roles.setId(role_id);
//		
//		serviceImp.insertUser(users);
//		return new ResponseEntity<String>("", HttpStatus.OK);
//	}
	
	@PostMapping("/create")
	public ResponseEntity<?> addUser(@RequestBody Users users) {
		serviceImp.insertUser(users);
		return new ResponseEntity<String>("", HttpStatus.OK);
	}
	
	@GetMapping("/delete/{id}")
	public ResponseEntity<?> deleteUserById(@PathVariable("id") int id) {
		serviceImp.deleteUserById(id);
		return new ResponseEntity<String>("", HttpStatus.OK);
	}
}

