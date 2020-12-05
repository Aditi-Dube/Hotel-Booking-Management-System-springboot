package com.quinnox.springhotelmanagement.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.quinnox.springhotelmanagement.dto.UserDto;
import com.quinnox.springhotelmanagement.entities.User;

@Repository
public class UserDaoImpl implements UserDao{

	@Autowired
	EntityManager manager;
	
	@Override
	@Transactional
	public boolean addUser(UserDto user) {
		User user1 = new User();
		BeanUtils.copyProperties(user, user1);
		manager.persist(user1);
		return true;
	
	}

	@Override
	public List<User> getAllUsers() {
		TypedQuery<User> result=manager.createQuery("From User", User.class);
		return result.getResultList();
	}

	@Override
	@Transactional
	public boolean updateUser(UserDto user) {
		User user1 = manager.find(User.class, user.getUserId());
		BeanUtils.copyProperties(user, user1);
		return true;
	}

	@Override
	@Transactional
	public int deleteUser(int userId) {
		User user = manager.find(User.class, userId);
		manager.remove(user);
		return 1;
	}

	@Override
	public User getOneUser(int userId) {
		return manager.find(User.class, userId);
	
	}

}
