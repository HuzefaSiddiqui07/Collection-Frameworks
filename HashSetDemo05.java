package com.collectionframeworks.set.hashset;

import java.util.HashSet;

public class HashSetDemo05 {

	public static void main(String[] args) {
		
		HashSet hs1 = new HashSet();
		
		hs1.add(10);
		hs1.add(20);
		hs1.add(30);
		hs1.add("Velocity");
		hs1.add("pune");
		
		
		// System.out.println(hs.remove("Velocity")); // to remove particular data from given data
		// System.out.println(hs.size()); // to print actual size of given data
		// System.out.println(hs.contains("pune")); // to check data is present in given data or not
		
		// System.out.println(hs); // to print all data on console
		
      HashSet hs2 = new HashSet();
		
		hs2.add(40);
		hs2.add(50);
		hs2.add(60);
		hs2.add("Java");
		hs2.add("Course");
		
		hs1.addAll(hs2);
		
		// System.out.println(hs1);
		
		for(Object o : hs1) {
			System.out.println(o);
		}
		

	}

}
