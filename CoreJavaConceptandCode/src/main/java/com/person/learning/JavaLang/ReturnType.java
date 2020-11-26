package com.person.learning.JavaLang;

import java.io.IOException;

import javax.management.RuntimeErrorException;

public class ReturnType {
public static void main(String[] args) {
	//System.out.println(factorial(5));	
	foo();
	try {
		ReturnType r = new ReturnType();
		r.foo();
	}catch(Exception e) {
		e.printStackTrace();
	}
}
public static long factorial(int n) {
	if(n==1)
	return n;
	else 
		return n*factorial(n-1);
}
public static void foo() {
try {
	throw new RuntimeErrorException(null);
}
	
finally{
	System.out.println();
}
}
}