package com.person.learning.Excersise;

class TestStringConcatenation3{  
	 public static void main(String args[]){  
		int var =1233;
	   String s1="Sachin ";  
	   String s2="Tendulkar";
	  // int s5 = Integer.
	   String s4 = Integer.toString(var).concat(s2);
	   System.out.println("Value of s4 " + s4);
	   String s3=s1.concat(s2);  
	   System.out.println(s3);//Sachin Tendulkar  
	  }  
	}  