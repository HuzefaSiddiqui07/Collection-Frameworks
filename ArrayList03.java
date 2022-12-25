// 3.Program for design the generic arraylist for String type only

package com.collection.list.arraylist02;

import java.util.ArrayList;

public class ArrayList03 {

	public static void main(String[] args) {
		
		// Create an Object 01 of ArrayList
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Huzefa");
		al.add("Priyanka");
		al.add("Sujit");
		al.add("Mayuri");
		
		// Use For-Each Loop
		
		for (String s : al) {
			
			System.out.println("" + s);
		}
	}
 }
