package com.example;

public class User5 {
	
	
	public void printNumbers(int i , int n ){
        if(i > n ){
            return ;
        }
        printNumbers(i+1, n);
        System.out.println(i);
    }
	
	
	public static void main(String[] args) {
	    User5 m = new User5();
		m.printNumbers(0, 10);
		
	}
}

