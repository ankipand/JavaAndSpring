package com.person.learning.accessModifier;

class SuperClass {
	   SuperClass get() {
	      System.out.println("SuperClass");
	      return this;
	   }
	}
public class Covarient extends SuperClass {
   Covarient get() {
	System.out.println("SubClass");
	return this;
}
   public static void main(String[] args) {
	SuperClass superClass = new Covarient();
	superClass.get();
	
}
}
