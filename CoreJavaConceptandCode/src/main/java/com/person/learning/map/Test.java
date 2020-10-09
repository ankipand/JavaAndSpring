package com.person.learning. map;

public class Test {
public static void main(String[] args) {
	Test test = new Test();
	test.set(0);
	test.set(1);
	test.func();
}
boolean [] array = new boolean[3];
int count =0;
void set(int x) {
	array[x]= true;
	count++;
}
void func() {
	if(array[0]&&array[++count-2]||array[count++-1])
		count++;
	System.out.println(count);
}
}
