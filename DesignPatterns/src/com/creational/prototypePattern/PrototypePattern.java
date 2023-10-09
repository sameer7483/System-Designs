package com.creational.prototypePattern;

public class PrototypePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = new Student("1", "sameer");
		Student stcopy = (Student)st.cloneCopy();
		System.out.println(st);
		System.out.println(stcopy);
		System.out.println(st.id);
		System.out.println(stcopy.id);
	}

}
