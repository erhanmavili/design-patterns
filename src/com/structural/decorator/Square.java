package com.structural.decorator;

public class Square implements Shape {

	private int length;
	
	public Square(int length) {
		this.length = length;
	}

	@Override
	public String info() {
		// TODO Auto-generated method stub
		return "this is a square";
	}

}
