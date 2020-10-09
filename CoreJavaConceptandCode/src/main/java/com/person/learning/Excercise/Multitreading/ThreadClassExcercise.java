package com.person.learning.Excercise.Multitreading;

class Demo extends Thread {
	Demo() {
		super("DemoThread");// creating a new,second thread
		System.out.println("Child Tread = " + this);
		start();// start a thread
	}

	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Child Thread: " + i);
				Thread.sleep(500); // thread sleep for a while.
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("exit child thread");
	}
}

public class ThreadClassExcercise {
	public static void main(String[] args) {
		new Demo(); // call constructor
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println(" Main Thread: " + i);
				Thread.sleep(1000); // thread sleep for a while.
			}
		} catch (InterruptedException e) {
			System.out.println("main exception ");
		}
		System.out.println("exit main thread");
	}
}
