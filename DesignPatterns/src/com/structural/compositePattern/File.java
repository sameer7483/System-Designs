package com.structural.compositePattern;

public class File implements FileSystem{
	String name;
	public File(String name) {
		this.name = name;
	}
	@Override
	public boolean add(FileSystem fs) {
		System.out.println("Not a Directory");
		return false;
	}

	@Override
	public void ls() {
		
		System.out.println(name);
	}

}
