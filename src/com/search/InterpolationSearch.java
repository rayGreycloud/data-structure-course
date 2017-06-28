package com.search;

public class InterpolationSearch {
	public static void main(String[] args) {
		DataSet data = new DataSet(1000000);
		int Search = 999999;
		Boolean IsFound = false;
		int low = 0;
		int high = data.getSize() - 1;
		int mid = 0;

		System.out.println("Target: " + Search);
		
		while (!IsFound) {
			if (low > high) {
				System.out.println("Target not found");
				break;
			}
			
			data.NumberTry++;
			mid = low + ((high - low) / (data.data[high] - data.data[low])) * (Search - data.data[low]);
			
			if (data.data[mid] == Search) {
				System.out.println("Target found after " + data.NumberTry + " tries");
				break;
			}
			
			if (data.data[mid] < Search) {
				low = mid + 1;				
			}
			
			if (data.data[mid] > Search) {
				high = mid - 1;
			}
		}
	}
}
