package com.person.learning.Excersise.Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class DynamicArrayConcept {
	public static void main(String[] args) {
		System.out.println("In the main class");
		Dynamic dynamic = new Dynamic();
		// dynamic.dynamicArray();
		dynamic.addingValueofElements();
		dynamic.findingMissingNumber();
	}
}

class Dynamic {
	Scanner scanner = new Scanner(System.in);

	public void dynamicArray() {
		System.out.println("Please Enter the size of Array");
		int size = scanner.nextInt();
		/*
		 * String[] dynamicSizeofArray ---> the best way to declare the array because
		 * named is clearly separated from the data type of array.
		 */

		String[] dynamicSizeofArray = new String[size];
		System.out.println("Please Enter the element of Arrays");
		for (int elementarray = 0; elementarray < size; elementarray++) {
			dynamicSizeofArray[elementarray] = scanner.next();
		}
		System.out.println("Retriving all the elements of Arrray");
		for (String a : dynamicSizeofArray) {
			System.out.println(a);
		}

	}

	public int addingValueofElements() {
		int sizeofArray;
		int[] sizeofElements = { 10, 20, 30, 40, 50, 10 };
		int sum = 0;
		for (int element = 0; element < sizeofElements.length; element++) {
			sum += sizeofElements[element];
		}
		System.out.println("Result " + sum);
		return sum;

	}

	public int findingMissingNumber() {
		int missingNumber = 0;
		int[] totalNumberofElement;
		int totalSum = 0;
		System.out.println("Enter total Size of Elements");
		int size = scanner.nextInt();
		totalNumberofElement = new int[size];
		System.out.println("#@#@#$  " + totalNumberofElement.length);
		for (int num = 0; num < totalNumberofElement.length; num++) {
			totalSum = totalSum + num;

		}
		System.out.println("totalSum  " + totalSum);
		System.out.println("Please Enter the missing number");
		missingNumber = scanner.nextInt();
		int totalAll = totalSum - missingNumber;
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("this is current All " + totalAll);
		if (totalAll != totalSum) {
			System.out.println("the missing number is " + missingNumber);
		} else {
			System.out.println("No number is missing");
		}
		System.out.println("Please find the extra number");
		int extraElement = 0;
		System.out.println("Please Enter the extra element");
		extraElement = scanner.nextInt();
		extraElement = totalSum + extraElement;
		if (totalSum != extraElement) {
			try {
				System.out.println("This is the extra Element " + extraElement);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("No extra Value exits");
		}
		return totalSum;
	}
/*https://javarevisited.blogspot.com/2015/06/top-20-array-interview-questions-and-answers.html*/
}
