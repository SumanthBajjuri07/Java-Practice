package com.example;

import java.util.Arrays;

public class a5 {
	
	public static void bubbleSort(int[] arr) {
		
		int n = arr.length;
		
		for(int i =0; i<n; i++) {
			
			for(int j =1; j<n-i; j++) {
				
				if(arr[j-1] > arr[j] ) {
					
					int swap =  arr[j-1];
					arr[j-1] = arr[j];
					arr[j] =  swap;
					
				}
			}
			
		}
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1,3,2,5,7,9,4};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
  }

}
