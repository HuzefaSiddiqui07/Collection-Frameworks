package com.collectionframeworks.map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo04 {

	public static void main(String[] args) {
		
	HashMap<String , Integer> hm1 = new HashMap<String , Integer>();
	
	hm1.put("Sujit", 90);
	hm1.put("priyanka", 70);
	hm1.put("MAYURI", 50);
	hm1.put("Huzefa", 30);
	
	HashMap<String , Integer> hm2 = new HashMap<String , Integer>();
	
	hm2.put("Diksha" , 80);
	hm2.put("Chandu" , 60);
	hm2.put("AVESH" , 40);
	hm2.put("ajay" , 20);
	
	hm1.putAll(hm2); // hm2 Object Data Copy in hm1 Object
	
	Set<String> s = hm1.keySet(); // s Contains all Key Only...
	
	// Use Iterator
	Iterator<String> itr = s.iterator();
	while(itr.hasNext()) {
		String a = itr.next();
		System.out.println("Key >>> " + a);
		System.out.println("Key Vale >>> " + hm1.get(a));
	}
  }
}
