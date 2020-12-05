package com.quinnox.springhotelmanagement.service;

import java.util.List;

import com.quinnox.springhotelmanagement.dto.UserDto;
import com.quinnox.springhotelmanagement.entities.User;

public interface UserService {
	public boolean addUser(UserDto user);
	public List<User> getAllUsers();
	public boolean updateUser(UserDto user);
	public int deleteUser(int userId);
	public User getOneUser(int userId);

}
