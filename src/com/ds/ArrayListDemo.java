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
		
	}

}
