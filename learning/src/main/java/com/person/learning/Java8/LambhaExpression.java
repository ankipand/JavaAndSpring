package com.person.learning.Java8;

import java.awt.Taskbar.State;

public class LambhaExpression {
	public static void main(String[] args) {
		LambhaExpression lambhaExpression = new LambhaExpression();
		StateOwner stateOwner = new StateOwner();
		//In Java 7 you could add an event listener using an anonymous interface implementation, like this:
		stateOwner.addStateListener(new StateChangeListener() {
			public void onStateChange(State oldState, State newState) {
				

			}
		});
		//===================================================End
		//In Java 8 you can add an event listener using a Java lambda expression, like this:
		stateOwner.addStateListener((State oldState, State newState) ->{
			System.out.println("Java 8 Lambha Expression : ");
		});
	}
}

class StateOwner {
	public void addStateListener(StateChangeListener listener) {
	};

	StateOwner stateOwner = new StateOwner();

}