package com.behavioral.observerPattern;

public class ObserverPattern {

	public static void main(String[] args) {
		// Intent: one to many relationship between objects so that if
		// state of one changes everyone is notified
		
		Rug rug = new Rug();
		rug.status = "DEFAULT";
		Observer manager = new Manager();
		Observer customer = new Customer();
		rug.addObserver(manager);
		rug.addObserver(customer);
		rug.setStatus("ON-LOOM");
	}
}
