package com.person.learning. map;
import java.util.HashMap;
import java.util.Map;


public class HashMapKeyDuplicateKeyandValueResult {
  public static void main(String[] args) throws CloneNotSupportedException {
	  HashMapKeyDuplicateKeyandValueResult duplicateKeyandValueResult = new HashMapKeyDuplicateKeyandValueResult();
	  duplicateKeyandValueResult.DuplicateKey();
	 // duplicateKeyandValueResult.clone();
	  
}

  public void DuplicateKey() {
	  HashMap<Integer,String> duplicateKey = new HashMap<>();
	  duplicateKey.put(1, "FruitesName ");
	  duplicateKey.put(2, "Mango");
	  duplicateKey.put(3, "Orange");
	  duplicateKey.put(2, "Pineapple");
	  duplicateKey.put(1, "PPPPPPP ");
	  
	  
	  for(Map.Entry m : duplicateKey.entrySet()) {
		  System.out.println("duplicate keys are : "+ m);
	  }
	  
  }
}
