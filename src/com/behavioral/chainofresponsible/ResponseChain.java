package com.behavioral.chainofresponsible;

public interface ResponseChain {
	
	void setNextChain(ResponseChain rc);
	
	void handle(Decision theDecision);
	
}
