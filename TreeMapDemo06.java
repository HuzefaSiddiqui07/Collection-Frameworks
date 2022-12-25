package com.collectionframeworks.map.sortedmap.treemap;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo06 {

	public static void main(String[] args) {
		
		        //sorted elements based on key
		TreeMap<String , String> tm = new TreeMap<String , String>();
		
		tm.put("Huzefa" , "Siddiqui");
		tm.put("priyanka" , "mule");
		tm.put("AVESH" , "SHAIKH");
		tm.put("Sujit" , "Galande");
		
		// System.out.println(tm);
		
		Set<String> s = tm.keySet(); // s Contains all Key Only...
		
		// Use Iterator
		Iterator<String> itr = s.iterator();
		while(itr.hasNext()) {
			String y = itr.next();
			System.out.println("Key >>> " + y);
			System.out.println("Key Value >>> " + tm.get(y));
		 }

	}

}
