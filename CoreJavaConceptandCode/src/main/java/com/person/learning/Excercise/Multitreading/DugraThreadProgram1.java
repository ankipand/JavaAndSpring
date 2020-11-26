package com.person.learning.Excercise.Multitreading;

public class DugraThreadProgram1 {
public static void main(String[] args) {
	MyThread1 myThread1 = new MyThread1();
	myThread1.start();
	for(int i=0;i<6;i++) {
		System.out.println("main");
	}
}
}
class MyThread1 extends Thread{
	public void run() {
		for(int i=0;i<11;i++)
		System.out.println("Run");
	}
}