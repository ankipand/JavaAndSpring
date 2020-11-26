package com.person.learning.PatterPrograms;

public class SingletonMethods {
private static SingletonMethods sobj;
private SingletonMethods() {
	
}
public static SingletonMethods getInstance() {
	if(sobj==null)
		sobj=new SingletonMethods();
		
	 synchronized (SingletonMethods.class) 
     { 
         // check again as multiple threads 
         // can reach above step 
         if (sobj==null) 
        	 sobj = new SingletonMethods(); 
     } 
 
	return sobj;
}
}
