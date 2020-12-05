package com.quinnox.springhotelmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quinnox.springhotelmanagement.dao.PaymentDao;
import com.quinnox.springhotelmanagement.dto.PaymentDto;
import com.quinnox.springhotelmanagement.entities.Payment;

@Service
public class PaymentServiceImpl implements PaymentService{

	@Autowired
	PaymentDao dao;

	@Override
	public boolean addPayment(PaymentDto payment) {
		return dao.addPayment(payment);
	}

	@Override
	public List<Payment> getPaymentDetails() {
		return dao.getPaymentDetails();
	}

}
