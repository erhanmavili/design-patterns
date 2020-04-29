package com.structural.adapter;

public class Socket {

	// A classic home type socket which produces 240V 
	
	public Volt getDefaultVolt()
	{
		return new Volt(240);
	}
	
	
	
	
}
