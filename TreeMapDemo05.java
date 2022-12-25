package com.collectionframeworks.map.sortedmap.treemap;


import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo05 {

	public static void main(String[] args) {
		
		        //sorted elements based on key
		TreeMap<Integer , Integer> tm1 = new TreeMap<Integer , Integer>();
		
		tm1.put(1, 2468);
		tm1.put(3, 8642);
		tm1.put(5, 4628);
		tm1.put(7, 6482);
		
		TreeMap<Integer , Integer> tm2 = new TreeMap<Integer , Integer>();
		
	   tm2.put(2, 13579);
	   tm2.put(4, 97531);
	   tm2.put(6, 57931);
	   tm2.put(8, 75913);
	 
	   tm1.putAll(tm2); // hm2 Object Data Copy in hm1 Object
	   
	  //  System.out.println(tm1);
	   
	   Set<Integer> s = tm1.keySet(); // s Contains all Key Only...
	   
	   // Use For each loop
	   for(int k : s) {
		   System.out.println("Key >>> " + k);
		   System.out.println("Key Value >>> " + tm1.get(k));
	    }

	}

}
