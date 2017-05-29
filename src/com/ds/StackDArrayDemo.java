package com.ds;

public class StackDArrayDemo {

	public static void main(String[] args) {
		StackDArray<Integer> st= new StackDArray<Integer>(2);
		st.push(5);
		st.push(8);
		System.out.println("Stack size: " + st.getSize());
		st.push(13);
		System.out.println("Stack size: " + st.getSize());
		st.push(21);
		System.out.println("Stack size: " + st.getSize());
		st.push(34);
		System.out.println("Stack size: " + st.getSize());
	}

}
