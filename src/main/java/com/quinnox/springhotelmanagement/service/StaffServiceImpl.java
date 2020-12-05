package com.quinnox.springhotelmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quinnox.springhotelmanagement.dao.StaffDao;
import com.quinnox.springhotelmanagement.dto.StaffDto;
import com.quinnox.springhotelmanagement.entities.Staff;

@Service
public class StaffServiceImpl implements StaffService{

	@Autowired
	StaffDao dao;
	
	@Override
	public boolean addStaff(StaffDto staff) {
		dao.addStaff(staff);
		return true;
	}

	@Override
	public List<Staff> getAllStaffs() {
		return dao.getAllStaffs();
	}

	@Override
	public boolean updateStaff(int staffId,StaffDto staff) {
		dao.updateStaff(staffId,staff);
		return true;
	}

	@Override
	public boolean deleteStaff(int staffId) {
		dao.deleteStaff(staffId);
		return true;
	}

	@Override
	public Staff getOneStaff(int staffId) {
		return dao.getOneStaff(staffId);
	}

}
