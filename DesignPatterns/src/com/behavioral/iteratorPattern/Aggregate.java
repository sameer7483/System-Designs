package com.behavioral.iteratorPattern;

public interface Aggregate<T> {

	public void add(T item);
	public int getIndex();
	public int size();
	public Iterator<T> createIterator();
}
