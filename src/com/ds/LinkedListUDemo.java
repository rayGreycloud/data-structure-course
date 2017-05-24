package com.ds;

public class LinkedListUDemo {

	public static void main(String[] args) {
		LinkedListU<String> ls= new LinkedListU<String>();
		ls.add("Luke");
		ls.add("Leia");
		ls.add("Han");
		ls.add("Chewy");
		ls.display();
		ls.delete();
		ls.display();
	}

}
