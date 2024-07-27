package com.arrays.demo;

public class NoOfRepetation {

	public static void main(String[] args) {
		
		int a[] = {100,200,100,300,100,400,100};
		int number = 100;
		int count=0;
		
		for(int x:a)
		{
			if(x==number)
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
