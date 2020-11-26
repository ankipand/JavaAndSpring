package com.person.learning.Excercise.Multitreading;

public class YeildThreadDurgaClass {
public static void main(String[] args) {
	YieldThread thread = new YieldThread();
	thread.start();
	for(int i=0;i<6;i++) {
		System.out.println("main thread");
	}
}
}

class YieldThread extends Thread{
	public void run() {
	for(int i=0;i<6;i++){
	Thread.yield();
		System.out.println(Thread.currentThread().getName());
	}
	}
}