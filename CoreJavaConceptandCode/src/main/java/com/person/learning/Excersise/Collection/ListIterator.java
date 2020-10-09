package com.person.learning.Excersise.Collection;

import java.util.ArrayList;

public class ListIterator {
public static void main(String[] args) {
	ArrayList<String> arrayList = new ArrayList<String>();
	for(int i =0;i<10;i++) {
		arrayList.add("Hello");
		System.out.println(i);
	}
	   // at beginning ltr(cursor) will point to 
    // index just before the first element in al 
	java.util.ListIterator<String> listIterator = arrayList.listIterator();
	  // checking the next element availabilty 
	System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
	while(listIterator.hasNext()) {
		String list = listIterator.next();
		
        System.out.println(list + "");
		
		
	}
}
}
