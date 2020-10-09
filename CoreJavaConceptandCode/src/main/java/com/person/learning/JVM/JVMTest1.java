package com.person.learning. JVM;

import java.lang.reflect.*;

public class JVMTest1 {
public static void main(String[] args) {
	Student s = new Student();
	Class c = s.getClass();
	System.out.println(c.getName());
	Method[] m = c.getDeclaredMethods();
	
	for (int i=0; i<m.length; i++)
		System.out.println("m[i] " + m[i]);
		Field[] f = c.getDeclaredFields();
		for (int i=0; i<f.length; i++)
		System.out.println("f[i] " + f[i]);
}
}
class Student{
	private String name;
	private int rollNo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	
	
}