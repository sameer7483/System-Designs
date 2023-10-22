package com.behavioral.observerPattern;

public class Customer implements Observer{

	@Override
	public void notifyChange(Rug rug) {
		System.out.println("Customer says rug status changed to: " + rug.status);
	}

}
