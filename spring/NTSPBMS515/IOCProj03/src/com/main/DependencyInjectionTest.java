package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sbeans.WishMessageGenerator;

public class DependencyInjectionTest 
{
	public static void main(String[] args) 
	{

		@SuppressWarnings("resource")
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/cfgs/applicationContext.xml");
		WishMessageGenerator gen=ctx.getBean("wmg",WishMessageGenerator.class);
		String result=gen.showWithMessage("Lokesh");
		System.out.println("Result is "+result);
		
	}
}
