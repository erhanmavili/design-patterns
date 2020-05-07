package com.structural.decorator;

public class ColoredShape implements Shape {

	// imagine you completed,tested Circle and Square classes
	// A new request came, color ---> open closed principle
	// Do not change old classes, create a new decorator class
	
	private Shape theShape;
	private	String color;
	
	
	public ColoredShape(Shape theShape, String color) {
		this.theShape = theShape;
		this.color = color;
	}


	@Override
	public String info() {
		// TODO Auto-generated method stub
	return theShape.info()+" and it's color is "+this.color;
	}

}
