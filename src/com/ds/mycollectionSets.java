package com.ds;

import java.util.Iterator;
import java.util.TreeSet;

public class mycollectionSets {

	public static void main(String[] args) {
		TreeSet<String> ls=new TreeSet<String>();
		ls.add("Luke");
		ls.add("Leia");
		ls.add("Han");
		
		Iterator<String> itr=ls.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}
