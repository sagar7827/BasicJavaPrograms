package com.methods.demo;

public class Student {

	int sid;
	String sname;
	char grade;
	
	void printStudentData()
	{
		System.out.println(sid+" "+sname+" "+grade);
	}
	
	void setStudentData(int id,String name,char gr)
	{
		sid=id;
		sname=name;
		grade=gr;
	}
	
	/* Constructor is only use for initialization of variables nothing else
	 * constructor name is same as class name.
	 * constructor cannot return any value
	 * we can create default and parameterized constructor.
	 * but we cannot write any logic in that we can only initialize or assign variable.
	 * 
	 */
	
	Student(int id,String name,char gr)
	{
		sid=id;
		sname=name;
		grade=gr;
	}
}
