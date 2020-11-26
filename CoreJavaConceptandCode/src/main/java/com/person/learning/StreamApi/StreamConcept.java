package com.person.learning.StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamConcept {
public static void main(String[] args) {
Stream<Integer> s =Stream.of(1,2,3,4,5,6,7,8,0);
	
	s.forEach(p -> System.out.println(p));
	
	 Stream<Integer> stream = Stream.of( new Integer[]{1,2,3,4,5,6,7,8,9} );
     stream.forEach(p -> System.out.println(p));
     
     List<Integer> list = new ArrayList<Integer>();
     
     for(int i = 1; i< 10; i++){
         list.add(i);
     }

     Stream<Integer> stream1 = list.stream();
     stream1.forEach(p -> System.out.println(p));
}
}

class StreamCreation{
	//Stream.of() --> we are creating a stream of a fixed number of integers.
Stream<Integer> s =Stream.of(1,2,3,4,5,6,7,8,0);
	
	//s.forEach(p -> System.out.println(p));
	
}