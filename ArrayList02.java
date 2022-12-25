// 2.Program for design generic arraylist for Integer type only

package com.collection.list.arraylist02;

import java.util.ArrayList;

public class ArrayList02 {

	public static void main(String[] args) {
		
		// Create an Object of ArrayList
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		
		// Use For-Each Loop
		
		for(int t : al) {
			
			System.out.println("" + t);
		}

	}

}
