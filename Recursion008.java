package com.example;

public class ex5 {
	
	public static boolean CheckPalindrome(String str,int i, int n ) {
		if(i >= n/2) {
			return true;
		}
		
		if(str.charAt(i) != str.charAt(n-i-1)) {
			return false;
		}
		
		return true | CheckPalindrome(str, i+1, n );
		
	}
	
	public static void main(String[] args) {
		
		String str1 = "madam";
		int n = str1.length();
		int i =0;
		boolean bool = CheckPalindrome(str1, i, n );
		System.out.println(bool);
		
	}

}
