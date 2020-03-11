package com.person.learning.Excercise.Multitreading;

public class ThreadProiorityExample1 {
	public static void main(String[] args) {
		ThreadPriority t1 = new ThreadPriority();
		ThreadPriority t2 = new ThreadPriority();
		ThreadPriority t3 = new ThreadPriority();
		t1.setName("Thread 1");
		t2.setName("Thread 2");
		t3.setName("Thread 3");
		t2.setPriority(6);
		t3.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
	}
}

class ThreadPriority extends Thread {
	Thread t;

	public void run() {

		for (int i = 1; i <= 5; i++) {
			try {
				System.out.println("Thread " + Thread.currentThread().getName() + " priority "
						+ Thread.currentThread().getPriority());
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("InterruptedException " + e.getMessage());
			}

		}
	}

}
