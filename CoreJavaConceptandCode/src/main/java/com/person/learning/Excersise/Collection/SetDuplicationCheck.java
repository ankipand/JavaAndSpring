package com.person.learning.Excersise.Collection;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDuplicationCheck {
public static void main(String[] args) {
	
	Set<String> l =  new HashSet<String>();
	l.add("A");
	l.add("B");
	l.add("C");
	l.add("A");
	
	l.forEach(action->  {
		System.out.println(action);
	});
}
}
