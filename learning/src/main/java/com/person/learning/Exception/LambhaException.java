package com.person.learning.Exception;

import java.util.Arrays;
import java.util.List;

public class LambhaException {
public static void main(String[] args) {
	List<Integer> integer = Arrays.asList(3,4,5,6,7,8,9);
	integer.forEach(i->{
		if(i==0) {
			 throw new IllegalArgumentException("Zero not allowed");
		}
		System.out.println(Math.PI / i); 
	} 
	);
	 
}
}
