package com.quinnox.springhotelmanagement.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.quinnox.springhotelmanagement.dto.UserDto;
import com.quinnox.springhotelmanagement.entities.User;
import com.quinnox.springhotelmanagement.service.UserService;
@CrossOrigin(origins ="http://localhost:3000")
@RestController
public class UserController {
	@Autowired
	UserService service;
	
	@PostMapping("/adduser")
	public String addUser(@RequestBody UserDto user) {
		service.addUser(user);
		return "added succesfully";
	}
	
	@GetMapping("/getuser")
	public List<User> getAllUsers() {
		return service.getAllUsers();
	}
	
	@PutMapping("/update")
	public String updateUser(@RequestBody UserDto user) {
		service.updateUser(user);
		return "Updated succesfully";
	}
	
	@DeleteMapping("/delete")
	public String deleteUser(int userId) {
		service.deleteUser(userId);
		return"deleted";
	}
	
	@GetMapping("/getone")
	public User getOneUser(int userId) {
		return service.getOneUser(userId);
		
	}

}
