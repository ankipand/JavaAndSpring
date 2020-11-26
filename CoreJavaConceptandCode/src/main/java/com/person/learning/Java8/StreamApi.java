package com.person.learning.Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamApi {
public static void main(String[] args) {
	List<String> names = new ArrayList<String>();
	names.add("Ajeet");
	names.add("Negan");
	names.add("Aditya");
	names.add("Steve");
	System.out.println("Without the Stream");
	int count = 0;
	for (String str : names) {
	   if (str.length() < 6) 
		count++; 
	}
        System.out.println("There are "+count+" strings with length less than 6");
        
        System.out.println("With the Stream");
        long  long1 = names.stream().filter(str-> str.length()<6).count();
        
        
}
}
