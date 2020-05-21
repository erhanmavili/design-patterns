package com.behavioral.chainofresponsible;

public class EmployeeNode implements ResponseChain {

	private ResponseChain theResponse;
	
	@Override
	public void setNextChain(ResponseChain rc) {
		theResponse = rc;

	}

	@Override
	public void handle(Decision theDecision) {

		if(theDecision.getCritical().equals("low"))
		{
			System.out.println("Decision made by employee");
		}	
		else
		{
			System.out.println("Escalated to Manager");
			this.theResponse.handle(theDecision);
		}
	}

}
