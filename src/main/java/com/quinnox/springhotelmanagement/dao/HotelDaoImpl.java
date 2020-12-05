package com.quinnox.springhotelmanagement.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.quinnox.springhotelmanagement.entities.Hotel;

@Repository
public class HotelDaoImpl implements HotelDao {
	@Autowired
	EntityManager manager;
	
	@Override
	@Transactional
	public boolean addHotel(Hotel hotel) {
		manager.persist(hotel);
		return true;
	}

	@Override
	public List<Hotel> getAllHotels() {
		TypedQuery<Hotel> result=manager.createQuery("From Hotel", Hotel.class);
		return result.getResultList();
	}

	@Override
	@Transactional
	public boolean updateHotel(Hotel hotel) {
		Hotel hotel1 =manager.find(Hotel.class, hotel.getHotelId());
		BeanUtils.copyProperties(hotel, hotel1);
		return true;
	}

	@Override
	@Transactional
	public int deleteHotel(int hotelId) {
		Hotel hotel = manager.find(Hotel.class, hotelId);
		manager.remove(hotel);
		return 1;
	
	}

	@Override
	public Hotel getOneHotel(int hotelId) {
		return manager.find(Hotel.class, hotelId);
	}

}
