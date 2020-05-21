package com.behavioral.chainofresponsible;

public class ChainMain {

	public static void main(String[] args) {
	
	ChainClass theChain = new ChainClass();		

	System.out.println("-----------");
	Decision dec = new Decision("medium");	
	theChain.chain.handle(dec); // triggering the ResponseChain object

	System.out.println("-----------");
	Decision dec2 = new Decision("low");
	theChain.chain.handle(dec2);
	
	System.out.println("-----------");
	Decision dec3 = new Decision("high");
	theChain.chain.handle(dec3);
		
	}

}
