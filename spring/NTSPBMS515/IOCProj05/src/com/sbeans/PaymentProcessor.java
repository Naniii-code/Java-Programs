package com.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("pay")
public class PaymentProcessor 
{
	PaymentService paymentservice;
   @Autowired
  
   
   public PaymentProcessor (@Qualifier("PayPal") PaymentService paymentservice) {
	   this.paymentservice=paymentservice;
   }
   
   public void makePayment(double amount)
   {
	   paymentservice.processPayment(amount);
   }
   
   
}
