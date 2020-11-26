package com.person.learning.Excercise.Java8Features;

public class ThreadwithStartMethodOverriding {
public static void main(String[] args) {
	T t1= new T();
	t1.start();
	System.out.println("main");
}
}

class T extends Thread{
	public void start() {
		System.out.println("start override");
	}
	public void run() {
		System.out.println("Run method");
	}
}