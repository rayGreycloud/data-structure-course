package com.ds;

public class LinkedListDDemo {

	public static void main(String[] args) {
		LinkedListD<String> ls= new LinkedListD<String>();
		ls.add("Luke");
		ls.add("Leia");
		ls.add("Han");
		ls.add("Chewy");
		System.out.println("Before delete:");
		ls.display();
		System.out.println("After delete:");
		ls.delete();
		ls.display();
	}

}
