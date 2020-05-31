package com.behavioral.memento;

public class MementoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SnapShot firstSnap = new SnapShot();
		
		File firstFile = new File("theFirst");
		firstFile.write("Hello Everybody !");
		
		firstSnap.save(firstFile);	
		
		System.out.println(firstFile.toString());
		
		firstFile.write("Hola Todos!");
		
		SnapShot secondSnap = new SnapShot();
		
		secondSnap.save(firstFile);
		
		System.out.println(firstFile.toString()); // oopps! Spanish and English mixed
												  // restore the first snap	
		firstSnap.restore(firstFile);
		
		System.out.println(firstFile.toString());
	
		


	}

}
