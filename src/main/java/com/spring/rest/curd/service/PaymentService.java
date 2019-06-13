package com.spring.rest.curd.service;

import com.spring.rest.curd.dto.PaymentResponse;
import com.spring.rest.curd.model.Payment;

public interface PaymentService {
	
	public PaymentResponse pay(Payment payment) ;
	
	public PaymentResponse getTx(String vendor);

}
