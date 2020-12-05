package com.quinnox.springhotelmanagement.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.quinnox.springhotelmanagement.dto.PaymentDto;
import com.quinnox.springhotelmanagement.entities.Payment;

@Repository
public class PaymentDaoImpl implements PaymentDao{
	
	@Autowired
	EntityManager manager;
	
	@Transactional
	@Override
	public boolean addPayment(PaymentDto payment) {
		Payment payment1= new Payment();
		BeanUtils.copyProperties(payment, payment1);
		manager.persist(payment1);
		return true;
	}

	@Override
	public List<Payment> getPaymentDetails() {
		TypedQuery<Payment> query=manager.createQuery("From Payment", Payment.class);
		return query.getResultList();
	}

}





	