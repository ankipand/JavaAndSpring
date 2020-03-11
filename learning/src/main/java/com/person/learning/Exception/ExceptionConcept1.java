package com.person.learning.Exception;

public class ExceptionConcept1 {
public static void main(String[] args) {
	int i;
	try{
		i = calc();
		System.out.println(i);
	}catch(Exception e) {
		e.printStackTrace();
	}
}
static int calc() {
	return 8%2;
	
}
}
