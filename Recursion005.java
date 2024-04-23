package com.example;

public class ex2 {
	
	public static int sumOfNum(int n) {
		
		if(n ==0 ) {
			return 0;
		}
		return n + sumOfNum(n-1);
	}
	public static void main(String[] args) {
		
		int sum = sumOfNum(10);
		System.out.println(sum);
	}

}
