package com.cybersoft.demo_hibernate.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cybersoft.demo_hibernate.entity.Users;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	SessionFactory sessionFactory;
	
	/* hàm trả kết quả các users */
	@GetMapping("")
	/* điền dấu chấm hỏi ? truyền dữ liệu tự do */
	public ResponseEntity<?> getUsers() {
		
		Session session = sessionFactory.getCurrentSession();
		Query<Users> query = session.createQuery("from users", Users.class);
		List<Users> listUser = query.getResultList();
		
		for(Users users: listUser) {
			System.out.println("Kiểm tra: " + users.getUserName());
		}
		return new ResponseEntity<List<Users>>(listUser, HttpStatus.OK);
	}
	
	/* - Tạo API thêm user thực hiện kết nối database và thêm user 
	 * - Tạo API xóa user
	 * */
	
	/* hàm thêm users */
//	@GetMapping("/adduser")
//	public ResponseEntity<?> addUsers() {
//		
//		Session session = sessionFactory.getCurrentSession();
//		String hql = "INSERT INTO users(username, role_id) " + "VALUES (:username, :role_id) ";
//		Query<Users> query = session.createQuery(hql, Users.class);
//		
//		
//		int addUsers = query.executeUpdate();
////		List<Users> addUsers = query.getResultList();
//		return new ResponseEntity<List<Users>>(HttpStatus.OK);
//		
//	}
	
	@DeleteMapping("/delete/{id}")
	@Transactional
	public String deleteUser(@PathVariable("id") int id) {
		Session session  = sessionFactory.getCurrentSession();
		Users users = new Users();
		users.setId(id);
		
		try {
			session.delete(users);
			return "Success";
		} catch (Exception e) {
			return "Failed";
		}
		
	}
	
}
