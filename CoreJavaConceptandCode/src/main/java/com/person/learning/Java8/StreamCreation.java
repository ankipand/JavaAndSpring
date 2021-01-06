package com.person.learning.Java8;

import java.util.stream.Stream;

public class StreamCreation {
public static void main(String[] args) {
	//Let’s first obtain a stream from an existing array:

	String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

		Stream.of(cars);
		System.out.println(Stream.of(cars).toArray());
}
}
