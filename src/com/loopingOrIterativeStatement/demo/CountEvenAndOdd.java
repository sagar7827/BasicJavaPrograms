package com.loopingOrIterativeStatement.demo;

public class CountEvenAndOdd {

	public static void main(String[] args) {

		int n, count1=0, count2=0;
		
		for(n=1;n<=15;n++)
		{
			if(n%2!=0)
			{
				count1++;
			}else
			{
				count2++;
			}
		}
		System.out.println("Even nos:"+count1);
		System.out.println("Odd nos :"+count2);

	}

}
