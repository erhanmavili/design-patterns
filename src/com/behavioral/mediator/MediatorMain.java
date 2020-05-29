package com.behavioral.mediator;

public class MediatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Chatroom is the actuaal mediator, it handles send message
		// when User calling it's send method,  it triggers -> mediator's method
		
		ChatRoom facebook = new ChatRoom();
		User eran = new User(facebook, "HunterStrike");
		User emico = new User(facebook, "daScorpion");
		User gorki = new User(facebook, "BlueShan");
		User celik = new User(facebook, "Zgr968");
		
		facebook.addUser(eran);
		facebook.addUser(emico);
		facebook.addUser(gorki);
		facebook.addUser(celik);
		
		celik.sendMessage("Hello everybodyy !!");
		
		
		
	}

}
