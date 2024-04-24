package com.example;

public class ex6 {
	
	public static int PrintFibonacciSeries(int n ) {
		
		if(n == 0 ) {
			return 0;
			}
		if(n == 1 ) { 
			return 1;
			}
		
		 return PrintFibonacciSeries(n-1) + PrintFibonacciSeries(n-2);
	}
	
	public static void main(String[] args) {
	
		int a = PrintFibonacciSeries(9);
		System.out.println(a);
	}

}
