package com.arrays.demo;

public class SingleDimensionalArray {

	public static void main(String[] args) {

		int a[]= {100,200,300,400,500};  // declare & add values
		int sum =0;
		// find length of an array
		System.out.println("Length of an array :"+a.length);
		
		// read single value from an array
		System.out.println(a[2]);
		
		//reading all values from an array
		for(int x:a)
		{
			System.out.println(x);
			sum = sum+x;
			
		}
		System.out.println(sum);
		
	}

}
