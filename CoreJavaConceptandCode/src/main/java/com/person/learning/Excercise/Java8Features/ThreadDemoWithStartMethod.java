package com.person.learning.Excercise.Java8Features;

public class ThreadDemoWithStartMethod {
public static void main(String[] args) {
	ThreadwithRun run= new ThreadwithRun();//Instantiation of a Thread
	run.start();//starting a thread
	for(int j=0;j<5; j++) {
		System.out.println("j " + j);
	}
}
}
class ThreadwithRun extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("i " + i);
		}
	}
}