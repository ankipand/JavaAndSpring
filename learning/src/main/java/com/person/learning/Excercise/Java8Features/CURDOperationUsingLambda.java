package com.person.learning.Excercise.Java8Features;

public class CURDOperationUsingLambda {
public static void main(String[] args) {
	CURD curd = new CURD();
	curd.performcurrd();
	curd.checkingevenorodd();
}
}

class CURD{
	public void performcurrd() {
		CURDInterface curd =(int add,int add2)->{
			return add+add2;
		};
		System.out.println("CURD ADD "+ curd.curdAll(10, 20));
		curd=(int sub, int sub2)->{
			return sub-sub2;
		};
		System.out.println("CURD SUB "+curd.curdAll(10, 20));
		curd=(int mul1,int mul2)->{
			return mul1*mul2;
		};
		
		
	}
	
	public void checkingevenorodd()
	{
		EvenorOdd evenorodd = (int num)->{
			if(num%2 == 0) {
				System.out.println("Even " + num);
			}else {
				System.out.println("Odd " + num);
			}
		};
		evenorodd.evenodd(7);
		evenorodd.evenodd(8);
	}
}
@FunctionalInterface
interface CURDInterface{
	abstract int curdAll(int a, int b);
}
@FunctionalInterface
interface EvenorOdd{
	abstract void evenodd(int a);
}

