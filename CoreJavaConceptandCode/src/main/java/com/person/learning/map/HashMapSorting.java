package com.person.learning. map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapSorting {
public static void main(String[] args) {
	HashMapSorting hashMapSorting = new HashMapSorting();
}
public void SortingByLinkedHashMa() {
	//implementation of HashMap  
	HashMap<Integer, String> hm=new HashMap<Integer, String>();  
	//addding keys and values to HashMap  
	hm.put(23, "Yash");  
	hm.put(17, "Arun");  
	hm.put(15, "Swarit");  
	hm.put(9, "Neelesh");  
	
	Iterator<Integer> itr = hm.keySet().iterator();
	System.out.println("Before Sorting");  
    while(itr.hasNext()) {
    	int Key = itr.next();
    System.out.println("Rollnumber :" + Key  +":Name :"+ hm.get(Key));
    }
	
}

}
