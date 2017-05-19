/**
 * 
 */
package com.ds;

/**
 * @author Ray
 *
 */
public class OneDArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// create array of integers
		int[] numbers= new int[5];
		numbers[0] = 20;
		numbers[1] = 5;
		numbers[2] = 10;
		numbers[3] = 6;
		numbers[4] = 11;
		
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}

	
		// array of objects
		Student[] students = new Student[4];
		students[0] = new Student("Anakin", 10);
		students[1] = new Student("Obi-wan", 25);
		students[2] = new Student("Yoda", 825);
		students[3] = new Student("Billy", 18);
		
//	for(int i = 0; i < students.length; i++) {
//		System.out.println("name: " + students[i].name + ", Age: " + students[i].age);
//		}
		for (Student student : students ) {
			System.out.println("name" + student.name + ", Age: " + student.age);
		}
	}	
}
