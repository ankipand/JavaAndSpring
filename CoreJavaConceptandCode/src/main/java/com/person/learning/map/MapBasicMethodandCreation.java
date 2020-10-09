package com.person.learning. map;

import java.util.Map;

import javax.swing.plaf.synth.SynthSpinnerUI;

import java.util.HashMap;
public class MapBasicMethodandCreation {
public static void main(String[] args) {
	  // Creating a map using the HashMap
    Map<String, String> numbers = new HashMap<>();

    // Insert elements to the map
    numbers.put("3", "1");
    numbers.put("4", "2");
    System.out.println("Map: " + numbers);

    // Access keys of the map
    System.out.println("Keys: " + numbers.keySet());

    // Access values of the map
    System.out.println("Values: " + numbers.values());

    // Access entries of the map
    System.out.println("Entries: " + numbers.entrySet());

    // Remove Elements from the map
    String value = numbers.remove("Two");
    System.out.println("Removed Value: " + value);
    
    //creating a new hashmap
    
    Map<String,String> numbers2 = new HashMap<>();
    numbers2.put("1", "Adding 1");
    numbers2.put("2","Adding 2");
    System.out.println("number2 " +numbers2);
    
    numbers2.putIfAbsent("2", "absent");
    numbers2.putIfAbsent("3", "absent");
    
    System.out.println("number2 default " +numbers2.getOrDefault(2,"Null"));
    System.out.println("number2 default number3 :" +numbers2.getOrDefault(3,"Null"));
    System.out.println("Adding all the number and number2 of the Map ");
    numbers2.putAll(numbers);
    System.out.println(numbers2);
    System.out.println("Get method " + numbers2.get("2"));
   	
    //entrySet() - Returns a set of all the key/value mapping present in a map.
    System.out.println("EntrySet: " + numbers2.entrySet());
    
    //�	values() - Returns a set of all the values present in a map.
    System.out.println("Values: " + numbers2.values());
    
    //�	keySet() - Returns a set of all the keys present in a map.
    System.out.println("KeySet: " + numbers2.keySet());
    
    //adding all the hashmap
    Map<Object, Object> map = new HashMap<>();
    
   
    
    
    
}
}
