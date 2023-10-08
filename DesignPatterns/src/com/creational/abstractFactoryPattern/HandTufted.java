package com.creational.abstractFactoryPattern;

public class HandTufted extends Rug{

	@Override
	public double getPrice() {
		
		return 25.4;
	}

	@Override
	public int timeToWeave() {
		return 5;
	}

	@Override
	public String getOriginCountry() {
		// TODO Auto-generated method stub
		return "India";
	}

}
