package com.person.learning.Cloning;

public class Employee implements Cloneable {
	   int id;
	   String name = "";
	   Employee(int id, String name) {
	      this.id = id;
	      this.name = name;
	   }
	   public Employee clone() throws CloneNotSupportedException {
	      return (Employee)super.clone();
	   }
	   public static void main(String[] args) {
	      Employee emp = new Employee(115, "Raja");
	      System.out.println(emp.name);
	      try {
	         Employee emp1 = emp.clone();
	         System.out.println(emp1.name);
	      } catch(CloneNotSupportedException cnse) {
	         cnse.printStackTrace();
	      }
	   }
	}