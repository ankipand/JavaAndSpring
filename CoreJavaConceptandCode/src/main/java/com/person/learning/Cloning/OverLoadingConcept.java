package com.person.learning.Cloning;

public class OverLoadingConcept {
public static void main(String[] args) {
	Test t = new Test();
	System.out.println(t.m1(10));
	System.out.println(t.m1(10.4f));
	//System.out.println(t.m1(a));
	//System.out.println(t.m1(10.5));
}

}
class Test{
	public int m1(int i) {
		return i;
	}
	public float m1(float i) {
		return i;
	}
	
}