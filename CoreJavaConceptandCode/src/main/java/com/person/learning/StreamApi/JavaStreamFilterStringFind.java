package com.person.learning.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class JavaStreamFilterStringFind {
public static void main(String[] args) {
	List<String> words = Arrays.asList("pen", "custom", "orphanage",
            "forest", "bubble", "butterfly");
	
	Set<String> s= words.stream().filter(search->search.startsWith("p")).collect(Collectors.toSet());
	System.out.println("s : " + s);
}
}
