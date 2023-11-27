package com.demo.test;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[]= {25,36,365,9,5,87,45};
		System.out.println(Arrays.toString(arr));
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void selectionSort(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			int min_index=i;
			for(int j=i;j<n;j++) {
				    if(arr[j]>arr[min_index]) {
					   min_index=j;
					   System.out.println(Arrays.toString(arr)); 
				}
			}
			int temp=arr[i];
			arr[i]=arr[min_index];
			arr[min_index]=temp;
		}
	}

}
