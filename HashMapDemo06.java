package com.collectionframeworks.map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo06 {

	public static void main(String[] args) {
		
	HashMap<String , String> hm = new HashMap<String , String>();
	
	hm.put("Huzefa" , "Siddiqui");
	hm.put("priyanka" , "mule");
	hm.put("AVESH" , "SHAIKH");
	hm.put("Sujit" , "Galande");
	
	// System.out.println(hm);
	
	Set<String> s = hm.keySet(); // s Contains all Key Only...
	
	// Use Iterator
	Iterator<String> itr = s.iterator();
	while(itr.hasNext()) {
		String y = itr.next();
		System.out.println("Key >>> " + y);
		System.out.println("Key Value >>> " + hm.get(y));
	 }
   }
 }
