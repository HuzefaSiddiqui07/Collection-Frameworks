package com.collectionframeworks.map.hashmap;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo05 {

	public static void main(String[] args) {
		
	HashMap<Integer , Integer> hm1 = new HashMap<Integer , Integer>();
	
	hm1.put(1, 2468);
	hm1.put(3, 8642);
	hm1.put(5, 4628);
	hm1.put(7, 6482);
	
   HashMap<Integer , Integer> hm2 = new HashMap<Integer , Integer>();
	
   hm2.put(2, 13579);
   hm2.put(4, 97531);
   hm2.put(6, 57931);
   hm2.put(8, 75913);
 
   hm1.putAll(hm2); // hm2 Object Data Copy in hm1 Object
   
  //  System.out.println(hm1);
   
   Set<Integer> s = hm1.keySet(); // s Contains all Key Only...
   
   // Use For each loop
   for(int k : s) {
	   System.out.println("Key >>> " + k);
	   System.out.println("Key Value >>> " + hm1.get(k));
    }
  }
}
