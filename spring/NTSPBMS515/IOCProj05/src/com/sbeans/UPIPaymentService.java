package com.sbeans;

import org.springframework.stereotype.Service;

@Service("UPIPayment")
public class UPIPaymentService implements PaymentService {

	@Override
	public void processPayment(double amount) {
		System.out.println("Payment is done by UPI "+ amount);
	}

}
