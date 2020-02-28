package com.person.learning.String;

import java.util.Scanner;

public class BasicCharString {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Please Enter the Size of Array");
	int size = scanner.nextInt();
	String[] dynamicSizeofChar = new String[size] ;
	System.out.println("Please Enter the Size of Character");
	for(int i =0; i<size;i++) {
		dynamicSizeofChar[i]=scanner.next();
	}
	for(String read : dynamicSizeofChar) {
		System.out.println(read.toCharArray());
	}
	System.out.println();
}
}
