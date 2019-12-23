package com.person.learning.Excersise;

//Java Program to demonstrate the way of passing an array  
//to method.  
class Testarray2{  
//creating a method which receives an array as a parameter  
static void min(int arr[]){  
int min=arr[0]; 
System.out.println("working in method "+ min);  
for(int i=0;i<arr.length;i++)  
	
if(min>arr[i])  
	
min=arr[i];  

System.out.println("lenght of array " + arr.length);  	
System.out.println(min);  
}  

public static void main(String args[]){  
int a[]={3,33,4,5};//declaring and initializing an array  
min(a);//passing array to method  
}}  