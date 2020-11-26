package com.person.learning.JavaLang;

import java.util.Scanner;

public class ValueOFMethod {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	//String s=scanner.
	  Integer x =Integer.valueOf(9);
      Double c = Double.valueOf(5);
      Float a = Float.valueOf("80");               
      Integer b = Integer.valueOf("444",16);

      System.out.println(x); 
      System.out.println(c);
      System.out.println(a);
      System.out.println(b);
}
}
