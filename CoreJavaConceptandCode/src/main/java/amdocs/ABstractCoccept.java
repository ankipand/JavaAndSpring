package amdocs;

public class ABstractCoccept extends Custom{
public static void main(String[] args) {
	System.out.println("e");
	
	Custom c = new ABstractCoccept();
	c.setSname("t");
	System.out.println(c.getName());
}
private String name;
@Override
String getName() {
	// TODO Auto-generated method stub
	return name;
}
}
 class Custom{
	String getName() {
		return null;
	}
	
	private String sname;

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}
	
	
}