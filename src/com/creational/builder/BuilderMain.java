package com.creational.builder;

public class BuilderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Access inner class and fill as you wish !
		IceCream ic1 = new IceCream.IceCreamBuilder().IsSouced(true).setLemon(2).build();
		IceCream ic2 = new IceCream.IceCreamBuilder().setStrawberry(3).setChoclate(1).build();
		
		
		System.out.println(ic1);
		System.out.println(ic2);
		
		
	}

}
