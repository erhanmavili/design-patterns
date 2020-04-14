package com.creational.builder;

public class IceCream {
	
	// balls of ice cream 
	
	private int lemon;
	
	private int choclate;
	
	private int strawberry;
	
	private int vanilla;
	
	private boolean souce;

	// Do not Setter funcs,  will be build in BuilderClass
	
	public int getLemon() {
		return lemon;
	}

	public int getChoclate() {
		return choclate;
	}

	public int getStrawberry() {
		return strawberry;
	}

	public int getVanilla() {
		return vanilla;
	}

	public boolean isSouce() {
		return souce;
	}
	
	//From nested class to outer class
	public IceCream(IceCreamBuilder icBuilder)
	{
		this.lemon = icBuilder.lemon;
		this.choclate = icBuilder.choclate;
		this.strawberry= icBuilder.strawberry;
		this.vanilla = icBuilder.vanilla;
		this.souce=icBuilder.souce;
	}
	
	
	
	@Override
	public String toString() {
		return "IceCream [lemon=" + lemon + ", choclate=" + choclate + ", strawberry=" + strawberry + ", vanilla="
				+ vanilla + ", souce=" + souce + "]";
	}




	public static class IceCreamBuilder
	{
		
		private int lemon;
		
		private int choclate;
		
		private int strawberry;
		
		private int vanilla;
		
		private boolean souce;
		
		//setter in nested class , with builder same return type -> Fluent Builder
		public IceCreamBuilder setLemon(int lemon)
		{
			this.lemon = lemon;
			return this;
		}
		
		public IceCreamBuilder setChoclate(int choclate)
		{
			this.choclate = choclate;
			return this;
		}
		
		public IceCreamBuilder setStrawberry(int strawberry)
		{
			this.strawberry = strawberry;
			return this;
		}
		
		public IceCreamBuilder setVanilla(int vanilla)
		{
			this.vanilla = vanilla;
			return this;
		}
		
		public IceCreamBuilder IsSouced(boolean souce)
		{
			this.souce = souce;
			return this;
		}
		
		
		public IceCream build()
		{
			return new IceCream(this);
		}
		
		
	}
	
	
	
	

}
