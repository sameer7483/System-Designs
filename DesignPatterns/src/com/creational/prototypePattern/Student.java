package com.creational.prototypePattern;

public class Student implements PrototypeInterface{
	public String id;
	public String name;
	
	public Student(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public Object cloneCopy() {
		return new Student(id, name);
	}

}
