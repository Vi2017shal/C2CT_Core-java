// WAP Insertion Sort Using Logic

package com.cg.core;

public class Insertion_Sort {

	public static void main(String[] args) {
		 int[]a= {3,4,0,5,1,2};
	      for (int i=1;i<a.length;i++) {
	    	  int temp=a[i];
	    	  int j=i;
	    	  while(j>0&&a[j-1]>temp) {
	    		  a[j]=a[j-1];
	    		  j--;
	    	  }
	    	  a[j]=temp;
	      }
	      for (int i: a) { // to print array
	    	  System.out.print(i+" ");
	      }

	}

}
