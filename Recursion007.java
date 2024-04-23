package com.example;

public class ex4 {
	
	public static void PrintArray(int arr[]) {
		
		int n = arr.length;
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void ReverseArray(int arr[], int l, int r) {
		
		if( l > r ) {
			PrintArray(arr);
			return ;
		}	
		
		int a =0;
		a = arr[l];
		arr[l] = arr[r];
		arr[r] = a;
		
		ReverseArray(arr, l+1, r-1);
	}
	
	public  static void Swap(int i, int j) {
		// TODO Auto-generated method stub
		int a = 0;
		a = i;
		i = j;
		j = a;
	}

	
	public static void main(String[] args) {
		int arr1[] = {1,3,5,4,7,8};
		int l =0;
		int r =arr1.length;
		r = r-1;
		PrintArray(arr1);
		ReverseArray(arr1, l, r);
	}

}
