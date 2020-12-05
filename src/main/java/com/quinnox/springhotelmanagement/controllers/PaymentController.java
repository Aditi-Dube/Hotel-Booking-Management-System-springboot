package com.quinnox.springhotelmanagement.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.quinnox.springhotelmanagement.dto.PaymentDto;
import com.quinnox.springhotelmanagement.entities.Payment;
import com.quinnox.springhotelmanagement.service.PaymentService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class PaymentController {
	
	@Autowired
	PaymentService service;
	
	@PostMapping("/addpayment")
	public boolean addPayment(@RequestBody PaymentDto payment) {
		return service.addPayment(payment);
		
	}

	@GetMapping("/getpayment")
	public List<Payment> getPaymentDetails(){
		return service.getPaymentDetails();
	}
}