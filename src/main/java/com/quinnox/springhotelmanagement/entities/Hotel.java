package com.quinnox.springhotelmanagement.entities;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="hotel")
@Data
public class Hotel{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int hotelId;
	@Column
	private String hotelName;
	@Column
	private String ratings;
	@Column 
	private String hotelLocation;
	
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "hotelid",referencedColumnName = "hotelId")
//	private List<Room> rooms = new ArrayList<Room>();
	

}
