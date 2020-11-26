package com.person.learning.StreamApi;

import java.util.stream.Stream;

public class Iteratinganddisplayingselectedintegers {
public static void main(String[] args) {
	  Stream.iterate(1, count->count+1)  
      .filter(number->number%3==0)  
      .limit(7)  
      .forEach(System.out::println);  
   
}
}
