package com.collectionframeworks.map.sortedmap.treemap;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo04 {

	public static void main(String[] args) {
		
		//sorted elements based on key
		TreeMap<String , Integer> tm1 = new TreeMap<String , Integer>();
		
		tm1.put("Sujit", 90);
		tm1.put("priyanka", 70);
		tm1.put("MAYURI", 50);
		tm1.put("Huzefa", 30);
		
		TreeMap<String , Integer> tm2 = new TreeMap<String , Integer>();
		
		tm2.put("Diksha" , 80);
		tm2.put("Chandu" , 60);
		tm2.put("AVESH" , 40);
		tm2.put("ajay" , 20);
		
		tm1.putAll(tm2); // hm2 Object Data Copy in hm1 Object
		
		Set<String> s = tm1.keySet(); // s Contains all Key Only...
		
		// Use Iterator
		Iterator<String> itr = s.iterator();
		while(itr.hasNext()) {
			String a = itr.next();
			System.out.println("Key >>> " + a);
			System.out.println("Key Vale >>> " + tm1.get(a));
		}

	}

}
