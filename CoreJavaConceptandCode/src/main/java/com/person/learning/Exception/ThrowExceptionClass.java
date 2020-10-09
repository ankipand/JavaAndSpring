package com.person.learning.Exception;

public class ThrowExceptionClass {
public static void main(String[] args) {
	   try
       {
           // Creating an object of ArithmeticException
           ArithmeticException ae = new ArithmeticException();
           //Manually throwing ArithmeticException
           throw ae;
       }
       catch (ArithmeticException e)
       {
           System.out.println("Caught the manually thrown Exception");
       }
}
}
