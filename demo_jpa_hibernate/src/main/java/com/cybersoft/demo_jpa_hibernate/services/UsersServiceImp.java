package com.cybersoft.demo_jpa_hibernate.services;

import java.util.List;

import com.cybersoft.demo_jpa_hibernate.entity.Users;

public interface UsersServiceImp {
	List<Users> getAllUsers();
	List<Users> getUsersByUserName(String username);
	void insertUser(Users users);
	void deleteUserById(Integer id);
	
}
