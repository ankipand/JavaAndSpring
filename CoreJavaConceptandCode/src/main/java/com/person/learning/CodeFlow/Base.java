package com.person.learning.CodeFlow;

public class Base {
private static int i =10;
static {
	methodOne();
	System.out.println("First Static block");
}
public static void main(String[] args) {
	methodOne();
	 	System.out.println("Main method");
}
public static void methodOne() {
	System.out.println("first static method");
}
static {
	System.out.println("secoond Static block");
}
 static int j =10;
}
