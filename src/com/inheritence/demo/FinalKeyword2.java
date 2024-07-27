package com.inheritence.demo;

/* Final Keyword:
 * Method : we cannot override final method
 * Class : we cannot extends the class.
 */
class Test1
{
	final void m1()
	{
		System.out.println("This is m1 method from Test1..");
	}
	

}

class Test2 extends Test1
{
	//void m1()	// incorrect bcz m1 is final method
	{
		System.out.println("This is m1 method from Test2..");
	}

}




public class FinalKeyword2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
