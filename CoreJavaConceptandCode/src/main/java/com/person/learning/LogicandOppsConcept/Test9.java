package com.person.learning.LogicandOppsConcept;

public class Test9 {
public static void main(String[] args) {

	try {
		int x=0;
		for(x=1;x<4;x++); {
			System.out.println(x);
		}
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		System.out.println("finaly");
		
	}
}
}
