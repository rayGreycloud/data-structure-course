package com.ds;

public class LinkedListCombineDemo {
	public static void main(String[] args) {
		LinkedListD<Integer> ls1= new LinkedListD<Integer>();
		ls1.add(1);
		ls1.add(5);
		ls1.add(10);
		ls1.add(15);
		ls1.add(20);
		
		LinkedListD<Integer> ls2= new LinkedListD<Integer>();
		ls2.add(5);
		ls2.add(11);
		ls2.add(12);
		ls2.add(13);
		ls2.add(14);	
		
		StackLinkedList<Integer> st= new StackLinkedList<Integer>();
		// push elements off ls2 into linked list stack
		
		// create new linked list - alternate adding from lists
		// add elements from ls1 from front
		// add elements from ls2 from rear
		
	}
}
