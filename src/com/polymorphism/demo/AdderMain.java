package com.polymorphism.demo;

public class AdderMain {

	public static void main(String[] args) {

		Adder ad = new Adder();
		ad.sum(); //1
		ad.sum(10, 30);  //2
		ad.sum(20,30.5);  //3
		ad.sum(60.5, 20);  //4
		ad.sum(2,3,4);   //5
	}

}
