package com.creational.prototypePattern;

public class Employee implements PrototypeInterface{
	public String id;
	public String company;
	
	public Employee(String id, String company) {
		super();
		this.id = id;
		this.company = company;
	}

	@Override
	public Object cloneCopy() {
		// TODO Auto-generated method stub
		return new Employee(id, company);
	}

}
