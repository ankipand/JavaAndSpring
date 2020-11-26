package com.person.learning.JVM;

public class Opps1 {
public static void main(String[] args) {
	B1 b= new B1(5);
	b.m1(5);
	System.out.println();
}
}

class A1{
	void m1(int i) throws ArrayIndexOutOfBoundsException{
		System.out.println("a1");
	}
}

class B1 extends A1{
	public B1(int i) {
		// TODO Auto-generated constructor stub
	}

	void m1(int i, int j) throws IndexOutOfBoundsException{
		System.out.println("B1");
	}
}