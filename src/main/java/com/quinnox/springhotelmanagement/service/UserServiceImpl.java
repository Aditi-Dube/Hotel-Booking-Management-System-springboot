package com.quinnox.springhotelmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quinnox.springhotelmanagement.dao.UserDao;
import com.quinnox.springhotelmanagement.dto.UserDto;
import com.quinnox.springhotelmanagement.entities.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserDao dao;
	
	@Override
	public boolean addUser(UserDto user) {
		dao.addUser(user);
		return true;
	}

	@Override
	public List<User> getAllUsers() {
		return dao.getAllUsers();
	}

	@Override
	public boolean updateUser(UserDto user) {
		dao.updateUser(user);
		return true;
	}

	@Override
	public int deleteUser(int userId) {
		dao.deleteUser(userId);
		return 1;
	}

	@Override
	public User getOneUser(int userId) {
		return dao.getOneUser(userId);
	}

}
