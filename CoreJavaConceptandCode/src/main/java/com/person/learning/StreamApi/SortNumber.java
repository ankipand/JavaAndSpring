package com.person.learning.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumber {
public static void main(String[] args) {
	List<Integer> i = Arrays.asList(1000,2000,3000,4000,5000,6000,7000);
	
	List<Integer> l = i.stream().filter(predicate->predicate>4000).collect(Collectors.toList());
	l.forEach(action->System.out.println(l));
}
}
