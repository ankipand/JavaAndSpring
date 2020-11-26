package com.person.learning.Java8;
@FunctionalInterface
interface OneparameterExpression{
	public int one(int a);
}
public class LambhaExpressionWithOneParameterFunctionalInterface {
public static void main(String[] args) {
	OneparameterExpression one = (int a)->{
		return a;
	};
	System.out.println(one.one(10));
}
}
