package com.structural.composite;

import java.util.ArrayList;

public class NeuronLayer extends ArrayList<Neuron> implements SomeNeuron {

	//multiple neuron group
	
	
	@Override
	public SomeNeuron connectTo(SomeNeuron theSome) {
		
		//check self-control , and connectto new SomeNeuron
		
		if (this==theSome)
			return this;
		else
		{
			for(Neuron from: this )
				for(Neuron to:theSome)
				{
					//double linklist connection
					from.out.add(to);
					to.in.add(from);
				}
			return theSome;
		}
	}


	
	
}
