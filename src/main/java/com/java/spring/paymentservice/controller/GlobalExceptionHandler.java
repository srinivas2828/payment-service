package com.java.spring.paymentservice.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import com.java.spring.paymentservice.global.exception.PaymentNotCreatedException;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	
	@ExceptionHandler(PaymentNotCreatedException.class)
	public Map<String,String> handlePaymentNotFoundException(PaymentNotCreatedException pnce,WebRequest wr) {
		Map<String,String> errors = new HashMap<String,String>();
		errors.put("message", "some issue with the card");
		return errors;
	}

}
