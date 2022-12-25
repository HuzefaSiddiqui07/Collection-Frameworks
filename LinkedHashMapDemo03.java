package com.collectionframeworks.map.linkedhashmap;


import java.util.LinkedHashMap;

public class LinkedHashMapDemo03 {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer , String> lhm1 = new LinkedHashMap<Integer , String>();
		
		lhm1.put(70 , "Huzefa");
		lhm1.put(90 , "priyanka");
		lhm1.put(50 , "AVESH");
		lhm1.put(20 , "sujit");
		
		LinkedHashMap<Integer , String> lhm2 = new LinkedHashMap<Integer , String>();
		
		lhm2.put(60 , "Diksha");
		lhm2.put(80 , "Chandu");
		lhm2.put(40 , "MAYURI");
		lhm2.put(10 , "ram");
		
		lhm1.putAll(lhm2); // hm2 Object Data Copy in hm1 Object
		
    	System.out.println("Print Key & Value >>> " + lhm1);
		System.out.println("Object hm1 Size >>> " + lhm1.size());
		System.out.println("Value Of Key Is Present Or Not >>> " + lhm1.containsValue("sujit"));
		System.out.println("Value Of Key Is Present Or Not >>> " + lhm1.containsValue("Mayuri"));
		System.out.println("Key Is Present Or Not >>> " + lhm1.containsKey(90));
		System.out.println("Key Is Present Or Not >>> " + lhm1.containsKey(30));
		System.out.println("Print Key Value Of Given Key Number >>> " + lhm1.get(70));
	}

}
