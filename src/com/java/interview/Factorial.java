package com.java.interview;

public class Factorial {
	private static void subMethod() {
		int a = 5;
		int fact = 1;
		for (int i = 1; i <=a; i++) {
			 fact = fact*i;
		}
		System.out.println("the factorial of "+a+" is :"+fact);
	}

	public static void main(String[] args) {
		subMethod();
	}
}
