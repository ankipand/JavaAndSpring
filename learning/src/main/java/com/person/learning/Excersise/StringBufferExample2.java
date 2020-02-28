package com.person.learning.Excersise;

class StringBufferExample2 {
	public static void main(String args[]) {
		String a = "Hello";
		StringBuffer sb = new StringBuffer(a);
		sb.insert(2, "Java");// now original string is changed
		System.out.println(sb);// prints HJavaello

		StringBuffer sb1 = new StringBuffer("Hello");
		sb1.append("Java").trimToSize();;// now original string is changed
		System.out.println(sb1);// prints Hello Java
	}
}