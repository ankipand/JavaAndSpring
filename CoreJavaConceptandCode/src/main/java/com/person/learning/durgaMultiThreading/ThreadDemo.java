package com.person.learning. durgaMultiThreading;

public class ThreadDemo {
public static void main(String[] args) {
	MyRunnable myRunnable = new MyRunnable();
	Thread thread = new Thread(myRunnable);
	thread.start();
	for(int i=0;i<10;i++) {
		System.out.println("main thread");
	}
	
}
}
