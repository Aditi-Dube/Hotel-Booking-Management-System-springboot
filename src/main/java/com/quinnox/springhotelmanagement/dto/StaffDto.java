package com.quinnox.springhotelmanagement.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class StaffDto implements Serializable{
	
	private int staffId;
	
	private String staffName;
	
	private int staffSalary;

}
