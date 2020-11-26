package com.person.learning.Excercise.Multitreading;

public class DugraSirMyThreadPriority extends Thread {
public static void main(String[] args) {
	System.out.println(Thread.currentThread().getName());
	MyThread12 t = new MyThread12();
	System.out.println(t.getName());
	Thread.currentThread().setName("Gaurav Thread");
	System.out.println(Thread.currentThread().getName());
}
}
class MyThread12 extends Thread{
	
}