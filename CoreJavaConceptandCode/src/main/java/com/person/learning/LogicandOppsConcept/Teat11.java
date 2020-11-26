package com.person.learning.LogicandOppsConcept;

public class Teat11<T extends Number> {
	
	public<U extends Number > void inspect(U u) {
		System.out.println("U"+u.getClass().getName());
		
	}
	
public void show(T t) {
	System.out.println(t);
}
	public static void main(String[] args) {
	Teat11<Number> t = new Teat11<>();
	t.show(new Double(10.5));
	
	
	Teat11<Integer> i = new Teat11<>();
//	i.inspect("Hello World");
}
}
