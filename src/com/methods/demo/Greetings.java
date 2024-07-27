package com.methods.demo;

public class Greetings {

	// 1) No Params     No return Values
	
	void m1()
	{
		System.out.println("Hello...");
	}
	
	// 2) No Params     return Values
	
	String m2()
	{
		return "Hello How Are You!";
	}
	
	// 3) Takes Params     No return Values
	
	void m3(String name)
	{
		System.out.println("Hello "+name);
	}

	// 4) Takes Params     return Values
	
	String m4(String name)
	{
		return("Hello "+name);
	}


}
