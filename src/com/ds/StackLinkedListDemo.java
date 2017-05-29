package com.ds;

public class StackLinkedListDemo {

	public static void main(String[] args) {
		StackLinkedList<String> st= new StackLinkedList<String>();
		st.pop();
		st.push("Darth");
		st.push("Luke");
		
		st.pop();
		st.push("Leia");
		st.pop();
		st.pop();
		st.pop();
	}

}
