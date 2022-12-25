package com.collectionframeworks.set.linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo02 {

	public static void main(String[] args) {
		
		LinkedHashSet linkedHashSet = new LinkedHashSet();

		linkedHashSet.add(10);
		linkedHashSet.add(20);
		linkedHashSet.add(30);
		linkedHashSet.add("pune");
		linkedHashSet.add("velocity");
		linkedHashSet.add("velocity"); // duplicate not allowed
		
		// System.out.println(linkedHashSet);
		
		// Use Iterator
		Iterator itr = linkedHashSet.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}


	}

}
