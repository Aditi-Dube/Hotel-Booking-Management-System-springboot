package com.quinnox.springhotelmanagement.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.quinnox.springhotelmanagement.dto.StaffDto;
import com.quinnox.springhotelmanagement.entities.Staff;
import com.quinnox.springhotelmanagement.service.StaffService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class StaffController {
	@Autowired
	StaffService service;
	
	@PostMapping("/addstaff")
	public String addStaff(@RequestBody StaffDto staff) {
		service.addStaff(staff);
		return "added succesfully";
	}
	
	@GetMapping("/getstaff")
	public List<Staff> getAllStaffs() {
		return service.getAllStaffs();
	}
	
	@PutMapping("/updatestaff/{staffId}")
	public boolean updateStaff(@PathVariable int staffId, @RequestBody StaffDto staff) {
		return  service.updateStaff(staffId,staff);
		
	}
	
	@DeleteMapping("/deletestaff/{staffId}")
	public boolean deleteStaff(@PathVariable int staffId) {
		return service.deleteStaff(staffId);
			
		}
	
	@GetMapping("/getstaffbyid/{staffId}")
	public Staff getOneStaff(@PathVariable int staffId) {
		return service.getOneStaff(staffId);
		
	}

}



