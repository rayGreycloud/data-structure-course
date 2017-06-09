package com.ds;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("Billy");
		ar.add("Mandy");
		ar.add("Grim");
		
		for (String st: ar)
		System.out.println(st);
		
		ar.remove(1);
		
		for (String st: ar)
		System.out.println(st);
		
		ArrayList<employee> emp= new ArrayList<employee>();
		emp.add(new employee("Billy", 10));
		emp.add(new employee("Mandy", 11));
		for (employee st: emp)
			System.out.println(st.name + ", " + st.age);
	}
	static class employee {
		String name;
		int age;
		public employee(String name, int age) {
			this.name = name;
			this.age = age;
		}
	}
}
