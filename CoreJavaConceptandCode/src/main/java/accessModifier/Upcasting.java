package accessModifier;

class Super {
	void show() {
		System.out.println("I am parent and its Upcasting");
	}
}


public class Upcasting extends Super {
	void show() {
		System.out.println("I am child and its Upcasting");
	}
	
	

	public static void main(String[] args) {
		Super super1 = (Super) new Upcasting();
		super1.show();
	}
}
