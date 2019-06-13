package com.spring.rest.curd.dto;

import java.util.List;

import com.spring.rest.curd.model.Payment;

public class PaymentResponse {
	private String status;
	private String message;
	private String txDate;
	private List<Payment> payments;
	
	public List<Payment> getPayments() {
		return payments;
	}
	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getTxDate() {
		return txDate;
	}
	public void setTxDate(String txDate) {
		this.txDate = txDate;
	}
	
	

}
