package com.structural.composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Neuron implements SomeNeuron {

// single neuron object	
	
	public ArrayList<Neuron> in;
	
	public ArrayList<Neuron> out;

	@Override
	public Iterator<Neuron> iterator() {
		
		// Making single object as iterator
		return Collections.singleton(this).iterator();
	}

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
