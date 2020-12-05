package com.quinnox.springhotelmanagement.dao;

import java.util.List;

import com.quinnox.springhotelmanagement.dto.UserDto;
import com.quinnox.springhotelmanagement.entities.User;


public interface UserDao {

	public boolean addUser(UserDto user);
	public List<User> getAllUsers();
	public boolean updateUser(UserDto user);
	public int deleteUser(int userId);
	public User getOneUser(int userId);

}
