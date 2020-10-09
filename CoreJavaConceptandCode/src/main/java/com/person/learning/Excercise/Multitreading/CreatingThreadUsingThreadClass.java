package com.person.learning.Excercise.Multitreading;

public class CreatingThreadUsingThreadClass extends Thread{
	public void run() {
		System.out.println("Hello Thread is running");
	}
public static void main(String[] args) {
	CreatingThreadUsingThreadClass class1 = new CreatingThreadUsingThreadClass();
	class1.start();
}
}
