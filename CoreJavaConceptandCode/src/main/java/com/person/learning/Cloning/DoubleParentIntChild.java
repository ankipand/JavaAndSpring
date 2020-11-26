package com.person.learning.Cloning;

public class DoubleParentIntChild {
public static void main(String[] args) {
	Child p1= new Child();
	System.out.println(p1.m1(10.98));
}
}
class Parentp1{
	public int m1(int d) {
		return d;
	}
}

class Child extends Parentp1{
	public double m1(double d) {
		return d;
	}
}