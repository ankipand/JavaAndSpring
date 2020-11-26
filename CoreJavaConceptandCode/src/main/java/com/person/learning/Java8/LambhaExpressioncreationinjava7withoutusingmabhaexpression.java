package com.person.learning.Java8;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LambhaExpressioncreationinjava7withoutusingmabhaexpression{
public static void main(String[] args) {
	Frame frame= new Frame("ActionListener Before Java8");
	
	
    
    Button b=new Button("Click Here");  
    b.setBounds(50,100,80,50);  

    b.addActionListener(new ActionListener(){  
       public void actionPerformed(ActionEvent e){  
 	     System.out.println("Hello World!"); 
       }  
    });  
    frame.add(b);
 
    frame.setSize(200,200);  
    frame.setLayout(null);  
    frame.setVisible(true); 
}
}


