package com.person.learning.CodeFlow;

public class ExampleClass {
	   static{
	      System.out.println("Hello this is a static block");
	   }
	   ExampleClass(){
	      System.out.println("Hello this a constructor");
	   }
	   public static void demo() {
	      System.out.println("Hello this is an instance method");
	   }
	   public static void main(String args[]){
	      new ExampleClass().demo();
	   }
	}
