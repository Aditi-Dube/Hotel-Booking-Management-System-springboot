package com.quinnox.springhotelmanagement.dao;

import java.util.List;

import com.quinnox.springhotelmanagement.entities.Hotel;

public interface HotelDao {
	public boolean addHotel(Hotel hotel);
	public List<Hotel> getAllHotels();
	public boolean updateHotel(Hotel hotel);
	public int deleteHotel(int hotelId);
	public Hotel getOneHotel(int hotelId);


}
