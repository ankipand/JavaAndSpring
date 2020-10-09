package com.person.learning.Excersise;

public class VariableDemo {
	int a;  // Instance variable
	static int b=20; // static variable
 
	public void print()
	{
		int c=10; // local variable
		System.out.println("Method local variable: "+c);
	}
 
	public static void main(String args[])
	{
		VariableDemo demo=new VariableDemo();
		System.out.println("Instance variable: "+demo.a); // Printing Instance variable
		System.out.println("Static variable: "+b);   // Printing static variable
		demo.print();  //Printing local variable using print method.
	}
}