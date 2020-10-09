package accessModifier;

class AccessVariableFromAnotherClass{
	int a = 10;
	static int b = 20;
	final int c = 30;
	
}


public class MainMethodClassForAcessVariable{
	public static void main(String[] args){
		AccessVariableFromAnotherClass avfac = new AccessVariableFromAnotherClass();

		/* Instance variable can access with object */
		System.out.println("Access Instance Variable like this :"+avfac.a);

		/* we can access static variable from two types */
		/* 1. we can access static variable with the help of object */
		System.out.println("Access Static Variable like this :" +" " +avfac.b);

		/* 2. we can access static variable with the help of classname */
		System.out.println("Access Static Variable like this :" +" " +AccessVariableFromAnotherClass.b);

		/* we cannot access static variable directly */
		//System.out.println(b);

		/* we can access final variable with object */
		System.out.println("Access Final Variable like this :" +" " +avfac.c);
		/* we cannot access final variable directly */ 
		//System.out.println(c);
	}
}
