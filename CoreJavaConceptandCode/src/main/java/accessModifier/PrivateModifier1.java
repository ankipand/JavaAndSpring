package accessModifier;

public class PrivateModifier1 {
public static void main(String[] args) {
	A a1 = new A();
	//a1.show(); // error The method show() from the type A is not visible
	//a1.num;

//accessing the private variable using the getter method;
	a1.getNum();
	System.out.println("accessing the private variable using the getter method;  "  + a1.getNum());
}
}
class A{
	private int num=10;
	 private void show() {
		 System.out.println("Helllo bae");
	 }
	 //Accessing private value using getter and setter
	 void var(int local) {
		 this.num= local;
	 }
	public int getNum() {
		return num;
	}
	
	 
	 
}