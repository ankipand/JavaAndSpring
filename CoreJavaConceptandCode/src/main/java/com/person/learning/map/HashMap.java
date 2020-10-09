package com.person.learning. map;

import java.util.Arrays;
import java.util.Comparator;
import java.util.logging.Logger;

public class HashMap {
public static void main(String[] args) {
	String[] citis= {"bangalore","Pune","San Fracncisco","New york city"};
	Mysort mysort = new Mysort();
	Arrays.sort(citis,mysort);
	System.out.println(Arrays.binarySearch(citis, "New York City"));
	
}

}
class Mysort implements Comparator{
	public int compare(String a, String b) {
		return b.compareTo(a);
	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}