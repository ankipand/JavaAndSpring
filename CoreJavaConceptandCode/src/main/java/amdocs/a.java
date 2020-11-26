package amdocs;

public class a {
public static void main(String[] args) {
	a a= new b();
	a.stuff();
}
public void stuff() {
	System.out.println("A");
}
}

class b extends a{
	
	public void stuff() {
	super.stuff();
		System.out.println("B");
	}
}