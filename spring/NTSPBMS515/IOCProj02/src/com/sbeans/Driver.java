package com.sbeans;

public class Driver 
{
   private final CarService cs;
   
   public Driver(CarService cs)
   {
	   this.cs=cs;
   }
   
   public void drive()
   {
	   cs.startEngine();
	   System.out.println("Driver is now driving the car");
   }
}
