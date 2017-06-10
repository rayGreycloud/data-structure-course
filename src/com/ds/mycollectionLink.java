package com.ds;

import java.util.LinkedList;
import java.util.Iterator;

public class mycollectionLink {

	public static void main(String[] args) {
		
		LinkedList<String> ls=new LinkedList<String>();
		ls.add("Luke");
		ls.add("Leia");
		ls.add("Han");
		
		Iterator<String> itr=ls.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}
