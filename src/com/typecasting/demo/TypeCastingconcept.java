package com.typecasting.demo;

public class TypeCastingconcept {

	/* UpCasting ---> smaller -- larger
	 * 
	 * int --> long
	 * float --> double
	 * 
	 * DownCasting ---> larger -- smaller
	 * 
	 * long --> int
	 * double --> float
	*/
	
	
	
	public static void main(String[] args) {

		// upCasting -- automatic process
		
		int intvalue =100;
		long longvalue = intvalue;
		
		System.out.println(longvalue);
		
		//DownCasting --- manually
		
		long longvalue1 = 10000;
		int intvalue1 = (int) longvalue;
		
		System.out.println(intvalue1);
	}

}
