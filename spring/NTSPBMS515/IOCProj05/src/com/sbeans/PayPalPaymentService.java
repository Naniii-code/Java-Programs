package com.sbeans;

import org.springframework.stereotype.Service;

@Service("PayPal")
public class PayPalPaymentService implements PaymentService {

	@Override
	public void processPayment(double amount) {
		
		System.out.println("Payment done by paypal "+ amount);
	}

}
