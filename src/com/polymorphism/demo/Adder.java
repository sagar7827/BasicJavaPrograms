package com.polymorphism.demo;

public class Adder {

	int x=10,y=20,z=30;
	
	void sum()  //1
	{
		System.out.println(x+y);
	}
	
	void sum(int x,int y)  //2
	{
		System.out.println(x+y);

	}
	
	void sum(int x,double y)  //3
	{
		System.out.println(x+y);

	}
	
	void sum(double x,int y) //4
	{
		System.out.println(x+y);

	}
	
	void sum(int x,int y,int z)   //5
	{
		System.out.println(x+y+z);

	}

}
