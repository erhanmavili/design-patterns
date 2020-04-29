package com.structural.adapter;

public class AdapterMain {

	public static void main(String[] args) {

		
		
		AdapterImp theAdapter = new AdapterImp();
		
		System.out.println("Adapter is producing "+theAdapter.transform10Volt().getVolt());
		
		System.out.println("Adapter is producing "+theAdapter.transform3Volt().getVolt());

	}

}
