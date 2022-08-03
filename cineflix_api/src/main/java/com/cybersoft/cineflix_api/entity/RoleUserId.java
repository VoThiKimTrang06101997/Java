package com.cybersoft.cineflix_api.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/* Class này chứa 2 khóa chính của bảng trung gian trong quan hệ nhiều nhiều */
 @Embeddable
public class RoleUserId implements Serializable {

	@Column(name = "role_id")
	private long roleId;
	
	@Column(name= "user_id")
	private long userId;
	
	public RoleUserId(long roleId, long userId) {
		// TODO Auto-generated constructor stub
		this.roleId = roleId;
		this.userId = userId;
	}
	
	public RoleUserId() {
		
	}
	
	/* getter and setters */
	public long getRoleId() {
		return roleId;
	}

	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}
}
