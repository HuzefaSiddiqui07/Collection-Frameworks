package com.collectionframeworks.map.sortedmap.treemap;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo02 {

	public static void main(String[] args) {
		
		     //sorted elements based on key
		TreeMap<Integer , String> tm = new TreeMap<Integer , String>();
		
		tm.put(70 , "Huzefa");
		tm.put(90 , "priyanka");
		tm.put(50 , "AVESH");
		tm.put(20 , "sujit");
		
		// System.out.println(tm);
		
		Set<Integer> s = tm.keySet(); // s Contain all keys only...
		
		// Use Iterator
		Iterator<Integer> itr = s.iterator();
		while(itr.hasNext()) {
			int i = itr.next();
			System.out.println("Key >>> " + i);
			System.out.println("Value >>> " + tm.get(i)); // get method used to get the respective value of key.
		}

	}

}
