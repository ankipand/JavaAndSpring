package amdocs;

public class Car {
public static void main(String[] args) {
	Car car = new Car("Honda");
	foo(car);
	System.out.println(car.getName().equals("Kia"));
}
private String name;

public Car(String name) {
	super();
	this.name=name;
}
public static void foo(Car car) {
	System.out.println(car.getName().equals("Honda"));
	car.setName("Kia");
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}


}
