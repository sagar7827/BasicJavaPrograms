package com.encapsulation.demo;

public class AccountMain {

	public static void main(String[] args) {

		Account acc = new Account();
		
		acc.setAccno(101);
		System.out.println(acc.getAccno());
		
		acc.setName("sagar");
		System.out.println(acc.getName());
		
		acc.setAmount(1000.00);
		System.out.println(acc.getAmount());
	}

}
