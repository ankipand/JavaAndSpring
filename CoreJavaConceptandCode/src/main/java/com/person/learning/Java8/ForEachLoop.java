package com.person.learning.Java8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ForEachLoop {
	public static void main(String[] args) {
		int[] element = { 10, 20, 30 };

//		for (int loopingarray : element) {
//			System.out.println(loopingarray);
//		}
		/* 4 ways to iterate the ArraysList  the first 3 ways are called external itertor(for loop,enhance loop,collection intertor) while ForEach is internal itertor */
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

		/* Using For loop */

		System.out.println("Using the For Loop");
		for (int elementoffoloop = 0; elementoffoloop < list.size() + 1; elementoffoloop++) {
			System.out.println(elementoffoloop);
		}
		System.out.println("Using the Enhance loop");
		for (int eloop : list) {
			System.out.println(eloop);
		}
		System.out.println("Using the Collection Iterator Interface");
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext())
			System.out.println(iterator.next());

		System.out.println("Using the ForEach Method");
		list.forEach(el -> System.out.println(el));
	}
}
