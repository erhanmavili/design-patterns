package com.creational.factory;

public class FactoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car myNewCar = CarFactory.getNewCar("sedan", "1600cc", "blue", true);
		Car mySecondCar = CarFactory.getNewCar("hatchback", "1400cc", "red", false);
		
		//Produced in same factory but different types!
		// Sub-classes may maintained without changing CarFactory class, so car producing may continue;)
		
		System.out.println(myNewCar+" is a type of  "+myNewCar.getClass());
		
		System.out.println(mySecondCar+" is a type of  "+mySecondCar.getClass());
		
	}

}
