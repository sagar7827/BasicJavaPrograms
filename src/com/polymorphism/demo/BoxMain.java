package com.polymorphism.demo;

public class BoxMain {

	public static void main(String[] args) {

		Box bx = new Box();  //1
		System.out.println(bx.volume());
		
		Box bx1 = new Box(2.5,3.0,4.5);  //2
		System.out.println(bx1.volume());
		
		Box bx2 = new Box(3.5);  //3
		System.out.println(bx2.volume());
	}

}
