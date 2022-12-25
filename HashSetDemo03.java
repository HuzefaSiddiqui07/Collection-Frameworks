package com.collectionframeworks.set.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo03 {

	public static void main(String[] args) {
		
		// Generic (String)
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("Huzefa");
		hs.add("VELOCITY");
		hs.add("20");
		hs.add("avesh");
		hs.add("30");
		hs.add(null);
		
		// Use Iterator
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
