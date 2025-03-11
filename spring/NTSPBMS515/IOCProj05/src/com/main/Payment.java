package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cfgs.AppConfig;
import com.sbeans.PaymentProcessor;

public class Payment {

	public static void main(String[] args) 
	{
	 AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
	 
	 Object bean = ctx.getBean("pay");
	PaymentProcessor pp=(PaymentProcessor)bean;
	
	pp.makePayment(10000.0);
	ctx.close();
	 
	}

}
