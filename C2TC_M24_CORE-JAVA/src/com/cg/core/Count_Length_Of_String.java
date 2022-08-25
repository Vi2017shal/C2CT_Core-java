// WAP to count length of string

package com.cg.core;

public class Count_Length_Of_String {

	public static void main(String[] args) {
		 String s="Maharashtra";
	       char[]c=s.toCharArray();
	       boolean[]b=new boolean[c.length];
	       for(int i=0;i<c.length;i++) {
	    	   if(b[i]== false) {
	    		   int count=1;
	    		   for(int j=i+1;j<b.length;j++) {
	    			   if (c[i]==c[j]) {
	    				   count++;
	    				   b[j]=true;
	    			   }
	    		   }
	    		   System.out.println(c[i]+" "+count);
	    	   }
	       }

	}

}
