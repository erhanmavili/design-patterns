package com.structural.composite;

public interface SomeNeuron extends Iterable<Neuron> {

	//uniform of  neuron group and single neuron object
	
	public SomeNeuron connectTo(SomeNeuron theSome);
}
