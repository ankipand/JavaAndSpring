package com.person.learning.JavaLang;

public class Thisandeqaul {
	int id;
	static final int price;
	static {
		price=30;
	}
	
	Thisandeqaul(int id){
		this.id =id;
		
	}
public static void main(String[] args) {
	Thisandeqaul t = new Thisandeqaul(3);
	Thisandeqaul t1 = new Thisandeqaul(3);
	System.out.println(t ==t1);
	System.out.println(t.equals(t1));
	System.out.println(Thisandeqaul.price);
	System.out.println(price);
}
}
