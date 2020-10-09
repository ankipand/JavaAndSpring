package com.person.learning.Exception;

public class ArrayException {
public static void main(String[] args) {
	try {
		String arr[] = new String[10];
		arr=null;
		arr[0]="null";
		System.out.println(arr[0]);
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		System.gc();
	}
}
}
