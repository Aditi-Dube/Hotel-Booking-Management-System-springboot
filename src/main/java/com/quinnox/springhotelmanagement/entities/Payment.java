package com.quinnox.springhotelmanagement.entities;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;

	import lombok.Data;

	@Data
	@Entity
	@Table(name = "payment")
	public class Payment {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "paymentId")
		private int paymentId;
		
		@Column(name="roomId")
		private int roomId;
		
		@Column(name="userName")
		private String userName;
		
		@Column(name = "roomCost")
		private int roomCost;
		
		@Column(name="cvv")
		private long cvv;
		
	}



