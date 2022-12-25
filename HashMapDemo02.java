package com.collectionframeworks.map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo02 {

	public static void main(String[] args) {
		
		HashMap<Integer , String> hm = new HashMap<Integer , String>();
		
		hm.put(70 , "Huzefa");
		hm.put(90 , "priyanka");
		hm.put(50 , "AVESH");
		hm.put(20 , "sujit");
		
		// System.out.println(hm);
		
		Set<Integer> s = hm.keySet(); // s Contain all keys only...
		
		// Use Iterator
		Iterator<Integer> itr = s.iterator();
		while(itr.hasNext()) {
			int i = itr.next();
			System.out.println("Key >>> " + i);
			System.out.println("Value >>> " + hm.get(i)); // get method used to get the respective value of key.
		}

	}

}
