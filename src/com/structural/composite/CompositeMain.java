package com.structural.composite;

public class CompositeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SomeNeuron n1 = new Neuron();
		SomeNeuron n2 = new NeuronLayer();
		SomeNeuron n3 = new Neuron();
		SomeNeuron n4 = new NeuronLayer();
		
		n1.connectTo(n2);	//single to layer
		n2.connectTo(n3);	//layer to single
		n1.connectTo(n3);	// single to single
		n2.connectTo(n4);	// layer to layer
		
	}

}
