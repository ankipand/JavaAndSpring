package com.person.learning.durgaMultiThreading;

public class ThreadDemoR {
public static void main(String[] args) {
	My1thread myThread = new My1thread();
	Thread thread = new Thread(myThread);
	thread.start();
	System.out.println("main method");
}
}

class My1thread extends Thread{
	public void run() {
		System.out.println("run");
	}
}