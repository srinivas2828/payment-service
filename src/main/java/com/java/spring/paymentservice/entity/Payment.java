package com.java.spring.paymentservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="payment_tbl")
public class Payment {
	
	@Id
	@GeneratedValue
	private int id;
	private double amount;
	private String paymentStatus;
	private String transactionId;
	private int orderId;
	private double paymentAmount;
	
	public Payment() {}
	
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public double getPaymentAmount() {
		return paymentAmount;
	}
	public void setPaymentAmount(double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public Payment(int id, double amount, String paymentStatus, String transactionId) {
		super();
		this.id = id;
		this.amount = amount;
		this.paymentStatus = paymentStatus;
		this.transactionId = transactionId;
	}
	public Payment(int id, double amount, String paymentStatus, String transactionId, int orderId,
			double paymentAmount) {
		super();
		this.id = id;
		this.amount = amount;
		this.paymentStatus = paymentStatus;
		this.transactionId = transactionId;
		this.orderId = orderId;
		this.paymentAmount = paymentAmount;
	}
	
	

}
