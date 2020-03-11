package com.person.learning.Excercise.Multitreading;

class CreateThread implements Runnable {
	Thread t;

	CreateThread() {
		t = new Thread(this, "new Thread");
		System.out.println("Child Thread= " + t);
		t.start(); // start a thread & call run()
	}

	@Override
	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Child Thread: " + i);
				Thread.sleep(500); // Let the thread sleep for a while.
			}
		} catch (InterruptedException e) {
			System.out.println("Child exception ");
		}
		System.out.println("exit child thread");
	}
}

public class RunnableInterfaceExample3 {

	public static void main(String[] args) throws InterruptedException {
		new CreateThread();
//		try {
//			for (int i = 5; i > 0; i--) {
//				System.out.println(" Main Thread: " + i);
//				Thread.sleep(1000); // Let the thread sleep for a while.
//			}
//		} catch (InterruptedException e) {
//			System.out.println("main exception ");
//		}
		System.out.println("exit main thread");

	}
}
