package com.collectionframeworks.map.sortedmap.treemap;


import java.util.TreeMap;

public class TreeMapDemo03 {

	public static void main(String[] args) {
		
		        //sorted elements based on key
		TreeMap<Integer , String> tm1 = new TreeMap<Integer , String>();
		
		tm1.put(70 , "Huzefa");
		tm1.put(90 , "priyanka");
		tm1.put(50 , "AVESH");
		tm1.put(20 , "sujit");
		
		TreeMap<Integer , String> tm2 = new TreeMap<Integer , String>();
		
		tm2.put(60 , "Diksha");
		tm2.put(80 , "Chandu");
		tm2.put(40 , "MAYURI");
		tm2.put(10 , "ram");
		
		tm1.putAll(tm2); // hm2 Object Data Copy in hm1 Object
		
    	System.out.println("Print Key & Value >>> " + tm1);
		System.out.println("Object hm1 Size >>> " + tm1.size());
		System.out.println("Value Of Key Is Present Or Not >>> " + tm1.containsValue("sujit"));
		System.out.println("Value Of Key Is Present Or Not >>> " + tm1.containsValue("Mayuri"));
		System.out.println("Key Is Present Or Not >>> " + tm1.containsKey(90));
		System.out.println("Key Is Present Or Not >>> " + tm1.containsKey(30));
		System.out.println("Print Key Value Of Given Key Number >>> " + tm1.get(70));

	}

}
