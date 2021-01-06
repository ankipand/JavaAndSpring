package com.person.learning.BasicProgrammingSkills;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.boot.env.SystemEnvironmentPropertySourceEnvironmentPostProcessor;



public class Palindrome {  
public static void main(String[] args) {
	Palindrome palindrome = new Palindrome();
	//palindrome.StringPalindrome(); 
	//palindrome.UpperWord();
	palindrome.numberPalindrom();
	
}
public void UpperWord() {
	List<String> words = new ArrayList<>();
    String dataStr = "This text was just made RANDOMLY to show what I MEANT.";
    Pattern pattern = Pattern.compile("[A-Z][A-Z]+");
    Matcher matcher = pattern.matcher(dataStr);
    while (matcher.find()) {
        words.add(matcher.group());
    }

    System.out.println(words);
    
    BigInteger biginteger=new BigInteger("8976543245"); 
    BigInteger val=new BigInteger("9248040402"); 
 
    System.out.println( biginteger.max(val));
    

}
     

public void StringPalindrome() {
	String str, rev = "";
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a string:");
    str = sc.nextLine();

    int length = str.length();

    for ( int i = length - 1; i >= 0; i-- )
       rev = rev + str.charAt(i);

    if (str.equals(rev))
       System.out.println(str+" is a palindrome");
    else
       System.out.println(str+" is not a palindrome");
}

public void numberPalindrom() {
	int num, rem, temp,sum = 0;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the Num");
	num= scanner.nextInt();
	System.out.println("num " + num);
	temp=num;
	while(num>0){
	rem	= num%10;
	sum= (sum*10)+rem;
	num=num/10;
	}
	if(temp==sum)
		System.out.println("Palindrome");
	else
		System.out.println("No ");
}
}
