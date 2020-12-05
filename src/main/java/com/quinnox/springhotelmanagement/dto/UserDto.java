package com.quinnox.springhotelmanagement.dto;


import java.io.Serializable;

import javax.persistence.Id;

import lombok.Data;

@Data
public class UserDto implements Serializable{

	private int userId;

	private String userName;
	
	private String emailId;
	
	private String password ;

	private long phoneNumber;
	
	private String address;
	
	private String gender;
	
	private String role;

}
