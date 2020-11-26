package com.person.learning.abstractClass;

import org.aspectj.weaver.ast.Test;

abstract class Hello{
	public void show() {
		System.out.println("Hello");
	};
	
	public abstract void show2();
}
public class Testing extends Hello {
public static void main(String[] args) {
	Testing testing = new Testing();
	testing.show();
}

@Override
public void show2() {
	// TODO Auto-generated method stub
	
}
}
