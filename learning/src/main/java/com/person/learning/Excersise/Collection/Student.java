package com.person.learning.Excersise.Collection;

public class Student implements Comparable {
	private String name;
	private int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}

	public String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		return "";
	}

	@Override
	public int compareTo(Student per) {
		if (this.age == per.age)
			return 0;
		else
			return this.age > per.age ? 1 : -1;
	}

	public static void main(String[] args) {
		Person e1 = new Person("Adam", 45);
		Person e2 = new Person("Steve", 60);
		int retval = e1.compareTo(e2);

		switch (retval) {
		case -1: {
			System.out.println("The " + e2.getName() + " is older!");
			break;
		}

		case 1: {
			System.out.println("The " + e1.getName() + " is older!");
			break;
		}

		default:
			System.out.println("The two persons are of the same age!");

		}
	}
}
