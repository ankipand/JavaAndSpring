package com.person.learning. SwitchCase;

import java.util.Scanner;

public class Calculator {
	
public static void main(String[] args) {
	
	System.out.println("We Have Following Operation in this Calci\n" + "+\n"  + "-\n" );
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the opertion you wanna perform");
	String opertion = scanner.next();
   
    
    switch(opertion){
	case "+" :
		System.out.println("Enter the number of elements you want to add");
		int numberOfElement = scanner.nextInt();
		System.out.println("Give input to the machine to add sum of number");
		int[] sumofAll = new int[numberOfElement];
		for(int i =0; i<numberOfElement ;i++) {
			sumofAll[i]=scanner.nextInt();
		}
		System.out.println("Sum of All Numbers\n");
		int sum = 0;
		System.out.println(sumofAll.length);
		for(int i=0; i<sumofAll.length;i++) {
			sum += sumofAll[i];
		}
		System.out.println(sum);
		
		System.out.println("End of the Sum Opertion");
		break;
		
	case "-":
		
		
		default:
			System.out.println("No Case");
	}
    
    
}

}


