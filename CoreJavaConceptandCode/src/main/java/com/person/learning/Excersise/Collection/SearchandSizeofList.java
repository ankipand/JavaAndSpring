package com.person.learning.Excersise.Collection;

import java.util.ArrayList;

public class SearchandSizeofList {
public static void main(String[] args) {
	SearchandSizeofList list = new SearchandSizeofList();
	list.serachElement();
	list.removeifandretainAll();
}

public void structure() {
	System.out.println("Starting\n");
	System.out.println("****************\n");
	System.out.println("*****************\n");
	System.out.println("*****************Ending************************\n");
}

public void removeifandretainAll() {
	System.out.println(" removeifandretainAll  method Starting\n");
	System.out.println("****************\n");
	
	
	  ArrayList<String> bags = new ArrayList<String>(); 
	  
      // Add values in the bags list. 
      bags.add("pen"); 
      bags.add("pencil"); 
      bags.add("paper"); 

      // Creating another array list 
      ArrayList<String> boxes = new ArrayList<String>(); 

      // Add values in the boxes list. 
      boxes.add("pen"); 
      boxes.add("paper"); 
      boxes.add("books"); 
      boxes.add("rubber"); 
      
      // Before Applying method print both lists 
      System.out.println("Bags Contains :" + bags); 
      System.out.println("Boxes Contains :" + boxes); 

      // Apply retainAll() method to boxes passing bags as parameter 
      boxes.retainAll(bags); 

      // Displaying both the lists after operation 
      System.out.println("\nAfter Applying retainAll()"+ 
      " method to Boxes\n"); 
      System.out.println("Bags Contains :" + bags); 
      System.out.println("Boxes Contains :" + boxes); 
	
	System.out.println("*****************\n");
	System.out.println("*****************  removeifandretainAll  method Ending************************\n");
}

public void serachElement() {
	System.out.println("Starting the search of element\n");
	System.out.println("****************\n");
	ArrayList<String> li= new ArrayList<String>();
	ArrayList names = new ArrayList();
    names.add("Chaitanya");
    names.add("Steve");
    names.add("Jack");
    names.forEach(a->{
    	System.out.println(a);
    });
    ArrayList<String> arrayList3 = new ArrayList<String>();
	arrayList3.add("Chaitanya");
	arrayList3.add("Sushant");
	arrayList3.add("Jack");
	arrayList3.add("Sonal");
	
    System.out.println("Searching the Element: " + names.contains("Jack"));
    System.out.println();
    
    System.out.println("Searching the All Element in the List: "+ names.containsAll(arrayList3)+"\n");
    
	System.out.println("*****************\n");
	System.out.println("****************Ending*************************\n");
}
}
