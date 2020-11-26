package com.person.learning.Excersise.Array;

public class Merging2Array {
public static void main(String[] args) {
	Merging2Array array = new Merging2Array();
	int[] a1= {1,-1,2};
	int[] a2= {2,5,5};
	/*int[] i= array.mergeArray(a1,a2);
	for(int x=0;x<i.length;x++) {
		System.out.println(i[x]);
	}*/
	array.mergeArray1(a1, a2);
	
	
}
public static int[] mergeArray1(int[] arr1, int[] arr2 ) {
	int l1= arr1.length;
	int l2= arr2.length;
	
	int[] mergeresult = new int[l1+l2];
	int i=0,j=0,k=0,x;
	System.out.println("Array 1");
	for(x=0;x<l1;x++) {
		System.out.println(arr1[x]);
	}
	System.out.println("Array 2");
	for(x=0;x<l2;x++) {
		System.out.println(arr1[x]);
	}
	
	while(i<l1 && j<l2) {
		if(arr1[i] < arr2[j]) {
			mergeresult[k++]=arr1[i++];
		}
		else
			mergeresult[k++]=arr2[j++];
	}
	
	while(i<l1)
		mergeresult[k++] = arr1[i++];
	
	while (j<l2) {
		mergeresult[k++] = arr2[j++];
	}
	 
	System.out.println("after merging");
	for(x=0;x<l1+l2;x++) {
		System.out.println(mergeresult[x]);
	}
	
	return mergeresult;
}
public static int[] mergeArray(int[] arr1, int[] arr2 ) {
	int[] mergeresult = new int[arr1.length+arr2.length];
	int i =0,j=0,k=0;
	while(i<arr1.length && j<arr2.length){
	    if(arr1[i] < arr2[j]){
	        mergeresult[k]=arr1[i];
	        i++;
	        j++;
	    }
	    else{
	        mergeresult[k]=arr2[j];
	        j++;
	        i++;
	    }
	    
	}
	while(i<arr1.length){
	    mergeresult[k]=arr1[i];
	    i++;
	    k++;
	}
	while(j<arr2.length){
	    mergeresult[k]=arr2[j];
	    j++;
	    k++;
	}
	System.out.println(mergeresult);
	return mergeresult;
	
}
}
