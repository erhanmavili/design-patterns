package com.structural.decorator;

public class DecoratorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	ColoredShape newItem = new ColoredShape(new Circle(5), "blue");
	ColoredShape second = new ColoredShape(new Square(3),"red");
	
	System.out.println( newItem.info());
	
		
		
	}

}
