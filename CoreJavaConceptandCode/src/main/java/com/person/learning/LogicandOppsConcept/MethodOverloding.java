package com.person.learning.LogicandOppsConcept;

import java.io.IOException;
import java.util.Scanner;

public class MethodOverloding {
public static void main(String[] args) throws IOException{
	Solution1 add = new Solution1();
	System.out.println("Result");
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Calling the  String add(double a, String b)\n");
	System.out.println("Please Enter a double datatype number and String datatype\n");
	double a = scanner.nextDouble();
	String b = scanner.next();
	System.out.println("Result of String add(double a, String b)");
	System.out.println(add.add(a, b));
		
	System.out.println("***************************************************************************\n");
	
	System.out.println("Calling the  String add(double a, double b)");
	System.out.println("Please Enter a double datatype number and again a double datatype number\n");
	double a1 = scanner.nextDouble();
	double a2 = scanner.nextDouble();
	System.out.println(add.add(a1, a2));
	System.out.println("***************************************************************************\n");

	System.out.println("Calling the  String add(String a, String b)");
	System.out.println("Please Enter a String datatype number and again a String datatype number\n");
	String b1 = scanner.next();
	String b2 = scanner.next();
	System.out.println(add.add(b1,b2));
	System.out.println("***************************************************************************\n");
}
}

class Solution1{
	
	public String add(double a, String b) {
		String c = null;
		String d = String.valueOf(a);
		c= d+b;	
		return c;
		
	}
	
	
	public String add(double a, double b) {
		double c = a+b;
		String s = String.valueOf(Math.round(c));
		//System.out.println(":" +s);
		return s;
	}
	
	public String add(String a, String b) {
		String c = a+b;
		//System.out.println(c);
		return c;
	}
}