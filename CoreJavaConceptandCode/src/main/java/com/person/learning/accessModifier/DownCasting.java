package com.person.learning.accessModifier;

class Super1 {
   void sample() {
      System.out.println("method of super class and its downcasting");
   }
}


public class DownCasting extends Super1{
void sample() {
	System.out.println("method of downCasting class and its downcasting");	
	}
public static void main(String[] args) {
	Super1 super1 = new DownCasting();
	DownCasting downCasting = (DownCasting) super1;
	downCasting.sample();
}
}
