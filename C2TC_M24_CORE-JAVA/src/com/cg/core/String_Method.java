/* string method 
 * indexof()
 * startsWith()
 * endsWith()
 * isEmpty()
 * 
*/

package com.cg.core;

public class String_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s="Vishal ";
		    System.out.println(s.indexOf('s'));
		    System.out.println(s.startsWith("Vi"));
		    System.out.println(s.endsWith("sha"));
		    System.out.println(s.isEmpty());
		    s=s.replace("shal", "aart");
		    System.out.println(s);
		    System.out.println(s.lastIndexOf('t'));
		    s=s.replace('i', 'o');
		    System.out.println(s);
	}
	

}
