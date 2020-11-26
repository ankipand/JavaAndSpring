package com.person.learning.abstractClass;

public class  DynamicBinding {
public static void main(String[] args) {
	SuperClass superClass = new SuperClass();
	SuperClass subclass =new Subclass();
	
}
}

class SuperClass{
	void show() {
		System.out.println("This is SuperClass");
	}
}
class Subclass extends SuperClass{
	@Override
	void show() {
		System.out.println("This is Subclass");
	}
	
}