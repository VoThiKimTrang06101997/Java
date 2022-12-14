package com.cybersoft.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cybersoft.connection.MySQLConnection;
import com.cybersoft.pojo.Users;

public class UsersModel {
	
	public boolean insertUsers(Users data) {
		
		Connection con = MySQLConnection.getConnection();
		String sql  = "insert into users(email,password,fullname,avatar,role_id) values(?,?,?,?,?)";
		boolean isSuccess = false;
		
		try {
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setString(1, data.getEmail());
			statement.setString(2, data.getPassword());
			statement.setString(3, data.getFullname());
			statement.setString(4, data.getAvatar());
			statement.setInt(5, data.getRole_id());
			
			int result = statement.executeUpdate();
			
			if(result > 0) {
				isSuccess = true;
			}
			
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	
	public Users getUsers(String email, String password) {
		Users users = null;
		
		Connection con = MySQLConnection.getConnection();
		String sql = "select * from users where email = ? and password = ? ";
		try {
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setString(1, email);
			statement.setString(2, password);
			
			ResultSet result = statement.executeQuery();
			while(result.next()) {
				users = new Users();
				users.setId(result.getLong("id"));
				users.setEmail(result.getString("email"));
				users.setFullname(result.getString("fullname"));
				users.setAvatar(result.getString("avatar"));
				users.setRole_id(result.getInt("role_id"));
			}
			
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return users;
	}
	
}
