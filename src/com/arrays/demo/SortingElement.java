package com.arrays.demo;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortingElement {

	public static void main(String[] args) {

		int a[] = {5,2,1,4,3};
		
		System.out.println("Before Sorting...");
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);   // sort elements
		
		System.out.println("After Sorting...");
		System.out.println(Arrays.toString(a));
		
		
	}

}
