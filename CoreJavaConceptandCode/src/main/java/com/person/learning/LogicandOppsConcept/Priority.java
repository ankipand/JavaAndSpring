package com.person.learning.LogicandOppsConcept;

import java.util.PriorityQueue;

public class Priority {
	public static void main(String[] args) {
		 PriorityQueue r = new PriorityQueue();
		 
		 r.add("dishes");
		 r.add("laundry");
		 r.add("bills");
		 r.offer("bills");
		 System.out.println(r.size() +""+ r.poll());
		 System.out.println(""+ r.peek()+""+ r.poll());
		 System.out.println(""+r.poll()+""+r.poll());
	}

 
 
}
