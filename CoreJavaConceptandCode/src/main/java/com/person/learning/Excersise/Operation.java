package com.person.learning.Excersise;

class Operation{  
	 int data=50;  
	  
	 void change(int data){  
	 this.data=this.data+100;//changes will be in the local variable only  
	 }  
	     
	 public static void main(String args[]){  
	   Operation op=new Operation();  
	  
	   System.out.println("before change "+op.data);  
	
	   System.out.println("after change "+op.data);  
	  
	 }  
	}  