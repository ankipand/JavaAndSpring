package com.person.learning.HackerRank;

interface Base{
	void method();
	
}
class BaseC{
public	void method() {
		System.out.println("Inside BaseC");
	}
}

public class InheritanceLogic extends BaseC implements Base{
public static void main(String[] args) {
	new InheritanceLogic().method();
}
}
