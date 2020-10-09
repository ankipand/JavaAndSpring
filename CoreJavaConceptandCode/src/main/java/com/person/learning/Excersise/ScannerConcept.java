package com.person.learning.Excersise;

import java.util.Scanner;

public class ScannerConcept {
public static void main(String[] args) {
	System.out.println("Enter the Details of Customer");
	Scanner newinputtype = new Scanner(System.in);
	 newinputtype.useDelimiter("/");
	System.out.println("newinputtype.useDelimiter(\"/\") " + newinputtype.useDelimiter("").toString());
	String userName;
	int salary;
    float age;
    long savingAccount;
    boolean active;
    userName = newinputtype.next();
    salary = newinputtype.nextInt();
    age = newinputtype.nextFloat();
    savingAccount = newinputtype.nextLong();
    active = newinputtype.hasNextBoolean();
    System.out.println("Active " + active +"\n" +" "+newinputtype.hasNextBoolean()   +"\n "+ newinputtype.hasNextBoolean() );
    newinputtype.close();
    System.out.println("Details of Customer " 
    + " userName " + userName +"\n" +" salary "+salary +"\n"  +" age "+ age +"\n"  +"  savingAccount "+ savingAccount
    + "\n "+ "Active " + active +"\n"
    		);
} 
}
