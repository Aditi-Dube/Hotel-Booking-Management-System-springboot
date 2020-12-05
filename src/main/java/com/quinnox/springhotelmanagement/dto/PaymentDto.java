package com.quinnox.springhotelmanagement.dto;

import lombok.Data;

@Data
public class PaymentDto{

	private int paymentId;
	
	private int roomId;
	
	private String userName;

	private int roomCost;
		
	private long cvv;
	
	
	
}
