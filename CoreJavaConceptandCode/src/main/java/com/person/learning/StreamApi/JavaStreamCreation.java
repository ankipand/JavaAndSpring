package com.person.learning. StreamApi;

import java.util.ArrayList;
import java.util.List;

public class JavaStreamCreation {
public static void main(String[] args) {
	List<String> str= new ArrayList<String>();
	str.add("Gaurav");
	str.add("rajesh");
	str.add("vibha");
	str.add("StreamApi");
	str.add("Java8Filter");
	System.out.println("Using the SImple filter method");
	for(String st:str ) {
		//System.out.println("st :" +st);
		if(st.length()<6) {
			System.out.println(st);
		}
	}
	System.out.println("Using the Stream APi in java");
	
	long count = str.stream().filter(s1->s1.length()<6).count();
	System.out.println(count);
}
}

