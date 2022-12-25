// 1.Program for copy one arraylist into another arraylist.
package com.collection.list.arraylist02;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList01 {

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
		
		al1.addAll(al2);
		System.out.println("Copy ArrayList is >>> " + al1); // Print Output Horizontally in Square Bracket
		
		// Create Iterator Interface Object for Print Output Vertically
		Iterator<Integer>itr = al1.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
