package com.cybersoft.demo_jpa_hibernate.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybersoft.demo_jpa_hibernate.entity.Users;
import com.cybersoft.demo_jpa_hibernate.repository.UsersRepository;

@Service
public class UsersServices implements UsersServiceImp {
	@Autowired
	UsersRepository usersRepository;
	
	/* Nơi gọi lấy dữ liệu ở database và xử lý dữ liệu trước khi trả ra controller */
	@Override
	public List<Users> getAllUsers() {
		return usersRepository.findAll();
	}
	
	@Override
	public List<Users> getUsersByUserName(String username) {
		return usersRepository.findByuserName(username);
	}
//	public List<Users> getAllUsers() {
//		return usersRepository.findAll();
//	}
//	
//	public List<Users> getUsersByUserName(String username) {
//		return usersRepository.findByuserName(username);
//	}

	@Autowired
	@Override
	public void insertUser(Users users) {
		// TODO Auto-generated method stub
		usersRepository.save(users);
	}
	
	@Override
	public void deleteUserById(Integer id) {
		// TODO Auto-generated method stub
		usersRepository.delete(null);
	}
}
