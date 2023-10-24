package com.behavioral.iteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class MyList<T> implements Aggregate<T>{
	public List<T> list;
	public int idx;
	Iterator<T> iterator;
	public MyList() {
		list =new ArrayList<>();
		idx =-1;
	}
	@Override
	public void add(T item) {
		list.add(item);
	}

	@Override
	public Iterator<T> createIterator() {
		iterator = new ConcreteIterator<T>(this);
		return iterator;
	}
	@Override
	public int getIndex() {
		return idx;
	}
	@Override
	public int size() {
		return list.size();
	}

}
