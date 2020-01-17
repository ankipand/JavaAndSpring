package com.person.learning.Excersise.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ListMethod {
	public static void main(String[] args) {
		MethodOfList methodOfList = new MethodOfList();
		// methodOfList.methodaddingElelment();
		methodOfList.SearchMethod();
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
		System.out.println("Before Deleting the element from list list1.remove(2)");
		System.out.println(list1);
		System.out.println("Calculating the size of list using list1.size()");
		System.out.println(list1.size());

		System.out.println("\n");
		System.out.println("After Deleting the element from list list1.remove(2)");

		list1.remove(2);
		System.out.println(list1);

		System.out.println("Calculating the size of list using list1.size() After Deleting the element ");
		System.out.println(list1.size());
		System.out.println("\n");

		/*
		 * System.out.println("Deleting the element from list using removeIf method ");
		 * list1.removeIf(a -> list.contains("Sushant") { System.out.println(a); });
		 * System.out.println("\n");
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

		System.out.println("Clear method in the list ");
		list1.clear();
		System.out.println(list1);
		System.out.println("\n");
		list1.addAll(list);

		System.out.println("Implementing the Search Method\n");
		System.out.println("first index of Gaurav: list1.indexOf(\"Gaurav\") " + list1.indexOf("Gaurav"));
		System.out.println("last index of list1: ist1.lastIndexOf(\"3\") " + list1.lastIndexOf("3"));
		System.out.println("Index of element" + " not present :  list1.indexOf(\"Hello\") " + list1.indexOf("Hello"));
		System.out.println("\n");
	}

	public void SearchMethod() {
		List<String> list = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Size of the list");
		int sizeoflist = scanner.nextInt();

		if (list.isEmpty()) {
			// list.add(0, "sdf6sagf");
			for (int i = 0; i < sizeoflist; i++) {
				list.add(scanner.next());
			}
			System.out.println(list);
		}

		else {
			System.out.println("We do have our list");
		}

		Iterator<String> iterator = list.iterator();
		System.out.println("Size of the  iterator  " + list.iterator());
		/*
		 * while (iterator.hasNext() ) { System.out.println("iterator.getClass() " +
		 * iterator.getClass() +"\n"); System.out.println("iterator.getClass() " +
		 * iterator.getClass() +"\n") ; System.out.print("@@  " + iterator.next() +
		 * " "); }
		 */

		if (list.contains("Gaurav")) {
			System.out.println(list);
		} else {
			System.out.println("no A");
		}

		System.out.println(" Starting the contain and containall method ");
		Set<String> set = new HashSet<String>();

		// Use add() method to
		// add elements in the set
		set.add("Geeks");
		set.add("for");
		set.add("Geeks");
		set.add("10");
		set.add("20");

		// prints the set
		System.out.println("Set 1: " + set);

		// Creating another empty set
		Set<String> set2 = new HashSet<String>();

		// Use add() method to
		// add elements in the set
		set2.add("Geeks");
		set2.add("for");
		set2.add("Geeks");
		set2.add("10");
		set2.add("20");

		// prints the set
		System.out.println("Set 2: " + set2);

		System.out.println("\nDoes set 1 contains set 2?: " + set.containsAll(set2));
		List<String> are = Arrays.asList("sfsdgfsdg","afsdfsdgv");
		are.forEach(a->{
			System.out.println(a);
		});
	}

}