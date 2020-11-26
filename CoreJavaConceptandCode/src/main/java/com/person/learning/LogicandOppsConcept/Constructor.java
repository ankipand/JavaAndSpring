package com.person.learning.LogicandOppsConcept;

public class Constructor {
static String str;

public void Constructor() {
	System.out.println("In cons");
	str="Hello";
}
public static void main(String[] args) {
		Constructor constructor = new Constructor();
		System.out.println(str);
}
}
