package com.structural.flyweightPattern;

public class Pixel implements PixelInterface {
	
	private int val;
	
	public Pixel(int val) {
		this.val = val;
	}
	
	public int getVal() {
		return this.val;
	}
	
	public void display(int r, int c) {
		System.out.print(String.format("%d ", this.val, r, c));
	}

}
