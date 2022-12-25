package com.collectionframeworks.map.linkedhashmap;


import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapDemo06 {

	public static void main(String[] args) {
		
		LinkedHashMap<String , String> lhm = new LinkedHashMap<String , String>();
		
		lhm.put("Huzefa" , "Siddiqui");
		lhm.put("priyanka" , "mule");
		lhm.put("AVESH" , "SHAIKH");
		lhm.put("Sujit" , "Galande");
		
		// System.out.println(lhm);
		
		Set<String> s = lhm.keySet(); // s Contains all Key Only...
		
		// Use Iterator
		Iterator<String> itr = s.iterator();
		while(itr.hasNext()) {
			String y = itr.next();
			System.out.println("Key >>> " + y);
			System.out.println("Key Value >>> " + lhm.get(y));
		 }

	}

}
