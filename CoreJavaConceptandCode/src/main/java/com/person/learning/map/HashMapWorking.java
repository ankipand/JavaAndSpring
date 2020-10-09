package com.person.learning. map;

import java.util.HashMap;
import java.util.Map;



public class HashMapWorking {
public static void main(String[] args) {
	HashMapWorking hashMapWorking = new HashMapWorking();
	System.out.println("in");
	hashMapWorking.hashing();
	hashMapWorking.iteration();
	
}
public void hashing() {
	 HashMap<String, String> map = new HashMap<>();
	map.put("101", "Hello");
	map.put("102", "Java");
	map.put("103", "point");
	
	System.out.println(" map "+ map);
	
	System.out.println("invlaid map key return :" + map.get(101) );
	System.out.println("valid map key :" + map.get("101") );
}
public void iteration() {
	HashMap<Integer, String> iter = new HashMap<>();
	
	iter.put(1, "Singh");
	iter.put(2, "NoNull");
	iter.put(3, "Singh");
	
	  System.out.println("Iterating Hashmap...");  
	  for(Map.Entry m : iter.entrySet()) {
		  System.out.println(m);
	  }
}
}
