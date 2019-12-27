package com.person.learning.Excersise;

import java.util.ArrayList;
import java.util.Iterator;

public class TestJavaCollection1  {
public static void main(String[] args) {
	ArrayList<String> list = new ArrayList<String>();
	list.add("Name");
	list.add("Education");
	Iterator<String> itr = list.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.hasNext());
	}
}
}
