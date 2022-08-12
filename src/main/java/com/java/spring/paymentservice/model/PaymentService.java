package com.java.spring.paymentservice.model;

import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.java.spring.paymentservice.entity.Payment;
import com.java.spring.paymentservice.repository.PaymentRepository;

@Service
public class PaymentService {
	
	@Autowired
	private PaymentRepository paymentRepository;
	
	public Payment save(@RequestBody Payment payment) {
		payment.setTransactionId(UUID.randomUUID().toString());
		payment.setPaymentStatus(doPaymentProcessing());
		Payment p = paymentRepository.save(payment);
		return p;
	}
	
	public String doPaymentProcessing() {
		
		//typically this should be third party call 
		return new Random().nextBoolean() ? "success" : "fail";
	}
	
	public List<Payment> getAllPayments() {
		return paymentRepository.findAll();
	}
	

}
