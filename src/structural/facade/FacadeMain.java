package structural.facade;

public class FacadeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// instead 3 lines of code, with 1 line with facade layer
		
//		Connection.ConnectOracle();
//		Documentation.getPDF();
//		Transportation.uploadCloud();
		
		
		FacadeHelper.allInOne(Document.PDF, Connect.ORACLE, Transport.CLOUD);
		
		
		
	}

}
