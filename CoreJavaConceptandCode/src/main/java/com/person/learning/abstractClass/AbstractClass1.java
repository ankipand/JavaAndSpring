package com.person.learning.abstractClass;

abstract class Animal {
	abstract void sound();
	
	abstract int add(int a,int b);

	void show() {
		System.out.println("Hello How are you ");
	}
}

public class AbstractClass1 extends Animal {

	@Override
	void sound() {
		System.out.println("Sounds like hello");

	}
	
	/*
	 * int result = public int add(int a , int b) {
	 * 
	 * }.add
	 */

	public static void main(String[] args) {
		AbstractClass1 abstractClass1 = new AbstractClass1();
        abstractClass1.show();
        abstractClass1.sound();
        
       
	}

	@Override
	int add(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	

	

}
