package com.creational.abstractFactoryPattern;

public class FloorCushion extends Cushion{

	@Override
	public double getPrice() {
		return 10.5;
	}

	@Override
	public String getColor() {
		return "blue";
	}

	@Override
	public String getOriginCountry() {
		// TODO Auto-generated method stub
		return "India";
	}

}
