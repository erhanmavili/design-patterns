package com.structural.bridge;

public class Circle extends Shape {


	public Circle(Color theColor) {
		super(theColor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void applyColor() {
		// TODO Auto-generated method stub
		System.out.print("Circle created and ");
		color.paintIt();
	}

}
