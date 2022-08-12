package com.java.spring.paymentservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.spring.paymentservice.entity.Payment;
import com.java.spring.paymentservice.global.exception.PaymentNotCreatedException;
import com.java.spring.paymentservice.model.PaymentService;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {
	

	@Autowired
	private PaymentService paymentService;
	
	@PostMapping("/save")
	public ResponseEntity<Payment> save(@RequestBody Payment payment) throws PaymentNotCreatedException {
		Payment p = paymentService.save(payment);
		if(p != null) {
			return new ResponseEntity(p,HttpStatus.CREATED);
		}else {
			throw new PaymentNotCreatedException("Payment Not created");
		}
	}
	
	@GetMapping("/getAllPayments")
	public ResponseEntity<List<Payment>> get() {
		return new ResponseEntity(paymentService.getAllPayments(),HttpStatus.OK);
	}
	
	
}
