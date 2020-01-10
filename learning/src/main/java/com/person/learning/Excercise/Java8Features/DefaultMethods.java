package com.person.learning.Excercise.Java8Features;

interface Defaults{
	default void sayTesting() {
		System.out.println("Hello Defaults Method of interface");	
	}
	public String hellointerface();
}

public class DefaultMethods implements Defaults{
public static void main(String[] args) {
	DefaultMethods defaultMethods = new DefaultMethods();
	defaultMethods.hellointerface();
	defaultMethods.sayTesting();
	
	Defaults defaults = ()->{
		System.out.println("Hello");
		return "Helooo";};
		defaults.hellointerface();
}

@Override
public String hellointerface() {
	
	return "Hello";
}
}
