package com.person.learning.StreamApi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamIterator {
public static void main(String[] args) {
	StreamIterator iterator = new StreamIterator();
	iterator.streamingwithoutStreamIterator();
	iterator.streamItertor();
}

public void streamingwithoutStreamIterator() {
	List<String> names = new ArrayList<String>();
	names.add("Ajeet");
	names.add("Negan");
	names.add("Aditya");
	names.add("Steve");
	int count=0;
	for(String s: names) {
		if(s.length()<6) {
			System.out.println(s);
		}
	}
}

public void streamItertor() {
	System.out.println("***************************");
	List<String> names = new ArrayList<String>();
	names.add("Ajeet");
	names.add("Negan");
	names.add("Aditya");
	names.add("Steve");
	
	long c=names.stream().filter(p->p.length()<6).count();
	List<String> na1= names.stream().filter(na->na.length()<6).collect(Collectors.toList());
	na1.forEach(action->System.out.println(action));
	
	
}

@Override
public String toString() {
	return "StreamIterator [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
			+ super.toString() + "]";
}
}
