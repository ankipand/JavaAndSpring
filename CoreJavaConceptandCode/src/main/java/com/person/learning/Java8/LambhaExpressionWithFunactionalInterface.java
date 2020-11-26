package com.person.learning.Java8;

@FunctionalInterface
interface Message{
	public String sayHello();
}


public class LambhaExpressionWithFunactionalInterface {
public static void main(String[] args) {
	Message ms = () ->{
		return "Hello";
	};
	System.out.println(ms.sayHello());
}
}
