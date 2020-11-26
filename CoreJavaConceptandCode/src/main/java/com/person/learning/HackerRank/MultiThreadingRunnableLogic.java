package com.person.learning.HackerRank;

public class MultiThreadingRunnableLogic {
public static void main(String[] args) {
	SampleDemo demo = new SampleDemo("A");
	SampleDemo demo1 = new SampleDemo("B");
	demo1.start();
	demo.start();
}
}
class SampleDemo implements Runnable{
	private Thread t;
	private String threadNme;
	
	 SampleDemo(String threadName) {
		// TODO Auto-generated constructor stub
     this.threadNme= threadName;
	 }

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println(threadNme);
		}
	}
	
	public void start() {
		if(t==null) {
			t= new Thread(this, threadNme);
			t.start();
		}
	}
}