package com.creational.singletonPattern;

public class SingletonPattern {

	public static void main(String[] args) {
		System.out.println(DbConnection.getConnectionInstance());
		System.out.println(DbConnection.getConnectionInstance());
	}

}
