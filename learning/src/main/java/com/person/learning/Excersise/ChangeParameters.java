package com.person.learning.Excersise;

public class ChangeParameters
{
 public static void main(String[] args)
 {
  int number = 1;
 
  System.out.println("main method "+ number);
  tryToChangeNumber(number);
  System.out.println("after main method "+ number);
 }
 public static void tryToChangeNumber(int i)
 {
  i = 2;
  System.out.println("@@@@@@@  " + i);
 }
}