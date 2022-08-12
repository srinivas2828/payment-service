package com.java.spring.paymentservice.global.exception;

public class PaymentNotCreatedException  extends RuntimeException{
	
	public String message;
	
	public PaymentNotCreatedException(String message) {
		super(message);
	}

}
