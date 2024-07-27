package com.exceptionhandling.demo;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {

		System.out.println("Program is started..");
		
		Scanner sc = new Scanner(System.in);
		
		// Example 1
		/*System.out.println("Enter a number..");
		
		int num = sc.nextInt();
		
		System.out.println(100/num);  // ArithmeticException
		*/
		
		// Example 2
		/*int a[] = new int[5];
		
		System.out.println("Enter position 0-4:");
		int pos = sc.nextInt();
		
		System.out.println("enter the value:");
		int value = sc.nextInt();
		
		a[pos]=value;
		
		System.out.println(a[pos]); // ArrayIndexOutOfBoundsException
		*/
		
		// Example 3
		
		String s = "welcome";
		
		int num = Integer.parseInt(s);
		
		System.out.println(num); // NumberFormatException
		
		System.out.println("Program is completed..");
		System.out.println("Program is Exited..");
	}

}
