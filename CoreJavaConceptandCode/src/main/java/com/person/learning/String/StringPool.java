package com.person.learning.String;

public class StringPool {
	public static void main(String[] args) {
		StringPool stringPool = new StringPool();
		stringPool.stringArrary();
		System.out.println("==================================");
		stringPool.concatWord();
	}

	public void stringArrary() {
		String s1 = "java";
		char[] ch = { 's', 't', 'r', 'i', 'n', 'g', 's' };
		String s2 = new String(ch);// converting char array to string
		String s3 = new String("example");// creating java string by new keyword
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
	
	public String concatWord() {
		String s="Gaurav";
		s = s.concat("Singh");
		System.out.println(s);
		return s;
	}
}
