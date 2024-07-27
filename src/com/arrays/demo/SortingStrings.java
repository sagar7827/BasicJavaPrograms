package com.arrays.demo;

import java.util.Arrays;

public class SortingStrings {

	public static void main(String[] args) {
		
		char c[]= {'D','A','C','B'};
		String s[]= {"Sagar","Vishal","Atul","Anand","Yuvraj"};
		
		System.out.println("Before sorting :"+Arrays.toString(c));
		
		Arrays.sort(c);
		
		System.out.println("After sorting :"+Arrays.toString(c));
		
		System.out.println("Before sorting :"+Arrays.toString(s));
		
		Arrays.sort(s);

		System.out.println("After sorting :"+Arrays.toString(s));


	}

}
