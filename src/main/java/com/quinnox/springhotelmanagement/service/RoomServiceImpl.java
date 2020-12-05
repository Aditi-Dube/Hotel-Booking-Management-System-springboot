package com.quinnox.springhotelmanagement.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quinnox.springhotelmanagement.dao.RoomDao;
import com.quinnox.springhotelmanagement.dto.RoomDto;
import com.quinnox.springhotelmanagement.entities.Room;

@Service
public class RoomServiceImpl implements RoomService{

	
	@Autowired
	RoomDao dao;
	
	@Override
	public boolean addRoom(RoomDto room) {
		dao.addRoom(room);
		return true;
	}

	@Override
	public List<Room> getAllRooms() {
		return dao.getAllRooms(); 
	}

	@Override
	public boolean updateRoom(int roomId,RoomDto room) {
		dao.updateRoom(roomId,room);
		return true;
	}

	@Override
	public boolean deleteRoom(int roomId) {
		dao.deleteRoom(roomId);
		return true;
	}

	@Override
	public Room getOneRoom(int roomId) {
		return dao.getOneRoom(roomId);
	}

	@Override
	public List<Room> getVaccantRooms() {
		return dao.getVaccantRooms();
	}

}
