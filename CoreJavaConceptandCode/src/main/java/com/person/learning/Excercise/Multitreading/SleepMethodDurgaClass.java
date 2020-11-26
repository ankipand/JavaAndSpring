package com.person.learning.Excercise.Multitreading;

public class SleepMethodDurgaClass {
public static void main(String[] args) throws InterruptedException{
	SleepMethod str= (SleepMethod) Thread.currentThread();
	SleepMethod method = new SleepMethod();
	method.start();
	for(int i=0;i<5;i++) {
		Thread.sleep(2000);
		System.out.println("Main thread");
	}
}
}

class SleepMethod extends Thread{
	static Thread st;
	public void run()
	{
		try {
			st.join();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		for(int i=0;i<6;i++) {
			System.out.println("Child Thread");
		}
	}
}