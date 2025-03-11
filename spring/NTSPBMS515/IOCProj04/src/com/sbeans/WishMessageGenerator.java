package com.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("wmg")
public class WishMessageGenerator 
{
	@Autowired
   LocalDateTime currentDateTime;
   
   public WishMessageGenerator(LocalDateTime currentDateTime)
   {
	   this.currentDateTime=currentDateTime;
   }
   
  
public String generateWithMessage(String user)
   {
	   int time=currentDateTime.getHour();
	   
	   if(time<12)
	   {
		   return "Good Morning "+user+" "+currentDateTime;
	   }else if(time>=12 && time<16)
	   {
		   return "Good Afternoon "+user+" "+currentDateTime;
	   }else {
		   
		   return "Good Night "+user+" "+currentDateTime;
	   }
   }
}
