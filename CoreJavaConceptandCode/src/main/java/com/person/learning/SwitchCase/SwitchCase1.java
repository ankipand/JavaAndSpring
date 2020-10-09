package com.person.learning. SwitchCase;

import java.util.Scanner;

public class SwitchCase1 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the Case");
	String name= scanner.next();
	
	switch(name.toUpperCase()){
	case "Gaurav" :
		System.out.println("CASE 1");
		break;
	case "GAURAV":
		System.out.println("GAURAV");
		break;
		default :
			System.out.println("No Case");
	}
}
}
