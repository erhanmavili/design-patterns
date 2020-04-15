package com.creational.factory;

public class CarFactory {
	
	public static Car getNewCar(String type, String motor, String colour, boolean isAutomatic)
	{
		if(type.equalsIgnoreCase("sedan"))
		{
			return new Sedan(motor, colour, isAutomatic);
		}else
		{
			return new Hatchback(motor, colour, isAutomatic);
		}
		// In following scenarios SUV type may added
		
	}
	
	
	
	

}
