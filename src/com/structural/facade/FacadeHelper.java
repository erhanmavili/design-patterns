package com.structural.facade;

enum Document{ 	PDF,HTML,XML }

enum Connect{ MYSQL,ORACLE,SQLITE}

enum Transport{ MAIL,SMS,CLOUD}

public class FacadeHelper {
	
	
	public static void allInOne(Document theDocument, Connect theConnect, Transport theTransport)
	{
		
		switch (theConnect) {
		case MYSQL: Connection.ConnectMysql();  break;
		case ORACLE: Connection.ConnectOracle();  break;
		case SQLITE: Connection.ConnectSqlite(); break;
		}
		
		switch (theDocument) {
		case PDF: Documentation.getPDF(); break;
		case HTML: Documentation.getHTML(); break;
		case XML: Documentation.getXML(); break;
		}
		
		switch (theTransport) {
		case MAIL: Transportation.sendMail(); break;
		case SMS: Transportation.sendSMS(); break;
		case CLOUD: Transportation.uploadCloud(); break;

		}
		
		
	}
	

}
