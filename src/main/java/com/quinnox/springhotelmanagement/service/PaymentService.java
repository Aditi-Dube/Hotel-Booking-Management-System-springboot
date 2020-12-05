package com.quinnox.springhotelmanagement.service;

import java.util.List;

import com.quinnox.springhotelmanagement.dto.PaymentDto;
import com.quinnox.springhotelmanagement.entities.Payment;

public interface PaymentService {
	public boolean addPayment(PaymentDto dto);
	public List<Payment> getPaymentDetails();

}
