package com.person.learning.OpeartorinJava;

import java.sql.Date;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.aspectj.weaver.ast.HasAnnotation;
import org.springframework.dao.DataAccessResourceFailureException;

public class Test1{

public static void main(String[] args) {
	Test1 t = new Test1();
	//t.append(Arrays.asList("one","two"));
	
	Set s = new HashSet();
	s.add(null);
	Iterator i =s.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}

}
}
/*
HashMap h = new HashMap();
h.put(null, 1);
h.put(3, 2);
Set s = h.keySet();
Iterator i =s.iterator();

while(i.hasNext()) {
	System.out.println(i.next());
}
}



Date d = new Date();
DateFormat df = new DateFormat();


public static <E> void append(List<E> l) {


E e = new E();
l.add(e);
System.out.println(l);
}


*/