package com.example;

import java.util.Arrays;

public class a6 {
	public static void main(String[] args) {
		
		int[] arr= {4,1,5,2,3};
		cyclicSort(arr);
	}
	
	
	public static void cyclicSort(int[] arr) {
		int n = arr.length;
		int i =0;
		while(i < n) {
			if(arr[i] != i+1) {
				int swap1 = arr[i];
				int swap2 = arr[arr[i]-1];
				arr[swap1-1] = swap1;
				arr[i] = swap2;
				continue;
			}
			else {
				i= i+1;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
