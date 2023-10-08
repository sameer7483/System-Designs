package com.creational.abstractFactoryPattern;

public class SofaCushion extends Cushion{

	@Override
	public double getPrice() {
		return 5.5;
	}

	@Override
	public String getColor() {
		return "red";
	}

	@Override
	public String getOriginCountry() {
		// TODO Auto-generated method stub
		return "Nepal";
	}

}
