package com.methods.demo;

public class GreetingsMain {

	public static void main(String[] args) {

		Greetings gr = new Greetings();
		gr.m1();  //1
		
		String s = gr.m2();  //2
		System.out.println(s);
		
		gr.m3("John");  //3
		
		String value = gr.m4("David");   //4
		System.out.println(value);
	}

}
