package com.structural.proxy;

public class ProxyMain {

	public static void main(String[] args) {

		// without proxy accessing the resource 
		Car car1 = new Car(new Driver(12));
		car1.drive();
		
		//protection proxy not allow to use it
		Car car2 = new CarProxy(new Driver(12));
		car2.drive();
		

	}

}
