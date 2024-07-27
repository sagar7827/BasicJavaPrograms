package com.exceptionhandling.demo;

import java.util.Scanner;

public class HandlingException {

	public static void main(String[] args) {

		System.out.println("Program is started..");
		
		Scanner sc = new Scanner(System.in);
		
		// Example 1
		System.out.println("Enter a number..");
		
		int num = sc.nextInt();
		try
		{
		System.out.println(100/num);  // ArithmeticException
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Program is completed..");
		System.out.println("Program is Exited..");
		

	}

}
