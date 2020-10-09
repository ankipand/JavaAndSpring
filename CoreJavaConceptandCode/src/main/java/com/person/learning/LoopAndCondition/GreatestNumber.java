package com.person.learning. LoopAndCondition;

import java.util.Scanner;

public class GreatestNumber {
public static void main(String[] args) {
	int number1;
	int number2 = 0;
	int number3=0;
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the number");
	
	number1 = scanner.nextInt();
	number2 = scanner.nextInt();
	number3 = scanner.nextInt();
	System.out.println("OutPut");
	if(number1>number2 && number1>number3) {
		System.out.println("number1 " + number1);
	}else if(number2>number3 ) {
		System.out.println("number2 " +number2);
	}else {
		System.out.println(number3);
	}
	
	
}
}
