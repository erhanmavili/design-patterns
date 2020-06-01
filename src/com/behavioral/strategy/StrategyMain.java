package com.behavioral.strategy;

import java.util.List;

public class StrategyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Processor<ListHTML> html = new Processor<>(ListHTML::new);
	html.appendList(List.of("azul","negro","blanco"));
	System.out.println(html);

	Processor<ListMarkdown> md = new Processor<>(ListMarkdown::new);
	md.appendList(List.of("mesa","silla","casa"));
	System.out.println(md);
	
	}

}
