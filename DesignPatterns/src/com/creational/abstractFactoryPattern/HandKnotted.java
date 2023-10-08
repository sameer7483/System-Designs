package com.creational.abstractFactoryPattern;

public class HandKnotted extends Rug{

	@Override
	public double getPrice() {
		
		return 40.5;
	}

	@Override
	public int timeToWeave() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public String getOriginCountry() {
		// TODO Auto-generated method stub
		return "India";
	}

	
}
