package com.person.learning.Java8;

import java.util.Arrays;
import java.util.function.BiFunction;

import javax.persistence.criteria.CriteriaBuilder.In;

@FunctionalInterface 
interface MyInterface{  
    Hello display(String say);  
} 

@FunctionalInterface
interface MyMethodReference{
	public void methodofinterface();
}

class Multiplication{  
	   public static int multiply(int a, int b){  
		return a*b;  
	   }  
	} 

class Hello{  
    public Hello(String say){  
        System.out.print(say);  
    }  
} 

public class MethodReference {
	 public void myMethod(){  
			System.out.println("Instance Method");  
		    }  
	 
public static void main(String[] args) {
	MethodReference methodReference =  new MethodReference();
	
	//1.  Method reference using the object of the class	
	MyMethodReference m1 = methodReference::myMethod;
	System.out.println(m1);
	m1.methodofinterface();
	
	//2. Method reference to a static method of a class
	
	BiFunction<Integer, Integer, Integer> int1 = Multiplication::multiply;
	int product= int1.apply(12, 15);
	System.out.println("product :" + product);
	
	//3.Method reference to an instance method of an arbitrary object of a particular type
	
	String[] stringArray = { "Steve", "Rick", "Aditya", "Negan", "Lucy", "Sansa", "Jon"};
	Arrays.sort(stringArray, String::compareToIgnoreCase);
	for(String str: stringArray){
		System.out.println(str);
	}
	
	//4. Method reference to a constructor

	  MyInterface ref = Hello::new;  
      ref.display("Hello World!");
}
}
