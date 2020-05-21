package com.behavioral.chainofresponsible;

public class ManagerNode implements ResponseChain {

	ResponseChain theResponse;
	
	
	@Override
	public void setNextChain(ResponseChain rc) {

		theResponse = rc;
	}

	@Override
	public void handle(Decision theDecision) {

		if(theDecision.getCritical().equals("medium"))
		{
			System.out.println("Decision made by manager");
		}	
		else
		{
			System.out.println("Escalated to Director");
			this.theResponse.handle(theDecision);
		}
	}

}
