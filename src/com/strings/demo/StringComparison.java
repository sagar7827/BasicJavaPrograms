package com.strings.demo;

public class StringComparison {

	public static void main(String[] args) {

		//case1
		
		String s1 = "welcome";
		String s2 = "welcome";
		
		System.out.println(s1==s2);  //true
		System.out.println(s1.equals(s2));  //true
		
		//case2
		
		String s3 = new String("welcome");
		String s4 = new String("welcome");
		
		System.out.println(s3==s4);  // false   // compare the objects
		System.out.println(s3.equals(s4));  //true  // compare the values of objects
	}

}
