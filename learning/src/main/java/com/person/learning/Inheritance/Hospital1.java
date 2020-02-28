package com.person.learning.Inheritance;

class Doctor {
	 void Doctor_Details() {
	  System.out.println("Doctor Details...");
	 }
	}

class Surgeon extends Doctor {
	void Surgeon_Details() {
		  System.out.println("Surgeon Details...");
		 }
	}  	 

public class Hospital1 {
	 public static void main(String args[]) {
	  Surgeon s = new Surgeon();
	  s.Doctor_Details();
	  s.Surgeon_Details();
	 }
	} 