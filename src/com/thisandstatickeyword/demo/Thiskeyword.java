package com.thisandstatickeyword.demo;

public class Thiskeyword {

	int x,y;  // class variable/instance variable
	
	Thiskeyword(int x,int y)
	{
		this.x=x;     // this keyword belongs to class or represent to class
		this.y=y;
	}
	
	void display()
	{
		System.out.println(x);
		System.out.println(y);
	}
	
	public static void main(String[] args) {
		
		Thiskeyword th = new Thiskeyword(100, 200);
		th.display();

	}

}
