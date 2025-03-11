package com.sbeans;

import org.springframework.stereotype.Service;

@Service("CreditCard")
public class CreditCardPaymentService implements PaymentService {

	@Override
	public void processPayment(double amount) {
		
		System.out.println("Payment is done by creditcard "+ amount);
	}

}
