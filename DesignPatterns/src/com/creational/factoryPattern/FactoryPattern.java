package com.creational.factoryPattern;

public class FactoryPattern {

	public static void main(String[] args) {
		Rug rug1 = RugFactory.getRug("HandKnotted");
		System.out.println(rug1.getPrice());
		Rug rug2 = RugFactory.getRug("HandTufted");
		System.out.println(rug2.getPrice());
	}
}
