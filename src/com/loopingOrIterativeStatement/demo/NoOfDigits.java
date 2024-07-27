package com.loopingOrIterativeStatement.demo;

public class NoOfDigits {

	public static void main(String[] args) {

		int count =0;
		int n =124356;
		
		while(n!=0)
		{
			n/=10;
			++count;
		}
		System.out.println("No of Digits :"+count);
	}

}
