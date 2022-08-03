package com.cybersoft.cineflix_api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybersoft.cineflix_api.entity.Roles;
import com.cybersoft.cineflix_api.repository.RolesRepository;

@Service
public class RoleService implements RoleServiceImp {
	@Autowired
	RolesRepository rolesRepository;

	@Override
	public Roles getRoleByRoleId(int roleId) {
		// TODO Auto-generated method stub
		return rolesRepository.findById(roleId).get();
	}
	
}
