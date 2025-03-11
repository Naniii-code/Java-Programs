package com.sbeans;

import java.time.LocalDateTime;

public class WishMessageGenerator 
{
    private LocalDateTime currentDateTime;

	public WishMessageGenerator(LocalDateTime currentDateTime) {
		
		this.currentDateTime = currentDateTime;
	}
    
   public String showWithMessage(String user)
   {
	   String message;
	 int hour=currentDateTime.getHour();
	 
	if(hour<12) {
		message= "Good Morning!!!";
	}else if(hour<16) {
		message= "Good Afternoon!!!";
	}else {
		message= "Good Night!!!";
	}
	 return message + " " + user + "! Current Date and Time: " + currentDateTime;
	   
   }
}
