package com.structural.proxy;

public class CarProxy extends Car {


	
	public CarProxy(Driver theDriver) {
		super(theDriver);
	}

	// Protection proxy controlled access to drive method  for age
	// if provides -> super , else -> not allow to use it!  
	@Override
	public void drive() {

		if(theDriver.age >= 18) 
			super.drive();
		else 
			System.out.println("Too young to drive !!");
		
	}
	
	
	
}
