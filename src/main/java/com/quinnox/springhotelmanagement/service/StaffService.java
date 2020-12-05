package com.quinnox.springhotelmanagement.service;

import java.util.List;

import com.quinnox.springhotelmanagement.dto.StaffDto;
import com.quinnox.springhotelmanagement.entities.Staff;

public interface StaffService {
	public boolean addStaff(StaffDto staff);
	public List<Staff> getAllStaffs();
	public boolean updateStaff(int staffId,StaffDto staff);
	public boolean deleteStaff(int staffId);
	public Staff getOneStaff(int staffId);
	
}


