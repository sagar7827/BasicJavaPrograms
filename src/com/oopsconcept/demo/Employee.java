package com.oopsconcept.demo;

public class Employee {

	//variables
	
	int eid;
	String ename;
	String job;
	int sal;
	
	//method
	
	void display()
	{
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(job);
		System.out.println(sal);
	}
	
	
	
	public static void main(String[] args) {

		Employee e = new Employee();
		e.eid=101;
		e.ename="sagar";
		e.job="Sdet";
		e.sal=25000;
		e.display();
	}

}
