package com.methods.demo;

public class StudentMain {

	public static void main(String[] args) {

	//	Student stu = new Student();
		
		// 1} Using object reference variable
		/*
		stu.sid=101;
		stu.sname="sagar";
		stu.grade='A';
		*/
		
		// 2} using method
		
		//stu.setStudentData(101,"sagar",'A')

		// 3} uisng constructor
		
		Student stu = new Student(101,"sagar",'A');
		
		stu.printStudentData();
	}

}
