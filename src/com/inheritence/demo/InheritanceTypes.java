package com.inheritence.demo;

class A
{
	int a=100;
	
	void display()
	{
		System.out.println(a);
	}
}

class B extends A
{
	int b=200;
	
	void show()
	{
		System.out.println(b);
	}
}

class C extends B
{
	int c=300;
	
	void print()
	{
		System.out.println(c);
	}
}

public class InheritanceTypes {

	
	public static void main(String[] args) {

		C cobj = new C();
		System.out.println(cobj.a);
		System.out.println(cobj.b);
		System.out.println(cobj.c);
		cobj.show();
		cobj.display();
		cobj.print();
		
	}

}
