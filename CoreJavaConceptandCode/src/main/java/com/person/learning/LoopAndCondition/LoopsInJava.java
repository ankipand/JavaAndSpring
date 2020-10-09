package com.person.learning. LoopAndCondition;

import java.util.Scanner;

public class LoopsInJava {

public static void main(String[] args) {
	
	ForLoop forLoop=new  ForLoop();
	forLoop.looping();
	
}
}

class ForLoop{
	
	Scanner scanner = new Scanner(System.in);
	
	public void looping(){
		for(int i=0; i<10;i++) {
			System.out.println(i);
		}
		
		
		
		
	}
	
	
	
	
}