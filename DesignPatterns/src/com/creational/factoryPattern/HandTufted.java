package com.creational.factoryPattern;

public class HandTufted extends Rug{

	@Override
	public double getPrice() {
		
		return 25.4;
	}

	@Override
	public int timeToWeave() {
		return 5;
	}

}
