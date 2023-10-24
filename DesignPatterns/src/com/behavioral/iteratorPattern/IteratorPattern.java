package com.behavioral.iteratorPattern;

public class IteratorPattern {

	public static void main(String[] args) {
		Aggregate<Integer> list = new MyList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		Iterator<Integer> iter = list.createIterator();
		System.out.println(iter.hasNext());
		System.out.println(iter.next());
		System.out.println(iter.hasNext());
		System.out.println(iter.next());
		System.out.println(iter.hasNext());
		System.out.println(iter.next());
		System.out.println(iter.hasNext());
		System.out.println(iter.next());
		
	}
}
