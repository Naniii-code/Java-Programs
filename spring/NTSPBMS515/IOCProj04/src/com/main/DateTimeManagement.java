package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.AppConfig;
import com.sbeans.WishMessageGenerator;

public class DateTimeManagement {

	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		Object bean = ctx.getBean("wmg");
		
		WishMessageGenerator wmg=(WishMessageGenerator)bean;
		
		String msg=wmg.generateWithMessage("loki");
		
		System.out.println("Result is "+msg);
		
		
		ctx.close();
	}

}
