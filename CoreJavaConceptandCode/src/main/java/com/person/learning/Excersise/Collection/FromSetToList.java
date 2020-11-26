package com.person.learning.Excersise.Collection;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class FromSetToList {
public static void main(String[] args) {
	Set<String> set = new HashSet<String>();
	set.add("1");
	set.add("2");
	set.add("3");
	set.add("4");
	
	set.forEach(action->System.out.println("Looping Set :" + set.toString()));
	
	System.out.println("Converting Set into List");
	
	List<String> list = new LinkedList<String>(set);
	for(String l:list) {
		System.out.println(l);
	}
}
}
