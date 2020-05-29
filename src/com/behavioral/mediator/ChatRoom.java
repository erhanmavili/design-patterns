package com.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom {
	
	private List<User> users;
	
	public ChatRoom()
	{
		this.users = new ArrayList<User>();
	}
	
	public void addUser(User theUser)
	{
		this.users.add(theUser);
		System.out.println(theUser.getUserName()+" has joined the room");
	}
	
	public void sendMessage(User theReceiver, String message)
	{
		for( User u: this.users)
		{
			//self message check 
			if(u!=theReceiver)
			{
				u.receiveMessage(message);
			}
			
		}
	}

}
