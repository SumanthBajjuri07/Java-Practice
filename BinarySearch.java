package com.example;

public class a4 {
	
	
	public static int binarySearch(int[] arr, int target ) {
		int n = arr.length;
		int start = 0;
		int end = n -1;
		
		while ( end >= start ) {
			int mid = (start + end)/2;
			if( target == arr[mid] ) {
				return mid;
			}
			
			else if( target > arr[mid]) {
				start = mid +1;
			}
			else {
				end = mid -1;
			}
		}
		return -1;
	}
  
	public static void main(String[] args) {
		
		int[] arr = {1,3,5,7,9,10,14,16,18};
		int target = 7;
		
		int ans = binarySearch(arr, target);
		System.out.println(ans);
		
	}

}
