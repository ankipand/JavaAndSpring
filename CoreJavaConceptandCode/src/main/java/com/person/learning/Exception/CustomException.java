package com.person.learning.Exception;

public class CustomException {
	public static void main(String[] args) throws SalaryException {
		Person person = new Person();
		person.calc();
	}

}

class Person extends Exception {
	public void calc() throws SalaryException {
		System.out.println("#######");
		throw new SalaryException();

	}
}

class SalaryException extends Exception {

}