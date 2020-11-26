package com.person.learning.Excersise.Collection;

import java.util.ArrayList;
import java.util.List;

public class LastElementAndArrayCocenptofList {
	public static void main(String[] args) {
 LastElementAndArrayCocenptofList andArrayCocenptofList= new LastElementAndArrayCocenptofList();
 andArrayCocenptofList.lastElement();
	}

	public void lastElement() {
		System.out.println(" LastElement search Starting\n");
		System.out.println("****************\n");
		List<String> al = new ArrayList<String>();
		al.add("Ajay");
		al.add("Becky");
		al.add("Chaitanya");
		al.add("Dimple");
		al.add("Rock");

		// Displaying ArrayList elements
		System.out.println("ArrayList contains: " + al);

		// Logic to get the last element from ArrayList
		if (al != null && !al.isEmpty()) {
			System.out.println("Last element is:");
			System.out.println(al.get(al.size() - 1));
			System.out.println("*****************\n");
			System.out.println("*****************Ending************************\n");
		}
	}

	public void structure() {
		System.out.println("Starting\n");
		System.out.println("****************\n");
		System.out.println("*****************\n");
		System.out.println("*****************Ending************************\n");
	}
}
