package com.wrapperclassAndaccessModifiers.demo;


/* Access Modifiers:
 * 1) Public --> Access Everywhere.
 * 2) Protected --> Access outside of the package through Inheritance.
 * 3) default --> Access only within the same package.
 * 4) Private --> Access only within a class.
 * 
 */

public class DataConversionMethods {

	public static void main(String[] args) {

		// String ---> int
		
		String s1 = "10";
		String s2 = "20";
		
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
		
		// String ---> double
		
		String s3 = "2.5";
		String s4 = "3.5";
		
		System.out.println(Double.parseDouble(s3)+Double.parseDouble(s4));
		
		// String ---> boolean
		
		String s5 = "true"; // other than true if u write any string it gives false
		System.out.println(Boolean.parseBoolean(s5));
		
		
		// String--> char not possible bcz multiple char cant convert in single char
		
		// int,double,char,boolean --> String using valueOf() method
		
		int a=10;
		double d=10.5;
		char c= 'A';
		boolean bl =true;
		
		System.out.println(String.valueOf(a));
		System.out.println(String.valueOf(d));
		System.out.println(String.valueOf(c));
		System.out.println(String.valueOf(bl));
	
	}

}
