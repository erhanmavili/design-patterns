package com.creational.factory;

public abstract class Car {

 public abstract String getMotor();
 public abstract String getColour();
 public abstract boolean isAutomatic();
 
@Override
public String toString() {
	return "Car [getMotor()=" + this.getMotor() + ", getColour()=" + this.getColour() + ", isAutomatic()=" + this.isAutomatic() + "]";
}
	
 
 
 
}
