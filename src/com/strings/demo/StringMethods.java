package com.strings.demo;

public class StringMethods {

	public static void main(String[] args) {

		// length of string
		
		String s = "welcome";
		System.out.println(s.length());
		
		// concat() -- joining strings
		
		String s2 = " to java";
		String s3 = " automation";
		
		System.out.println(s.concat(s2));
		System.out.println(s.concat(s2).concat(s3));
		
		// trim() --- removes spaces from right and left
		
		String s4 = "    welcome   ";
		System.out.println(s4);
		System.out.println(s4.trim());
		
		// charAt() --- returns character from string based on index
		
		System.out.println(s.charAt(3));
		
		// contains() -- returns true/false
		
		System.out.println(s.contains("wel"));
		
		// equals() equalsIgnoreCase()-- compare strings
		
		System.out.println(s.equals("Welcome"));
		System.out.println(s.equalsIgnoreCase("Welcome"));
		
		// replace() -- replace single/multiple character in the string
		
		String s5 = "welcome to java";
		System.out.println(s5.replace('a', 'p'));
		System.out.println(s5.replace("welcome", "go"));
		
		// substring() -- extract substring from main string
		
		s = "selenium";
		System.out.println(s.substring(0,5));
		
		// toUpperCase()  toLowerCase()
		
		s = "sagar";
		s2 = "SAGAR";
		
		System.out.println(s.toUpperCase());
		System.out.println(s2.toLowerCase());
		
		// split() -- split the string into multiple part based on the delimeter
		s = "abc@gmail.com";
		String a[] = s.split("@");
		System.out.println(a[0]);
		System.out.println(a[1]);
		
		
	}

}
