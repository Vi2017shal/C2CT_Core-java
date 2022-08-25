package com.cg.core;

import java.util.Scanner;

public class Take_Input_From_The_User_In_Array {

	public static void main(String[] args) {
		  try (Scanner Sc = new Scanner(System.in)) {
				System.out.println("enter the size of element or Array");
				 int n =Sc.nextInt();
				 int a[]=new int [n];
				 for (int i=0; i<a.length;i++) {
					 System.out.println("enter the element of Array");
					 a[i]=Sc.nextInt();
				 }
				 for (int i: a) {
					 System.out.print(i+ " ");
				 }
		  }

	}

}
