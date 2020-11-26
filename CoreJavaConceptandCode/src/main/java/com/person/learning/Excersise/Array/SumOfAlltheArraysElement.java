package com.person.learning.Excersise.Array;

import java.util.Scanner;

public class SumOfAlltheArraysElement {
public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the size of array");
	int numberofElement = scanner.nextInt();
	int[] size= new int[numberofElement];
	System.out.println("Enter the Elelemt of Arrays");
	for(int i=0;i<numberofElement;i++) {
		size[i]= scanner.nextInt();
	}
	System.out.println("Retrive Element");
	for(int a: size) {
		System.out.println(a);
	}
	int sum=0;
	for(int add:size) {
		sum=sum+add;
	}
	System.out.println("Sum " + sum);
	
	
  
}
}
class Solve{
    static int simpleArraySum(int[] ar) {
        /*
         * Write your code here.
         */
    	int sum=0;
    	for(int array: ar) {
    		sum = sum+array;
    	}
    	System.out.println("Sum");
return sum;
    }
}