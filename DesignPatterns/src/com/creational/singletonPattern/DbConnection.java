package com.creational.singletonPattern;

public class DbConnection {
	private static DbConnection conObj;
	private DbConnection() {	
	}
	public static DbConnection getConnectionInstance() {
		
		if(conObj == null) {
			synchronized(DbConnection.class){
				if(conObj == null) {
					conObj = new DbConnection();
				}
			}
		}
		return conObj;
	}
}
