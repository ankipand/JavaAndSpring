package com.person.learning.Excersise.Array;

import java.util.ArrayList;

import org.hibernate.dialect.Informix10Dialect;

public class ArrayLIstAddingConecpt {
public static void main(String[] args) {
	ArrayList<Integer> i= new ArrayList<Integer>(2);
	i.add(1);
	i.add(1);
	i.add(1);
	ArrayList<Integer> i2 = new ArrayList<>(4);
	i2.add(2);
	i2.add(2);
	i2.add(3);
	
	i.addAll(i2);
	
	System.out.println(i.size());
	String s = null;
	System.out.println(s);
}
}
