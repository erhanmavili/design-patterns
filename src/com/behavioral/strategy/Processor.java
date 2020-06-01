package com.behavioral.strategy;

import java.util.List;
import java.util.function.Supplier;

public class Processor<LS extends Listable> {
	
	
	private LS strategy;
	private StringBuilder sb = new StringBuilder();
	
	
	public Processor(Supplier<? extends LS> con)
	{
		strategy = con.get();
	}
	
	public void appendList(List<String> items)
	{
		strategy.start(sb);
		strategy.addIntoList(sb,items);
		strategy.end(sb);
	}

	@Override
	public String toString() {
		return  sb.toString();
	}
	
	
	

}
