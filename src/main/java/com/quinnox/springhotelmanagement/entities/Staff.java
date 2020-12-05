package com.quinnox.springhotelmanagement.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="staff")
public class Staff{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="staffId")
	private int staffId;
	
	@Column(name="staffName")
	private String staffName;
	
	@Column(name="staffSalary")
	private int staffSalary;
	
}
