package com.person.learning.OppsConcept;

public class StaticClassandblock {
/*java program show the use of static block and static vari*/
	static int a;
	static{
		System.out.println(a);
	}
	/*Java Program to illustrate the use of static variable which is shared with all objects.  */
	static int b=0;
	// This is contructor of this class
	StaticClassandblock()
    {
		b++;
        System.out.println("myMethod " + b);
    }
	//Static Method
	static String var1;
	static int var2;
	
	  static void disp(){
	      System.out.println("Var1 is: "+var1);
	      System.out.println("Var2 is: "+var2);
	  }
	
	  

public static void main(String[] args) {
	StaticClassandblock classandblock = new StaticClassandblock();
	StaticClassandblock classandblock2 = new StaticClassandblock();
	System.out.println("Calling static method");
	disp();
	System.out.println("Static Block Override concept");
	
	

}
}