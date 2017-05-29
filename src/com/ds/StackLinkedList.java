package com.ds;

public class StackLinkedList<T> {
	Node top;
	public StackLinkedList() {
		top=null;		
	}
	public void push(Object value) {
		Node newNode=new Node(value, null);
		if(top==null)
			top=newNode;
		else {
			newNode.next=top;
			top=newNode;
		}
		System.out.println("pushed: " + value);
	}
	public T pop() {
		if (top==null) {
			System.out.println("stack is empty");
			return null;
		}
		T value=(T) top.value;
		top=top.next;
		System.out.println("popped: " + value);				
		return value;
	}

}