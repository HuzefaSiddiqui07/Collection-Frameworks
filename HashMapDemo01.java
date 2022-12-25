package com.collectionframeworks.map.setmap.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo01 {

	public static void main(String[] args) {
		
		Map<String , String> ref = new HashMap<String , String>();
		
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
