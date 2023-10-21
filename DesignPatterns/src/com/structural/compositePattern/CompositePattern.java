package com.structural.compositePattern;

public class CompositePattern {

	public static void main(String[] args) {
		Directory d1 = new Directory("Chillida");
		File f1 = new File("Black");
		Directory d2 = new Directory("Istambul");
		File f2 = new File("White");
		d1.add(f1);
		d2.add(f2);
		d1.add(d2);
		d1.ls();
		
		
	}
}
