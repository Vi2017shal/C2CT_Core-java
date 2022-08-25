// WAP To Find Linear Search in Array.

package com.cg.core;

public class Linear_Search {

	public static void main(String[] args) {
		 int[] a= {3,4,1,5,2};
	        int search = 5;
	        for(int i=0;i<a.length;i++ ) {
	       	 if (search==a[i]){
	       		 System.out.println("The element is present at index" +i);
	       		 break;
	       	 }
	      }
	}

}
