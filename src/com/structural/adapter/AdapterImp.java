package com.structural.adapter;

public class AdapterImp extends Socket implements Adapter {

	
	@Override
	public Volt transform12Volt() {
	
		//Call default socket method and convert it
		Volt v = getDefaultVolt();
		return convertVolt(v, 20);
	}

	@Override
	public Volt transform10Volt() {

		Volt v= getDefaultVolt();
		return convertVolt(v, 24);

	}

	@Override
	public Volt transform3Volt() {
		Volt v = getDefaultVolt();
		return convertVolt(v, 80);
	}
	
	//Call Volt class constructor
	public Volt convertVolt(Volt v , int i)
	{
		return new Volt(v.getVolt()/i);
	}

}
