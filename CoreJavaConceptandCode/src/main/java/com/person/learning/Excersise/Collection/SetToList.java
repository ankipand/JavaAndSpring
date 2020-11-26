package com.person.learning.Excersise.Collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SetToList {
public static void main(String[] args) {
	// Creating a list of strings 
    List<String> aList = Arrays.asList("Geeks", "for", 
                 "GeeksQuiz", "GeeksforGeeks", "GFG");
    
    Set<String> set = new HashSet<String>(aList);
    set.forEach(looping->{
    	System.out.println(looping +"\n");
    });
    
    //Using stream in Java)
    System.out.println("Using Stream\n");
    Set<String> set1 = aList.stream().collect(Collectors.toSet());
    for(String x: set1) {
    	System.out.println(x);
    }
}
}
