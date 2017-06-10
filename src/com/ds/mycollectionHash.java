package com.ds;

import java.util.HashMap;
import java.util.Map;

public class mycollectionHash {
	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "Luke");
		map.put(4, "Leia");
		map.put(2, "Han");
		
		for(Map.Entry m:map.entrySet()){
			System.out.println("key: " + m.getKey() + ",value:" + m.getValue());
		}
	}
}
