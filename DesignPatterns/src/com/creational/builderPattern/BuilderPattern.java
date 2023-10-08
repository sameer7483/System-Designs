package com.creational.builderPattern;

public class BuilderPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RugBuilder rb = new RugBuilder();
		Rug rug = rb.id("1").type("HandKnotted").length(5).width(8).build();
		System.out.println(rug.type);
	}

}
