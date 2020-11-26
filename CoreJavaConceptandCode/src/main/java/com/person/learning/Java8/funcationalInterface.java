package com.person.learning.Java8;
@FunctionalInterface
interface fun{
	public int add(int a, int b);
}
public class funcationalInterface {
public static void main(String[] args) {
	fun f = (a,b) -> a+b ;
	System.out.println("sum : " + f.add(10,12));
}
}
