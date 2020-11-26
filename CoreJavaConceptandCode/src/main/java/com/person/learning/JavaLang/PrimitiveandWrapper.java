package com.person.learning.JavaLang;

import java.util.ArrayList;

public class PrimitiveandWrapper {
public static void main(String[] args) {
	Wrapper wrapper = new Wrapper();
	Primitive primitive = new Primitive();
	wrapper.wrappershow();
	primitive.primitiveshow();
}
}
//This is autoboxing concept->conversion of primitive datatype into the wrapper object of the corresponding datatype. 
class Wrapper{
	char a='a';
	Character c=a;
	ArrayList<Integer> list= new ArrayList<>();
	public void wrappershow() {
		System.out.println("Wrapper Show");
	System.out.println("showing list " + list.add(25));	;
  System.out.println(a);
  System.out.println(c);
	}
}
//This is unboxing concept->conversion of wrapper object into the primitive datatype .
class Primitive{
	Character ch='a';
	 // unboxing - Character object to primitive conversion 
    char a = ch; 

    ArrayList<Integer> arrayList = new ArrayList<Integer>(); 
    
    public void primitiveshow() {
    	System.out.println("Primitives Show");
    
    arrayList.add(24); 

    // unboxing because get method returns an Integer object 
    int num = arrayList.get(0); 

    // printing the values from primitive data types 
    System.out.println(num); 
}
}