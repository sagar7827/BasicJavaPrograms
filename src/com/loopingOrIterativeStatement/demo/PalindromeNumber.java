package com.loopingOrIterativeStatement.demo;

public class PalindromeNumber {

	public static void main(String[] args) {

		int r,sum=0,temp;
		int n = 121;
		
		temp=n;
		while(n>0)
		{
			r = n%10;  // getting remainder
			sum = (sum*10)+r;
			n = n/10;
			
		}
		if(temp==sum)
		{
			System.out.println("Number is Palindrome ");
		}
		else
		{
			System.out.println("Number is not Palindrome");
		}
	}

}
