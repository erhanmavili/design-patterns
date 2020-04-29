package com.structural.bridge;

public class Triangle extends Shape {


	public Triangle(Color theColor) {
		super(theColor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void applyColor() {
		// TODO Auto-generated method stub
		System.out.print("Triange created and ");
		color.paintIt();
	}

}
