package com.arrays.demo;

import java.util.Iterator;

public class TwoDimensionalArray {

	public static void main(String[] args) {

		int a[][]= {
						{100,200},
						{300,400},
						{500,600}
					};
		System.out.println("Length of rows:"+a.length);
		System.out.println("Length of columns:"+a[0].length); 
		
		//Approach 1
		
		/*
		 * for(int row =0;row<a.length;row++) { for(int c=0;c<a[row].length;c++) {
		 * System.out.print(a[row][c]+" "); } System.out.println(); }
		 */
		
		for(int arr[]:a)
		{
			for(int x:arr)
			{
				System.out.print(x+" ");
			}
			System.out.println();
		}
	}

}
