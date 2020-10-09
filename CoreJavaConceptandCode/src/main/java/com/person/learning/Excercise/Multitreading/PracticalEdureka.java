package com.person.learning.Excercise.Multitreading;

public class PracticalEdureka {
	// main method represent the main thread
	public static void main(String[] args) {
		// whatever we write in here will be executed by main method
		// thread always execute in the sequence.

		// Job 1
		System.out.println("===Application started from here =========");

		// Job 2 First method
		// MyTask myTask = new MyTask();
		// printing is just a method not a thread. if its thread we should have override
		// run method in the class like we have done class MyTask extends Thread
		// myTask.printing();
		// now to call a thread we should do this
		// myTask.start();// start internally called run method

		// Another way(method) of creating the thread of Job 2

		Runnable runnable = new MyTask();
		Thread thread = new Thread(runnable);
		thread.start();

		Thread myTask2 = new Thread(new MyTask2());
		myTask2.start();
		myTask2.setDaemon(true);

		// until Job 2 is not finish the Job 3 will be in waiting state .after job2 is
		// finish then only Job 3 will start/
		// Please note if Job 2 is having too much document and running for long time
		// then JVm will give some message like PracticalEdureka is not working.
		// if we have long running job then we might get some sluggish behaviour in the
		// app can be obseerved

		// Job 3
		// some code to print the document
		for (int doc = 0; doc <= 10; doc++) {
			System.out.println("Printing the document in  PracticalEdureka class " + doc);
		}

		// now we will see both the thread main and mytask are working concurrently in
		// the program thats we whenever we compile we see different result.
		// Job 4
		System.out.println("===Application Ended from here =========");
	}
}

/*
 * class MyTask{ public void printing() { for(int print=0; print<=10;print++) {
 * System.out.println("Printing through Printer " + print); } } }
 */

class MyTask extends Thread {
	public void run() {
		for (int print = 0; print <= 10; print++) {
			System.out.println("Printing through Printer in class MyTask " + print);
		}
	}
}

class Ca {

}

class MyTask2 extends Ca implements Runnable {

	@Override
	public void run() {
		for (int run = 0; run <= 10; run++) {
			System.out.println("Printing through Printer in class MyTask2 " + run);
		}
	}

}