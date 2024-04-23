package com.example;

public class ex3 {
	
	public static int Factorial(int n ) {
		
		if(n == 1 ) {
			return 1;
		}
		
		return n * Factorial(n-1);
	}
	
	public static void main(String[] args) {
		
		int fact = Factorial(10);
		System.out.println(fact);
	}

}
