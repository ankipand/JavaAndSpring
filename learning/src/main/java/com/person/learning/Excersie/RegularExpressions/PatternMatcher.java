package com.person.learning.Excersie.RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.validation.constraints.AssertTrue;

public class PatternMatcher {
public static void main(String[] args) {
	Pattern pattern = Pattern.compile("Foo");
	System.out.println(pattern.toString());
	Matcher matcher = pattern.matcher("Foo");
	System.out.println(matcher.toString());
	boolean match = matcher.matches();
	System.out.println(" boolean match " + match);
		/*
		 * if(matcher.equals(pattern)) { System.out.println("true"); }else {
		 * System.out.println("False"); }
		 */
	
}
}
