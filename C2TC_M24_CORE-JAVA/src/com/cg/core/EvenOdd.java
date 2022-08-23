package com.cg.core;
import java.util.Scanner;

public class EvenOdd {
	
	public static void main(String[] args) {
		
    System.out.println("Enter any Number");
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    sc.close();

    if (a%2==0)
    {
	System.out.println("Enter Number is an Even Number...");
    }
    else
    {
	System.out.println("Enter Number is an Odd Number...");
    }

  }

}
