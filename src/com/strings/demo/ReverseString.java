package com.strings.demo;

public class ReverseString {

	public static void main(String[] args) {

		/*
		String s = "welcome";
		String reverse = "" ;
		
		for(int i=s.length()-1;i>=0;i--)
		{
			reverse = reverse+s.charAt(i);
		}
		System.out.println(reverse);
	*/
		
		// Approach 2
		
		StringBuffer s = new StringBuffer("Welcome");
		System.out.println("Reverse string is :"+s.reverse());
		
		StringBuilder s1 = new StringBuilder("sagar");
		System.out.println("reverse string is :"+s1.reverse());
	}

}
