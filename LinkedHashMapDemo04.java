package com.collectionframeworks.map.linkedhashmap;


import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapDemo04 {

	public static void main(String[] args) {
		
		LinkedHashMap<String , Integer> lhm1 = new LinkedHashMap<String , Integer>();
		
		lhm1.put("Sujit", 90);
		lhm1.put("priyanka", 70);
		lhm1.put("MAYURI", 50);
		lhm1.put("Huzefa", 30);
		
		LinkedHashMap<String , Integer> lhm2 = new LinkedHashMap<String , Integer>();
		
		lhm2.put("Diksha" , 80);
		lhm2.put("Chandu" , 60);
		lhm2.put("AVESH" , 40);
		lhm2.put("ajay" , 20);
		
		lhm1.putAll(lhm2); // hm2 Object Data Copy in hm1 Object
		
		Set<String> s = lhm1.keySet(); // s Contains all Key Only...
		
		// Use Iterator
		Iterator<String> itr = s.iterator();
		while(itr.hasNext()) {
			String a = itr.next();
			System.out.println("Key >>> " + a);
			System.out.println("Key Vale >>> " + lhm1.get(a));
		}

	}

}
