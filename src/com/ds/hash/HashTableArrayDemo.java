package com.ds.hash;

public class HashTableArrayDemo {

	public static void main(String[] args) {
		HashTableArray<String> hm= 
				new HashTableArray<String>(10);
		hm.put(11, "Darth");
		hm.put(12, "Luke");
		hm.put(13, "Leia");
		System.out.println(hm.get(11));
	}

}
