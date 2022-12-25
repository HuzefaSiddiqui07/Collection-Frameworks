// 5. Program for sorting arraylist

package com.collection.list.arraylist02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList05 {

	public static void main(String[] args) {
		
		// Create an Object 01 of ArrayList
	 ArrayList<String> al = new ArrayList<String>();
	 
	    al.add("Huzefa");
		al.add("Priyanka");
		al.add("Sujit");
		al.add("Mayuri");
		al.add("Avesh");
		al.add("Diksha");
		
		Collections.sort(al); // To sort Ascending order Alphabetically
		
		System.out.println("Print Output Horizontally in Square Bracket >>>");
		System.out.println(al); // Print Output Horizontally in Square Bracket
		
		// Use for each loop to print output vertically on console
	System.out.println("Use for-each loop to print output vertically >>>");
		for(String s : al) {
			System.out.println(s);
		}
		
		// Create Iterator Interface Object for Print Output Vertically
		System.out.println("Use Iterator Interface to print output vertically >>>");
			Iterator<String> itr = al.iterator();
				
			while(itr.hasNext()) {
				System.out.println(itr.next());
		}

	}

}
