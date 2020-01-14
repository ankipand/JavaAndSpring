package com.person.learning.Excersise.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListMethod {
	public static void main(String[] args) {
		MethodOfList methodOfList = new MethodOfList();
		methodOfList.methodaddingElelment();
	}
}

class MethodOfList {
	public void methodaddingElelment() {
		List<String> list1 = new ArrayList<String>();

		list1.add("Gaurav");
		list1.add("Sushant");
		// Add a new Piyush at index 2
		list1.add(1, "Piyush");
		list1.add("Saurabh");
		System.out.println("LIST1 retriving using the list1.forEach");
		list1.forEach(a -> {
			System.out.println(a);
		});
		System.out.println("\n");

		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		System.out.println("LIST2 retriving using the Enhanced loop");
		for (String i : list) {
			System.out.println(i);
		}
		System.out.println("\n");

		System.out.println("LIST ITERATER ADDING ALL ELEMENT USING addAll Method");
		list1.addAll(list);
		Iterator itr = list1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("\n");

		System.out.println("Deleting the element from list list1.remove(2)");
		list1.remove(2);
		System.out.println(list1);
		System.out.println("\n");
		
		
		System.out.println("Calculating the size of list using list1.size()");
		System.out.println(list1.size());
		System.out.println("\n");
		
		
		
		
		/*
		 * System.out.println("Deleting the element from list using removeIf method ");
		 * list1.removeIf(a -> list.contains("Sushant") { System.out.println(a); }); 
	       System.out.println("\n");
		*/
		
		System.out.println("Deleting the all element from list using RemoveAll method");
		list1.removeAll(list1);
		System.out.println(list1);
		System.out.println("\n");
		list1.addAll(list);

		System.out.println("Getting the element from list using getmethod  list.get(1)");
		System.out.println(list1.get(1));
		System.out.println("\n");

		System.out.println("Setting the element in the list using set list.set(2, \"Anand\")");
		list1.set(2, "Anand");
		System.out.println(list1);
		System.out.println("\n");

		System.out.println("Implementing the Search Method\n");
		System.out.println("first index of Gaurav: list1.indexOf(\"Gaurav\") " + list1.indexOf("Gaurav"));
		System.out.println("last index of list1: ist1.lastIndexOf(\"3\") " + list1.lastIndexOf("3"));
		System.out.println("Index of element" + " not present :  list1.indexOf(\"Hello\") " + list1.indexOf("Hello"));
		System.out.println("\n");
	}
	
	
	public void  SearchMethod() {
		
	}
	
	

}