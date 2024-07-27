package com.exceptionhandling.demo;

public class FinallyBlock {

	public static void main(String[] args) {

		System.out.println("Program is started..");

		String s = null;

		//int num = Integer.parseInt(s);
		
		try
		{
		System.out.println(s.length()); // NumberFormatException
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally {
			
			System.out.println("You entered into finally block..");
		}
	}

}
