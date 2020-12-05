package com.quinnox.springhotelmanagement.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.quinnox.springhotelmanagement.entities.Hotel;
import com.quinnox.springhotelmanagement.service.HotelService;

@RestController
public class HotelController {
	
	@Autowired
	HotelService service;
	
	@PostMapping("/addhotel")
	public String addHotel(@RequestBody Hotel hotel) {
		service.addHotel(hotel);
		return "added succesfully";
	}
	
	@GetMapping("/gethotel")
	public List<Hotel> getAllHotels() {
		return service.getAllHotels();
	}
	
	@PutMapping("/updatehotel")
	public String updateHotel(@RequestBody Hotel hotel) {
		service.updateHotel(hotel);
		return "Updated succesfully";
	}
	
	@DeleteMapping("/deletehotel")
	public String deleteHotel(int hotelId) {
		service.deleteHotel(hotelId);
		return "deleted";
	}
	
	@GetMapping("/getonehotel")
	public Hotel getOneHotel(int hotelId) {
		return service.getOneHotel(hotelId);
	}

}
