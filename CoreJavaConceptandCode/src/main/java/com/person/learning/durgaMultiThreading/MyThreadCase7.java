package com.person.learning. durgaMultiThreading;

public class MyThreadCase7 
{
public static void main(String[] args) {
	Case7durga case7durga = new Case7durga();
	System.out.println("Case 7");
	case7durga.start();
	System.out.println("Main Method");
	//System.out.println("Case 8");
	//Case8durga case8durga = new Case8durga();
	//case8durga.start();
}
}
 class Case7durga extends Thread{
	
	 public void start() {
		 System.out.println("Start method");
	 }
	 public void run() {
		 System.out.println("Run");
	 }
 }
 
 class Case8durga extends Thread{
	 public void run() {
		 System.out.println("Run");
	 }
	 public void start() {
		 super.start();
		 System.out.println("Start method in case 8");
	 }
 }