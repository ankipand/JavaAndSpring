package com.person.learning.Excersise;

public class CharAtExample4 {  
    public static void main(String[] args) {  
        String str = "Welcome to Javatpoint portal";  
         String l = str.trim();
        System.out.println("str.trim() " + (l.length()-1));
        System.out.println("whats the length " + str.length());
        for (int i=0; i<=str.length()-1; i++) {  
            if(i%2!=0) {  
                System.out.println("Char at "+i+" place "+str.charAt(i));  
            }  
        }  
    }  
} 