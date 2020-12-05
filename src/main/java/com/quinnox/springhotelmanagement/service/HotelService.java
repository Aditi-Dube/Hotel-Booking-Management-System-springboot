package com.quinnox.springhotelmanagement.service;

import java.util.List;

import com.quinnox.springhotelmanagement.entities.Hotel;

public interface HotelService {
	public boolean addHotel(Hotel hotel);
	public List<Hotel> getAllHotels();
	public boolean updateHotel(Hotel hotel);
	public int deleteHotel(int hotelId);
	public Hotel getOneHotel(int hotelId);

}
