package com.collectionframeworks.set.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo04 {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		
		hs.add(20);
		hs.add(40);
		hs.add(60);
		hs.add("velocity");
		hs.add("pune");
		
		// use Iterator
		Iterator itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
