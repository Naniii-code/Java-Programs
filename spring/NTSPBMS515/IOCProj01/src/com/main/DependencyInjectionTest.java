package com.main;


import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {

	public static void main(String[] args) 
	{
		FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/cfgs/applicationContext.xml");
		WishMessageGenerator gen=ctx.getBean("wmg",WishMessageGenerator.class);
		String result=gen.showWithMessage("loki");
		System.out.println("Result is "+result);
		ctx.close();
	}
}
