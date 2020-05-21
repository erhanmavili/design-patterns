package com.behavioral.chainofresponsible;

public class DirectorNode implements ResponseChain {

	ResponseChain theResponse;
	
	@Override
	public void setNextChain(ResponseChain rc) {
	
		theResponse = rc;

	}

	@Override
	public void handle(Decision theDecision) {

		if(theDecision.getCritical().equals("high"))
		{
			System.out.println("Decision made by director");
		}	
	}

}
