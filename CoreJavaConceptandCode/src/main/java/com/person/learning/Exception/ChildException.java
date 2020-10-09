package com.person.learning.Exception;



class Parent  {
	public void show() throws  InterruptedException {
		throw new InterruptedException("tired, can't play");
	}
}
public class ChildException extends Parent{
public static void main(String[] args) throws InterruptedException {
	ChildException childException = new ChildException();
	Parent parent = new Parent();
	ChildException parent2;
	//Parent parent3 = (parent2) new Parent();
	childException.show();
}
public void show() throws InterruptedException{
	throw new InterruptedException("Its Child");
}
}
