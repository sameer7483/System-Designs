package com.structural.decoratorPattern;

public class DecoratorPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseRug rug = new SimplePattern(new ComplexPattern(new Tufted(5, 8)));
		System.out.println(rug.days());
	}

}
