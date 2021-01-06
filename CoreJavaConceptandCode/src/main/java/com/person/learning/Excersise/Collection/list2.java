package com.person.learning.Excersise.Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class list2 {
public static void main(String[] args) {
	List<String> l1 = new ArrayList<String>();
	l1.add("a");
	l1.add("b");
	l1.add("c");
	//l1.forEach(a->System.out.println(a));
	List<Integer> l2 = new ArrayList<Integer>();
	l2.add(1);
	l2.add(2);
	l2.add(3);
	String list = l2.toString();
	l1.add(list);
	String num = l2.stream().map(String :: valueOf).collect(Collectors.joining());
	//System.out.println("num : " +   num);
	System.out.println("Starting with n");
	l1.add(num);
	for(String n : l1) {
		 System.out.println(n);
	}
	
}
}
