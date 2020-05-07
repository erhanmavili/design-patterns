package com.structural.decorator;

public class Circle implements Shape {

	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public String info() {
		// TODO Auto-generated method stub
		return " this is a circle";
	}

}
