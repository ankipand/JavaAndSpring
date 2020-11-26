package com.person.learning.OpeartorinJava;

import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {
	System.out.println("Enter the 2 Numbers");
	Scanner scanner = new Scanner(System.in);
	int firstNumber1 = scanner.nextInt();
	
	System.out.println("The First Number to add : "+ firstNumber1);
	
	int  secondNumber1= scanner.nextInt();
	
	System.out.println("The Second Number to add : "+ secondNumber1);
	System.out.println("********************  Adder ****************************** \n");
	Adder adder = new Adder();
	System.out.println("OutPut of Adder class :FirstNumber+SecondNumber :" + adder.add(firstNumber1, secondNumber1));
	
	System.out.println("******************** Multiper ****************************** \n");
	
	int mul = 0; 
	for(int i =1; i<= secondNumber1; i++) {
		System.out.println("First Number :"+ firstNumber1 +" " +"Loop Number:"+ i +"\n");
		mul= firstNumber1+secondNumber1;	
	}
	System.out.println("Output of Multiplier Class : " + mul +"\n");
	
	System.out.println("********************  Program Finish ****************************** ");
}
}


class Adder extends Calci{

	@Override
	int add(int a, int b) {
		return a+b;
	}
	
}

class Multiplier extends Calci{
	@Override
	int add(int a, int b) {
		return a*b;
	}
	
	
}

abstract class Calci{
	abstract int add(int a, int b);
}
	