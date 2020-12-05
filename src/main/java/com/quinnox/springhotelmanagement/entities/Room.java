package com.quinnox.springhotelmanagement.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Data;

@Table(name="rooms")
@Data
@Entity
public class Room {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="roomId")
	private int roomId;
	
	@Column(name="roomType")
	private String roomType;
	
	@Column(name="roomCost")
	private String roomCost;
	
	@Column(name="isOccupied")
	private int isOccupied;

}
