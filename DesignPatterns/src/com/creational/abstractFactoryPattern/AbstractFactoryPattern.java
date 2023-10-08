package com.creational.abstractFactoryPattern;

public class AbstractFactoryPattern {

	public static void main(String[] args) {
		Item it = ItemFactory.getItem("Rug");
		System.out.println(it.getOriginCountry());
		
		Item it2 = ItemFactory.getItem("Cushion");
		System.out.println(it2.getOriginCountry());
	}

}
