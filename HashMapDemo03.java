package com.collectionframeworks.map.hashmap;

import java.util.HashMap;

public class HashMapDemo03 {

	public static void main(String[] args) {
		
HashMap<Integer , String> hm1 = new HashMap<Integer , String>();
		
		hm1.put(70 , "Huzefa");
		hm1.put(90 , "priyanka");
		hm1.put(50 , "AVESH");
		hm1.put(20 , "sujit");
		
HashMap<Integer , String> hm2 = new HashMap<Integer , String>();
		
		hm2.put(60 , "Diksha");
		hm2.put(80 , "Chandu");
		hm2.put(40 , "MAYURI");
		hm2.put(10 , "ram");
		
		hm1.putAll(hm2); // hm2 Object Data Copy in hm1 Object
		
    	System.out.println("Print Key & Value >>> " + hm1);
		System.out.println("Object hm1 Size >>> " + hm1.size());
		System.out.println("Value Of Key Is Present Or Not >>> " + hm1.containsValue("sujit"));
		System.out.println("Value Of Key Is Present Or Not >>> " + hm1.containsValue("Mayuri"));
		System.out.println("Key Is Present Or Not >>> " + hm1.containsKey(90));
		System.out.println("Key Is Present Or Not >>> " + hm1.containsKey(30));
		System.out.println("Print Key Value Of Given Key Number >>> " + hm1.get(70));

	}

}
