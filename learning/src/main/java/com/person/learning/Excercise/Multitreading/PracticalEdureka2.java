package com.person.learning.Excercise.Multitreading;

public class PracticalEdureka2 {
	public static void main(String[] args) {
		System.out.println("=====Starting of Thread========");

		Printer printer = new Printer();
		/* printer.printDocument(10, "GSINGH"); */

		MyThread myThread = new MyThread(printer);// MyThread is having reference to the Printer Object.
		YourThread thread = new YourThread(printer);
		//if multiple thread is working on same single object we must synchronized them
		myThread.start();
		/*try {
			myThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		//Rather than making each thread a join thread we will make the method synchronized so it will reduce most of boilerplate code.
		thread.start();
		System.out.println("=====Ending of Thread========");
	}
}

class MyThread extends Thread {
	Printer printRef;

	MyThread(Printer p) {
		this.printRef = p;
	}

	@Override
	public void run() {
		synchronized (printRef) {
			printRef.printDocument(10, "Salary.pdf");
			super.run();
		}
		
	}
}

class YourThread extends Thread {
	Printer printRef;

	YourThread(Printer p) {
		this.printRef = p;
	}

	@Override
	public void run() {
		synchronized (printRef) {
			printRef.printDocument(10, "Employee.pdf");
			super.run();
		}
	}
}

class Printer {
	//public synchronized void printDocument(int numberofcopies, String docName) {
		public  void printDocument(int numberofcopies, String docName) {
		for (int i = 0; i < numberofcopies; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Printing the " + docName);
		}
	}
}