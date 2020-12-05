package com.quinnox.springhotelmanagement.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.quinnox.springhotelmanagement.dto.StaffDto;
import com.quinnox.springhotelmanagement.entities.Staff;
import com.quinnox.springhotelmanagement.entities.User;

@Repository
public class StaffDaoImpl implements StaffDao{

	@Autowired
	EntityManager manager;
	
	@Override
	@Transactional
	public boolean addStaff(StaffDto staff) {
		Staff staff1 = new Staff();
		BeanUtils.copyProperties(staff, staff1);
		manager.persist(staff1);
		return true;
	}

	@Override
	public List<Staff> getAllStaffs() {
		TypedQuery<Staff> result=manager.createQuery("From Staff",Staff.class);
		return result.getResultList();
		
	}

	@Override
	@Transactional
	public boolean updateStaff(int staffId,StaffDto staff) {
		Staff staff1 = manager.find(Staff.class,staffId);
		staff1.setStaffName(staff.getStaffName());
		staff1.setStaffSalary(staff.getStaffSalary());
//		BeanUtils.copyProperties(staff, staff1);
		return true;
	}

	@Override
	@Transactional
	public boolean deleteStaff(int staffId) {
		Staff staff = manager.find(Staff.class, staffId);
		manager.remove(staff);
		return true;
	}

	@Override
	public Staff getOneStaff(int staffId) {
		return manager.find(Staff.class, staffId);
	}
}
