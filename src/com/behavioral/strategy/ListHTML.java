package com.behavioral.strategy;

import java.util.List;

public class ListHTML implements Listable {


	
	@Override
	public void start(StringBuilder sb)
	{
		sb.append("<ul>").append(System.lineSeparator());
	}
	
	@Override
	public void addIntoList(StringBuilder sb,List<String> items) {
		// TODO Auto-generated method stub
		for(String s: items)
			sb.append("<li>").append(s).append("</li>").append(System.lineSeparator());
	}
	
	@Override
	public void end(StringBuilder sb)
	{
		sb.append("</ul>").append(System.lineSeparator());
	}

}
