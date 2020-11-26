import java.util.Scanner;

public class FizzBuzzLogic {
public static void main(String[] args) {
	
	Result result = new Result();
    Scanner n1 = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = n1.nextInt();
	result.fizzBuzz(n);
}
}


class Result{
	 public static void fizzBuzz(int n) {
		    // Write your code here
		    System.out.println("Hello");
		    
		    if(n%3==0 && n%5==0){
		        System.out.println("FizzBuzz 1");
		    }
		    else if(n%3==0) {
		    	System.out.println("");
		    }

		    else {
				 System.out.println("No");
			 }
		    }
	
}