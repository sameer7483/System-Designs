package com.creational.abstractFactoryPattern;

public abstract class Cushion extends Item{

	public String id;
	public String color;
	public double price;
	
	public abstract double getPrice();
	public abstract String getColor();
}
