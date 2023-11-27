package com.demo.test;

import java.util.Arrays;

public class InsersionSort {
  public static void main(String[] args) {
	  int arr[]= {36,698,45,25,369,47,89,8,7};
	  System.out.println("Before sort :");
	  System.out.println(Arrays.toString(arr));
	  
	  insertionSort(arr);
	  System.out.println("After sort :");
	  System.out.println(Arrays.toString(arr));
  }

private static void insertionSort(int[] arr) {
	int n=arr.length;
	for(int i=1;i<n;i++) {
		int key=arr[i];
		int j=i-1;
		for(;j>=0 && arr[j]>key;j--) {
			arr[j+1]=arr[j];
		}
		arr[j+1]=key;
		System.out.println(Arrays.toString(arr));
	}
	
}
}
