package com.person.learning. langPackagebyDurgaSir;

public class Student {
public static void main(String[] args) {
Student student = new Student("Hello", 10);
System.out.println("student reference ");
System.out.println(student);
System.out.println("student reference with toString() method");
System.out.println(student.toString());
Student student2 = new Student("Alone", 12)	;
System.out.println("student2 reference ");
System.out.println(student2);
}

String name;
int age;
Student(String name, int age){
	this.name=name;
	this.age=age;
}
}
