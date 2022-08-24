package com.cg.core;
import java.util.Scanner;
public class Rectangle_Area {

	public static void main(String[] args) {
		
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter The Length");
     double length= sc.nextDouble();
     System.out.println("Enter The Width");
     double width = sc.nextDouble();
     
     double area = length*width;
     System.out.println("Area of Rectangle="+area);
     
	}

}
