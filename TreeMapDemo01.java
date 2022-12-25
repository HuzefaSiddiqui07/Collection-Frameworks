package com.collectionframeworks.map.setmap.treemap;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo01 {

	public static void main(String[] args) {
		
  Map<String , String> ref = new TreeMap<String , String>();
		
		ref.put("Siddiqui" , "Huzefa");
		ref.put("Mule" , "Priyanka");
		ref.put("Galande" , "Sujit");
		ref.put("Shirsath" , "Mayuri");
		
		// System.out.println(ref);
		
		
		// Using Iterator
		Iterator<Map.Entry<String , String>> itr = ref.entrySet().iterator();
		
		while(itr.hasNext()) {
			Map.Entry<String , String> e = itr.next();
			System.out.println("Key >>> " + e.getKey());
			System.out.println("Value >>> " + e.getValue());
		}

	}

}
