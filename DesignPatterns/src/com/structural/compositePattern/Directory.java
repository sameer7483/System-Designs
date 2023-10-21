package com.structural.compositePattern;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{
	String name;
	List<FileSystem> fs;
	public Directory(String name) {
		this.name = name;
		fs = new ArrayList<>();
	}
	@Override
	public boolean add(FileSystem fs) {
		this.fs.add(fs);
		return true;
	}

	@Override
	public void ls() {
		System.out.println(name);
		for(FileSystem f : fs) {
			f.ls();
		}
	}

	
}
