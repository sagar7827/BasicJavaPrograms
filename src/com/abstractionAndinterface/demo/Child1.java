package com.abstractionAndinterface.demo;

public class Child1 extends Child2 implements Interface1,Interface2 {

	public void m1()
	{
		System.out.println(x);
	}
	
	public void m2()
	{
		System.out.println(y);
	}
	
	public static void main(String[] args) {

		Child1 c1 = new Child1();
		c1.m1();
		c1.m2();
		c1.m3();
	}

}
