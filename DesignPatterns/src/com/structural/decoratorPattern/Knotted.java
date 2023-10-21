package com.structural.decoratorPattern;

public class Knotted extends BaseRug{

	public Knotted(double width, double length) {
		this.width = width;
		this.length = length;
	}
	@Override
	public int days() {

		return (int)Math.ceil(width*length/2);
	}
}
