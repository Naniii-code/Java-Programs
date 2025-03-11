package com.config;

import java.time.LocalDateTime;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

@ComponentScan(basePackages="com.sbeans")
public class AppConfig 
{

	public AppConfig() 
	{
		System.out.println("App config 0-param constructor");
	}
	
	@Bean(name="ltime")
	public LocalDateTime createDateTime()
	{
		System.out.println("AppConfig.createDateTime()");
		return LocalDateTime.now();
	}
   
}
