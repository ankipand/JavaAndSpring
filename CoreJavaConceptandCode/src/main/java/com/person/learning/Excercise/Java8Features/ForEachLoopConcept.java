package com.person.learning.Excercise.Java8Features;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;

import net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding.Anonymous;

public class ForEachLoopConcept {
	public static void main(String[] args) {
		WithoutLambdaExpression withoutLambdaExpression = new WithoutLambdaExpression();
		WithLambdaExpression withLambdaExpression = new WithLambdaExpression();
		System.out.println("i am WithLambdaExpression");
	    withLambdaExpression.lambdaExpressionWithNoParameter();
		withLambdaExpression.lambdaExpressionWith1Parameter();
		withLambdaExpression.lambdaExpressionWithmultipleParameter();
	    System.out.println("Starting the forEach Method");
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		list.forEach(a -> System.out.println(a));
	}
}

class WithoutLambdaExpression {
	Frame frame = new Frame("ActionListener Before And After Java8");
	Button b = new Button("Click Here");
	
	public void WithoutLambdaExpression() {
		new Frame("ActionListener Before Java8");	
		b.setBounds(50, 100, 80, 50);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Hello World!");
			}
		});
		frame.add(b);
		frame.setSize(200, 200);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public void WithLambdaExpression() {
		new Frame("ActionListener After Java8");
		b.setBounds(50,100,80,50); 
		 
		b.addActionListener(e -> System.out.println("Hello World!")); 
	      frame.add(b);
	      frame.setSize(200,200);  
	      frame.setLayout(null);  
	      frame.setVisible(true); 
	}
}

class WithLambdaExpression {
	
	public void lambdaExpressionWithNoParameter(){
		/*
		 * Noparameterinterface nopara = ()-> return {"Hello"};
		 * System.out.println(nopara.sayHello());
		 */
		Noparameterinterface nopara = ()->{
			return "Hello";
		};
		System.out.println(nopara.sayHello());

	}
	public void lambdaExpressionWith1Parameter(){
		Parameterinterface para =(num) ->  num+5 ;
		System.out.println(para.increase(5));
	}
	public void lambdaExpressionWithmultipleParameter() {
		MultipleParameter mul = (int a,int b,int c)->{
			 c = a*b;
			return c;
		};
		System.out.println(mul.multi(3, 4, 7));
	}
}

@FunctionalInterface
interface Noparameterinterface{
	abstract String sayHello();
}

@FunctionalInterface
interface Parameterinterface{
	abstract int increase(int num);
}
@FunctionalInterface
interface MultipleParameter{
	abstract int multi(int a,int b,int c);
}