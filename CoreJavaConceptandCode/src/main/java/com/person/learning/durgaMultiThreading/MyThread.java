package com.person.learning.durgaMultiThreading;

public class MyThread extends Thread {
public static void main(String[] args) {
	MyThread myThread= new MyThread();
	myThread.run();
	myThread.start();
}
public void run() {
	for(int i=0; i<10;i++) {
		System.out.println("Child Thread");
	}
	for(int j=0;j<5;j++) {
		System.out.println("Run");
	}
}

}
