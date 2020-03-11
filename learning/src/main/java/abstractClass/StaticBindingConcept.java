package abstractClass;

public class StaticBindingConcept {
public static void main(String[] args) {
	Parent parent = new Parent();
	Parent parent2 = new Child();
	parent.msg();
	parent2.msg();
}
}

class Parent{
	static void msg() {
		System.out.println("This is Parent Class");
	}
}
class Child extends Parent{
	static void msg() {
		System.out.println("This is CHild Class");
	}
}
