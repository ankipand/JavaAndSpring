package com.person.learning.LogicandOppsConcept;

public class Test3 {

	
public static void main(String[] args) {
	int x=6;
	int y=7;
	int x1=8;
	int x2= 9;
	
	Secreat  secreat = new Secreat();
	secreat.go();
	
}

}

class Secreat{
	private int x=2;
	protected int y=3;
	private static int x1=4;
	protected static int x2=5;
	void go() {
		System.out.println(x+":"+y+":"+x1+":"+x2);
	}
}