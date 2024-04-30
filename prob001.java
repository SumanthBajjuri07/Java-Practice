// number of even digits numbers problem
// leetcode - 1295





package com.example;

public class a2 {
	
	public static int numberOfDigits(int num) {
		int count =0;
		
		while(num > 0) {
			count++;
			num = num / 10;
		}
		
		return count;
	}
	
	
	public static int evenOrOdd(int count) {
		if(count % 2 == 0 ) {
			return 1;
		}
		else 
			return 0;
	}
	
	public static void main(String[] args) {
		
	 int num = 1423;
	 
	 int count = numberOfDigits(num);
	 System.out.println(count);
	 int ans = evenOrOdd(count);
	 System.out.println(ans);
	 
	}

}
