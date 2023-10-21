package com.structural.decoratorPattern;

public class Tufted extends BaseRug{
	
	public Tufted(double width, double length) {
		this.width = width;
		this.length = length;
	}	
	@Override
	public int days() {

		return (int)Math.ceil(width*length/13.0);
	}
	

}
