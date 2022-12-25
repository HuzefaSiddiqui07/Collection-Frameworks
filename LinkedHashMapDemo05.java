package com.collectionframeworks.map.linkedhashmap;


import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapDemo05 {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer , Integer> lhm1 = new LinkedHashMap<Integer , Integer>();
		
		lhm1.put(1, 2468);
		lhm1.put(3, 8642);
		lhm1.put(5, 4628);
		lhm1.put(7, 6482);
		
		LinkedHashMap<Integer , Integer> lhm2 = new LinkedHashMap<Integer , Integer>();
		
	   lhm2.put(2, 13579);
	   lhm2.put(4, 97531);
	   lhm2.put(6, 57931);
	   lhm2.put(8, 75913);
	 
	   lhm1.putAll(lhm2); // hm2 Object Data Copy in hm1 Object
	   
	  //  System.out.println(hm1);
	   
	   Set<Integer> s = lhm1.keySet(); // s Contains all Key Only...
	   
	   // Use For each loop
	   for(int k : s) {
		   System.out.println("Key >>> " + k);
		   System.out.println("Key Value >>> " + lhm1.get(k));
	    }

	}

}
