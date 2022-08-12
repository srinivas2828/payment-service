package com.java.spring.paymentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.spring.paymentservice.entity.Payment;

public interface PaymentRepository   extends JpaRepository<Payment, Integer>{

}
