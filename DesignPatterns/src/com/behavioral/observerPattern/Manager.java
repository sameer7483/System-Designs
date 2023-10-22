package com.behavioral.observerPattern;

public class Manager implements Observer {

	@Override
	public void notifyChange(Rug rug) {
		System.out.println("Manager says rug status changed to: " + rug.status);
	}

}
