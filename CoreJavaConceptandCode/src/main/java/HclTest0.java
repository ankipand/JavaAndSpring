import java.util.Scanner;

public class HclTest0 {
public static void main(String[] args) {
	// float radius = Float.parseFloat(sc.nextLine());
	 Scanner s = new Scanner(System.in);
	 float a = s.nextFloat();
     Circle c1 = new Circle(a);
     
   	System.out.println(c1.getArea());
}
}
class Circle{
	float radius;
	Circle(float radius){
		this.radius=radius;
	}
	
	public float getArea() {
		// TODO Auto-generated method stub
		double area= 3.14*radius*radius;
		float f1=(float) (area);
		Math.ceil(area);
		return (float) 12.21;
	}

	
}