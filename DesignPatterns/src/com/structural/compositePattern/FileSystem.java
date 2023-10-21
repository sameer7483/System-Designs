package com.structural.compositePattern;

public interface FileSystem {

	public boolean add(FileSystem fs);
	public void ls();
}
