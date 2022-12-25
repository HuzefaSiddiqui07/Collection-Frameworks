// 6. Program for merging two arraylist into one arraylist

package com.collection.list.arraylist02;

import java.util.ArrayList;

public class ArrayList06 {

	public static void main(String[] args) {
		
		// Create an Object 01 of ArrayList
		ArrayList<Integer> al1 = new ArrayList<Integer>();
				
				al1.add(10); // 0th Index
				al1.add(20); // 1st Index
				al1.add(30); // 2nd Index
				
		// Create an Object 02 of ArrayList
		ArrayList<Integer> al2 = new ArrayList<Integer>();
				
				al2.add(40); // 0th Index
				al2.add(50); // 1st Index
				al2.add(60); //2nd Index
				
		// Create an Object 03 of ArrayList for merge object 01 & 02
	   ArrayList<Integer> al3 = new ArrayList<Integer>();
	   
	          al3.addAll(al1);
	          al3.addAll(al2);
	          
	     System.out.println("Merge List is >>> " + al3);
	}

}
