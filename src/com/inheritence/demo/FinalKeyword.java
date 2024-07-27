package com.inheritence.demo;

class Test
{
	final int x=100;
}


public class FinalKeyword {

	/* Final Keyword:
	 * Variable : we cannot change the value of variable.
	 * 
	 */
		
	public static void main(String[] args) {

		Test t = new Test();
		//t.x=200;   // invalid
		System.out.println(t.x);
	}

}
