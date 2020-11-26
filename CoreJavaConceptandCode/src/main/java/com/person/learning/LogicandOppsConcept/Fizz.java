package com.person.learning.LogicandOppsConcept;

import java.io.IOException;
import java.util.Scanner;

public class Fizz {
public static void main(String[] args) throws IOException{
	Solution solution = new Solution();
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the Number ");
	int i = scanner.nextInt();
	solution.fizzBuzz(i);
	
	
}
}

class Solution{
 /*
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     */
  
    public static void fizzBuzz(int n) {
   System.out.println("FizzBuzz");
  
 if(n/3==0  && n/5==0 ) {
	 System.out.println("Fizz 1");
 }
  
    }
}
