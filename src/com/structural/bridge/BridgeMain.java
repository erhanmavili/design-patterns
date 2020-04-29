package com.structural.bridge;

public class BridgeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Preventing Cartesian-product duplication
		
		Shape redTriangle = new Triangle(new Red());
		redTriangle.applyColor();
		
		Shape blueCircle = new Circle(new Blue());
		blueCircle.applyColor();
		
	}

}
