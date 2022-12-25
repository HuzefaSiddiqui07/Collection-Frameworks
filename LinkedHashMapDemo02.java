package com.collectionframeworks.map.linkedhashmap;


import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapDemo02 {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer , String> lhm = new LinkedHashMap<Integer , String>();
		
		lhm.put(70 , "Huzefa");
		lhm.put(90 , "priyanka");
		lhm.put(50 , "AVESH");
		lhm.put(20 , "sujit");
		
		// System.out.println(lhm);
		
		Set<Integer> s = lhm.keySet(); // s Contain all keys only...
		
		// Use Iterator
		Iterator<Integer> itr = s.iterator();
		while(itr.hasNext()) {
			int i = itr.next();
			System.out.println("Key >>> " + i);
			System.out.println("Value >>> " + lhm.get(i)); // get method used to get the respective value of key.
		}

	}

}
