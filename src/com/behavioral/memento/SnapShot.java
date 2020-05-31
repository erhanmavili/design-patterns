package com.behavioral.memento;

public class SnapShot {

	private Object obj;
	
	public void save(File theFile)
	{
		this.obj = theFile.save();
	}
	
	public void restore(File theFile)
	{
		theFile.restore(obj);
	}
	
}
