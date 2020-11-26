package amdocs;

public class MyException {
public static void main(String[] args) {
	foo();
}
public static void foo() {
	try {
		throw new Exception();
	}catch(myException1 e) {
		System.out.println("myException1");
	} catch (Exception e) {
		System.out.println(" main Exception");
		e.printStackTrace();
	}
	
}
}

class myException1 extends Exception{
	
}