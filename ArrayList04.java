// 4. Program for demonstrate the arraylist method

package com.collection.list.arraylist02;

import java.util.ArrayList;

public class ArrayList04 {

	public static void main(String[] args) {
		
		// Create an Object 01 of ArrayList
		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add(20);
        al.add(50);
    	al.add(2 , 75);
		
		
		System.out.println("Size of list is >>> " + al.size()); // Print size number present of elements in array 
		System.out.println("List >>> " + al); // Print Array elements on console
		System.out.println(al.contains(80)); // Check contains in present elements in array & Show result in Boolean Express
	}

}
