package com.person.learning.Excersise;

import java.util.Scanner;

import net.bytebuddy.implementation.ToStringMethod;

public class ComparableLogic implements Comparable {
public static void main(String[] args) {
	
}
private String name;
private int age;



public ComparableLogic(String name, int age ) {
	this.name = name;
	this.age = age;	
}
@Override
public String toString() {
	return "";
}
@Override
public int compareTo(ComparableLogic comparableLogic) {
	if(this.age == comparableLogic.age)
		return 0;
	else
	return this.age>comparableLogic.age?1:-1;
}

public String getName() {
	return name;
}

public int getAge() {
	return age;
}



public void method() {

}



}
