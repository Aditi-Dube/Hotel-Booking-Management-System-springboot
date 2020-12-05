package com.quinnox.springhotelmanagement.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.quinnox.springhotelmanagement.dto.RoomDto;
import com.quinnox.springhotelmanagement.entities.Room;

@Repository
public class RoomDaoImpl implements RoomDao {
	@Autowired
	EntityManager manager;
	
	@Override
	@Transactional
	public boolean addRoom(RoomDto room) {
		Room room1 =new Room();
		BeanUtils.copyProperties(room, room1);
		manager.persist(room1);
			return true;
	}

	@Override
	public List<Room> getAllRooms() {
		TypedQuery<Room> result=manager.createQuery("From Room", Room.class);
		return result.getResultList();
		
	}

	@Override
	@Transactional
	public boolean updateRoom(int roomId, RoomDto room) {
		Room room1=manager.find(Room.class, roomId);
		room1.setRoomType(room.getRoomType());
		room1.setRoomCost(room.getRoomCost());
		room1.setIsOccupied(room.getIsOccupied());
		return true;
	}

	@Override
	@Transactional
	public boolean deleteRoom(int roomId) {
		Room room = manager.find(Room.class, roomId);
		manager.remove(room);
		return true;
	}

	@Override
	public Room getOneRoom(int roomId) {
		return manager.find(Room.class, roomId);
	}
	
	@Override
	public List<Room> getVaccantRooms(){
		TypedQuery<Room> query = manager.createQuery("select r from Room r where r.isOccupied =0",Room.class);
		return query.getResultList();
	}

}
