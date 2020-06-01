package com.behavioral.strategy;

import java.util.List;

public class ListMarkdown implements Listable {

	
	@Override
	public void addIntoList(StringBuilder sb, List<String> items) {
		
		for(String s : items)
			sb.append("*").append(s).append(System.lineSeparator());

	}

}
