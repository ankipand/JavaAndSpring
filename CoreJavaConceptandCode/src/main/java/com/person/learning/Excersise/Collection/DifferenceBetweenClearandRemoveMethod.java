package com.person.learning.Excersise.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class DifferenceBetweenClearandRemoveMethod {
	public static void main(String[] args) {
		DifferenceBetweenClearandRemoveMethod betweenClearandRemoveMethod = new DifferenceBetweenClearandRemoveMethod();
		betweenClearandRemoveMethod.clearmethod();
		betweenClearandRemoveMethod.removemethod();
		betweenClearandRemoveMethod.Iteratormethod();
	}
	/*
	 * Internal working of clear method public void clear() { for (int i = 0; i <
	 * size; i++) arraylist[i] = null;
	 * 
	 * size = 0; }
	 */

	public void clearmethod() {
		System.out.println("Entering in the Clear method\n");
		System.out.println("*****************\n");

		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("abc");
		al1.add("xyz");

		System.out.println("ArrayList before clear: " + al1);
		al1.clear();
		System.out.println("ArrayList after clear: " + al1);

		System.out.println("Finishing in the Clear method\n");
		System.out.println("*****************\n");
	}

	/*
	 * Internal working of removeAll() Code of removeAll() method:
	 * 
	 * public boolean removeAll(Collection c) { boolean ismodified = false; Iterator
	 * iterator = iterator(); while (iterator.hasNext()) { if
	 * (c.contains(iterator.next())) { iterator.remove(); ismodified = true; } }
	 * return ismodified; }
	 */
	public void removemethod() {
		System.out.println("Entering in the removemethod\n");
		System.out.println("*****************\n");
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("abc");
		al1.add("xyz");

		System.out.println("ArrayList before clear: " + al1);
		al1.clear();
		System.out.println("ArrayList after clear: " + al1);
		System.out.println("*****************\n");
		System.out.println("Finishing in the removemethod\n");
	}

	public void Iteratormethod() {
		System.out.println("Iterator Method Starting\n");
		System.out.println("****************\n");
		ArrayList names = new ArrayList();
		names.add("Chaitanya");
		names.add("Steve");
		names.add("Jack");

		Iterator it = names.iterator();

		while (it.hasNext()) {
			String obj = (String) it.next();
			System.out.println(obj);
		}
		System.out.println("*****************\n");
		System.out.println("Iterator Method Ending\n");
	}

	public void structure() {
		System.out.println("Starting\n");
		System.out.println("****************\n");
		System.out.println("*****************\n");
		System.out.println("Ending\n");
	}
}