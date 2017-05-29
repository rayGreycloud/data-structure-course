package com.ds;

public class StackArrayDemo {

	public static void main(String[] args) {
		StackArray<Integer> st= new StackArray<Integer>(5);
		st.push(2);
		st.push(3);
		st.push(5);
		st.push(8);
		st.push(13);
		st.push(21);
		while(!st.isEmpty()) {
			st.pop();
		}
		st.pop();
	}

}
