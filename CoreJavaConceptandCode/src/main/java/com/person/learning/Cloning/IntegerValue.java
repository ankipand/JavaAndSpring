package com.person.learning.Cloning;

public class IntegerValue {
public static void main(String[] args) {
	Integer i = new Integer(10);
	Integer i1 = new Integer(10);
	Integer a=i;
	System.out.println(a==i);
	System.out.println(i.hashCode());
	System.out.println(i1.hashCode());
	System.out.println(i==i1);
	Integer a1 =128;
	Integer a2= 128;
	System.out.println(a1==a2);
	
	Integer b1=10;
	Integer b2= 10;
	System.out.println(b1==b2);
}
}
