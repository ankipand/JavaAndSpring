package com.person.learning.Excersise.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PreDefiendArraysClass {
	public static void main(String[] args) {
		PreDefiendMethod preDefiendArraysClass = new PreDefiendMethod();
		NoPreDefiendMethod noPreDefiendMethod = new NoPreDefiendMethod();
		preDefiendArraysClass.listMethod();
		noPreDefiendMethod.listMethod();
		
		preDefiendArraysClass.SearchMethod();
	}
}

class PreDefiendMethod {
	
	Scanner scanner = new Scanner(System.in);
	
	public void listMethod() {
		//how to access the numberofElement we have to check
		int[] numberofElement = { 10, 20, 4, 58, 7, 65 };
		// static <T> List<datatype> asList(T… a): This method returns a fixed-size list
		// backed by the specified Arrays.
		System.out.println("Integer Array as List: " + Arrays.toString(numberofElement));
		List<int[]> a = Arrays.asList(numberofElement);
		System.out.println("Integer Array as List: " + a);
//	    List<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(numberofElement));
	
	
	}
	
	/*
	 * static int binarySearch(elementToBeSearched): 
	 * These methods searches for the specified element in the array with the help of Binary Search algorithm.
	 */
	public void SearchMethod() {
		String[] books = {"index","notes","bookmarks","pages","important","summary"};
		Arrays.sort(books);
		System.out.println("Please enter the search key " );
		String search = scanner.next();
		System.out.println(search + " found in the " + Arrays.binarySearch(books, search));
	}
}

class NoPreDefiendMethod {
	
	
	public void listMethod() {
		int[] numberofElement = { 10, 20, 4, 58, 7, 65 };
		for (int read = 0; numberofElement.length > read; read++) {
			System.out.println(read);
		}
	}
}