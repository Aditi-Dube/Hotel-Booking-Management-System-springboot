package com.quinnox.springhotelmanagement.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class RoomDto implements Serializable{
	
	private int roomId;
	
	private String roomType;
	
	private String roomCost;
	
	private int isOccupied;

}
