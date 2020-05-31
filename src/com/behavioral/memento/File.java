package com.behavioral.memento;

public class File {

	private String fileName;
	private StringBuilder data;
	
	public File(String fileName) {
		this.fileName = fileName;
		this.data = new StringBuilder();
	}
	

	@Override
	public String toString() {
		return "File [fileName=" + fileName + ", data=" + data + "]";
	}


	public void write(String message)
	{
		data.append(message);
	}
	
	// return type memento! trigger inner memento class
	public Memento save()
	{
		return new Memento(this.fileName, this.data);
	}
	
	// cast type and assignment from  inner to outer class
	public void restore(Object obj)
	{
		Memento theMemento = (Memento) obj;
		this.fileName = theMemento.fileName;
		this.data = theMemento.data;
	}
	
	
	
	
	
	// Inner memento class, same attributes, deep copy of existing data  
	private class Memento
	{
		private String fileName;
		private StringBuilder data;
		
		public Memento(String fileName, StringBuilder data) {
			this.fileName = fileName;
			this.data = new StringBuilder(data);
		}
		
		
		
		
	}
	
}
