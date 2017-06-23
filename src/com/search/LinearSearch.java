package com.search;

public class LinearSearch {

	public static void main(String[] args) {
		DataSet data= new DataSet(1000000);
		int Search=700;
		for (int i=0; i< data.getSize(); i++) {
			data.NumberTry++;
			if (data.data[i]==Search) {
				System.out.println("Element found on attempt " + data.NumberTry);
				
			}
		}

	}

}
