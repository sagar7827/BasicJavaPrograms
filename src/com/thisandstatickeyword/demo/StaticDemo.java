package com.thisandstatickeyword.demo;

public class StaticDemo {

	/* Static variable is create only one copy for whole program
	 * we make a variable or method static when it is same or common for all
	 * we can reduce memory using static keyword
	 * 
	 * static variable and static method we can directly call in main without creating any object.
	 * static methods can access static stuff directly ( without object)
	 * static methods can access non static stuff through the object.
	 * Non static methods can access everything directly.
	 * 
	 * when u use main method to different class then u use "classname.variable / classname.method"for 
	 * static stuff
	 * 
	 * 
	 * example :
	 * class System
	 * {
	 * 		static printstream out;
	 * }
	 * 
	 * here System.out.println();  ---> System class , out static variable , println method from printstream
	 */
	
	/* public static void main(String args[])
	 * 
	 * public --> access everywhere 
	 * static --> main method is common for every class 
	 * void --> main method will not return any value
	 * String args[] -->  parameters takes an array as a argument
	 * 
	 * 
	 */
	
	static int a=10;  // static keyword
	int b=20;   // non-static keyword
	
	static void m1()	// static method
	{
		System.out.println("This is m1 static method...");
	}
	
	void m2()	// non static method
	{
		System.out.println("This is m2 non static method...");
	}
	
	void m()  // non static method who access everything directly
	{
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}
	
	public static void main(String[] args) {

		System.out.println(a); // directly call static without creating object.
		m1();
	}

}
