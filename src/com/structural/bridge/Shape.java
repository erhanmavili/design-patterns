package com.structural.bridge;

public abstract class Shape {
	// coupling interfaces instead of concrete classes
	
	//injecting interface, 
	protected Color color;
	
	public Shape(Color theColor)
	{
		this.color = theColor;
	}
	
	abstract public void applyColor();
}
