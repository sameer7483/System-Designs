package com.behavioral.iteratorPattern;

public class ConcreteIterator<T> implements Iterator<T> {

	MyList<T> list;
	public ConcreteIterator(MyList<T> list) {
		this.list = list;
	}
	@Override
	public T next() {
		list.idx++;
		if(list.idx < list.size())
			return list.list.get(list.idx);
		return null;
	}

	@Override
	public boolean hasNext() {
		if(list.idx < list.size())
			return true;
		return false;
	}

}
