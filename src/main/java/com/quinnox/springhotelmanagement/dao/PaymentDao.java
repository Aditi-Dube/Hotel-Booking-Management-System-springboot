package com.quinnox.springhotelmanagement.dao;

import java.util.List;

import com.quinnox.springhotelmanagement.dto.PaymentDto;
import com.quinnox.springhotelmanagement.entities.Payment;

public interface PaymentDao {
	
	public boolean addPayment(PaymentDto dto);
	public List<Payment> getPaymentDetails();

}
