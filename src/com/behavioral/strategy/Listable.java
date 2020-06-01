package com.behavioral.strategy;

import java.util.List;

public interface Listable {
	
	default void start(StringBuilder sb) {}
	void addIntoList(StringBuilder sb, List<String> items);
	default void end(StringBuilder sb) {}

}
