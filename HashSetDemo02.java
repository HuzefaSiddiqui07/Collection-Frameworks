package com.collectionframeworks.set.hashset;

import java.util.HashSet;

public class HashSetDemo02 {

	public static void main(String[] args) {
		
		// Generic (Integer)
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		hs.add(10);
		hs.add(20);
		hs.add(30);
		
		for(int a : hs) {
			System.out.println(a);
		}

	}

}
