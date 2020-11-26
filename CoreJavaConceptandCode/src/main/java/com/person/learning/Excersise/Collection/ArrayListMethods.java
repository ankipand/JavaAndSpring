package com.person.learning.Excersise.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class methodsofArrayList {
	// void add(int index, E element) --> It is used to insert the specified element
	// at the specified position in a list.
	// boolean add(E e) --> It is used to append the specified element at the end of
	// a list.
	public void add() {
		String var = "New ways";
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Gaurav");// boolean add(E e)
		arrayList.add("Akshat");
		arrayList.add("Vipul");
		arrayList.add(1, "Singh");

		// Using for loop to iterate all the elements of ArrayList
		System.out.println("I am using for loop to retrive the element");
		for (String i : arrayList) {
			System.out.println(i);
		}

		// Using forEach method to iterate all the elements of ArrayList
		/*
		 * System.out.println("Using the forEach Method"); arrayList.forEach(a -> {
		 * System.out.println(a); });
		 */
		/*
		 * boolean addAll(Collection<? extends E> c) ---> It is used to append all of
		 * the elements in the specified collection to the end of this list, in the
		 * order that they are returned by the specified collection's iterator.
		 */

		/*
		 * boolean addAll(int index, Collection<? extends E> c) --> It is used to append
		 * all the elements in the specified collection, starting at the specified
		 * position of the list.
		 */

		System.out.println("Starting new Methods @#@##@#");
		ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
		arrayList2.add(10);
		arrayList2.add(20);
		arrayList2.add(30);
		arrayList2.add(40);

		System.out.println(" I am using forEach Loop to retrive");
		arrayList2.forEach(reedem -> {
			System.out.println(reedem);
		});

		ArrayList<String> arrayList3 = new ArrayList<String>();
		arrayList3.add("Piyush");
		arrayList3.add("Sushant");
		arrayList3.add("Neha");
		arrayList3.add("Sonal");

		System.out.println(" I am using forEach Stream to access element");
		arrayList3.forEach(ite -> {
			System.out.println(ite);
		});
         System.out.println("I am using addAll method and adding arraylist3 with arrayList");
		arrayList3.addAll(arrayList);
		System.out.println("Printing all the Elements of ArrayList3+ arraylist which is result of arraylist3.addAll(arrayList) using for loop");
		for (String printAll : arrayList3) {
			System.out.println(printAll);
		}
		// Using this method boolean addAll(int index, Collection<? extends E> c)
		System.out.println("Using this method boolean addAll(int index, Collection<? extends E> c) ");
		arrayList.addAll(1, arrayList3);

		for (int i = 0; i < arrayList.size(); i++) {
			// System.out.println(arrayList.get(i));
		}
		System.out.println("Compare @@@@@@@@@@@@@@@@@@@@@@@@");
		arrayList.forEach(action -> {
			 System.out.println(action);
		});
    System.out.println("Outside addAll");
		// E get(int index)--> It is used to fetch the element from the particular
		// position of the list.
		String i = arrayList.get(3);
		System.out.println(i);

		/*
		 * The java.util.ArrayList.lastIndexOf(Object) method returns the index of the
		 * last occurrence of the specified element in this list, or -1 if this list
		 * does not contain the element.
		 */
		System.out.println("java.util.ArrayList.lastIndexOf(Object)");
		System.out.println(arrayList.lastIndexOf("Angular5"));

		/*
		 * The toArray() method is used to get an array which contains all the elements
		 * in ArrayList object in proper sequence (from first to last element).
		 */
		System.out.println("The toArray() method is used");
		Object[] o1 = arrayList.toArray();
		for (Object os : o1) {
			// System.out.println(os);
		}

		/*
		 * The java.util.ArrayList.toArray(T[]) method returns an array containing all
		 * of the elements in this list in proper sequence (from first to last
		 * element).Following are the important points about ArrayList.toArray() −
		 */

		// <T> T[] toArray(T[] a) Type Parameters: T - the runtime type of the array to
		// contain the collection

		// Creating a array from ArrayList

		String array_List[] = new String[arrayList.size()];
		array_List = arrayList.toArray(array_List);
		System.out.println("We are using the  java.util.ArrayList.toArray(T[])");
		for (String arr : array_List) {
			System.out.println(arr);
		}

	}

	public void othermethodsofArrayList() {
		System.out.println("***********othermethodsofArrayList***************************");
		ArrayList<String> arrayList = new ArrayList<String>();
		ArrayList<String> arrayList2 = new ArrayList<String>();

		arrayList.add("javaScript");
		arrayList.add("Angular");
		arrayList.add("Angular5");
        //System.out.println(arrayList.ensureCapacity(18));
		arrayList2.add("Java");
		arrayList2.add("SpringBoot");
		arrayList2.add("MicroServices");

		arrayList.addAll(arrayList2);

		System.out.println(arrayList);

		System.out.println("This is the idexOfMethod  " + arrayList.indexOf("Angular5"));
		for (String arr : arrayList) {
			System.out.println(arr);
		}
		
		String ret = arrayList.get(3);
		System.out.println("$$$$$$$  "  + ret + "   ########   "  + arrayList.isEmpty());
		
		/*
		 * boolean a = arrayList.removeIf(n->!arrayList.contains("A"));
		 * System.out.println(a);
		 */
	}

	public void removeandretainmethod() {
		ArrayList<String> arrayList = new ArrayList<String>();
		ArrayList<String> arrayList2 = new ArrayList<String>();

	}

}

public class ArrayListMethods {
	public static void main(String[] args) {
		methodsofArrayList arrayList = new methodsofArrayList();
		 arrayList.add();
		arrayList.othermethodsofArrayList();

	}
}
