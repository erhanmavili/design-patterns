package com.creational.factory;

public class Hatchback extends Car {

	private String motor;
	private String colour;
	private boolean isAutomatic;
	
	
	public Hatchback(String motor, String colour, boolean isAutomatic) {
		this.motor = motor;
		this.colour = colour;
		this.isAutomatic = isAutomatic;
	}

	@Override
	public String getMotor() {
		// TODO Auto-generated method stub
		return this.motor;
	}

	@Override
	public String getColour() {
		// TODO Auto-generated method stub
		return this.colour;
	}

	@Override
	public boolean isAutomatic() {
		// TODO Auto-generated method stub
		return this.isAutomatic;
	}

}
