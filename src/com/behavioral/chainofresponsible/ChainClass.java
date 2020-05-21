package com.behavioral.chainofresponsible;

public class ChainClass {

	// hierarchy chain will  set in here
	
	public ResponseChain chain;
	
	public ChainClass() {

		// chain order
		this.chain = new EmployeeNode();
		ResponseChain chain2 = new ManagerNode();
		chain.setNextChain(chain2);
		ResponseChain chain3 = new DirectorNode();
		chain2.setNextChain(chain3);
		
	}
	
	
}
