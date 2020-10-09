package com.person.learning.String;

import java.util.GregorianCalendar;

public class StringBufferVsStringBuilder {
public static void main(String[] args) {
	System.gc();
	long start = new GregorianCalendar().getTimeInMillis();
	long run = Runtime.getRuntime().freeMemory();
	StringBuffer stringBuffer = new StringBuffer();
	for(int i =0; i<1000000; i++) {
		stringBuffer.append(":").append(i);
	}
	long endtime =new GregorianCalendar().getTimeInMillis();
	long runMemory = Runtime.getRuntime().freeMemory();
	System.out.println("Time Take : " + (endtime-start));
	System.out.println("Memory Used :" +(run-runMemory));
}
}
