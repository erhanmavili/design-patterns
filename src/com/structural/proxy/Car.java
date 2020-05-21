package com.structural.proxy;

public class Car implements Drivable {

	
	protected Driver theDriver;
	
	
	public Car(Driver theDriver) {
		this.theDriver = theDriver;
	}


	@Override
	public void drive() {
		System.out.println("Car is being driven");

	}

}
