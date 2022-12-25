package com.collectionframeworks.set.linkedhashset;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo01 {

	public static void main(String[] args) {
		
		// Generic (Integer)
		
 LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
		
		linkedHashSet.add(10);
		linkedHashSet.add(20);
		linkedHashSet.add(30);
		
		// System.out.println(linkedHashSet);
		
		// Use For each loop
		for(int j : linkedHashSet) {
			
			System.out.println(j);
		}


	}

}
