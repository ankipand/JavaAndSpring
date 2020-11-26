package com.person.learning.JavaLang;

public class StringMemory {
public static void main(String[] args) {
	String s ="abc";
	String s1 ="cdf";
	StringMemory memory = new StringMemory();
	System.out.println("ndjfd");
	
	System.out.println("m1 "+memory.hashCode());
	memory.m1();
	memory.m2();
	
}
public String  m1() {
	 String h1="hello";
	 System.out.println("h1 " + h1.hashCode());
	return"1";
}

public String m2() {
   String h1="hello";
   h1.hashCode();
   System.out.println("h1 " + h1.hashCode());
	return "w1";
}
}