package com.behavioral.mediator;

public class User {

	private String userName;
	private ChatRoom theRoom;
	
	public User(ChatRoom theRoom, String userName)
	{
		this.theRoom=theRoom;
		this.userName=userName;
	}
	
	public void sendMessage(String message)
	{
		
		System.out.println(this.userName +" sending message : "+message);
		theRoom.sendMessage(this, message); // send method handled by the room
	}
	
	public void receiveMessage(String message) {
		System.out.println(this.userName+" received message : "+message);
		
	}

	public String getUserName() {
		return userName;
	}
	
	

}
