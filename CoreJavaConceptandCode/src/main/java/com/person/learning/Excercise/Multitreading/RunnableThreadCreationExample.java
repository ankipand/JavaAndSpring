package com.person.learning.Excercise.Multitreading;

public class RunnableThreadCreationExample implements Runnable {

	@Override
	public void run() {
		System.out.println("Runnable Thread in Java");

	}

	public static void main(String[] args) {
		RunnableThreadCreationExample runnableThreadCreationExample = new RunnableThreadCreationExample();
		Thread thread = new Thread(runnableThreadCreationExample);
		System.out.println("Before Running the thread");
		thread.start();
		System.out.println("After running the thread");
	}

}
