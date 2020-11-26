package com.person.learning.Java8;

import java.util.ArrayList;
import java.util.List;

public class LambhaExpressionMakingIterationonList {
public static void main(String[] args) {
	List<String> list=new ArrayList<String>();  
    list.add("Rick");         
    list.add("Negan");       
    list.add("Daryl");         
    list.add("Glenn");         
    list.add("Carl"); 
    
    list.forEach(li->System.out.println(li));
}
}
