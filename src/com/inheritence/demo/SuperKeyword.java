package com.inheritence.demo;
/*
 * Super Keyword : use to acquired properties of parent class or
 * invoke the immidiate parent class variable or method
 */


class Animal
{
	String color ="white";
}

class Dog extends Animal
{
	String color = "black";
	
	void displaycolor()
	{
		System.out.println(super.color);
	}
}



public class SuperKeyword {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.displaycolor();
	}

}
