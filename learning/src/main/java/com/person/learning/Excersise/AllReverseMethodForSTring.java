package com.person.learning.Excersise;

import org.apache.logging.log4j.message.StringFormattedMessage;

public class AllReverseMethodForSTring {

	public StringBuffer reversebyStringBuffer() {
		String str = "This is JavaPoint";
		StringBuffer stringBuffer = new StringBuffer(str);

		StringBuffer returntype = stringBuffer.reverse();
		System.out.println(returntype);
		return returntype;

	}

	public String reverseByStringBuilder(String message) {
		String str = "Reverse using reverse method()";
		StringBuilder stringBuffer = new StringBuilder(message);
		System.out.println(stringBuffer.toString());

		System.out.println(stringBuffer.reverse().toString());
		return stringBuffer.reverse().toString();

	}

	public String reverseUsingStringFormatter(String message) {
		char ch[] = message.toCharArray();
		//The method toCharArray() returns an Array of chars after converting a String into sequence of characters
		String rev = "";
		for (int i = ch.length - 1; i > 0; i--) {
			rev += ch[i];
		}

		return rev;
	}

	public static void main(String[] args) {
		AllReverseMethodForSTring allReverseMethodForSTring = new AllReverseMethodForSTring();
		Object a = allReverseMethodForSTring.reverseUsingStringFormatter("Lets do it again");
		System.out.println("@@@@ c   " + a.toString());
		//System.out.println("prinitng object "+allReverseMethodForSTring.reverseUsingStringFormatter("Lets do it again"));
		allReverseMethodForSTring.reversebyStringBuffer();
		allReverseMethodForSTring.reverseByStringBuilder("Changing the type");
	}
}
