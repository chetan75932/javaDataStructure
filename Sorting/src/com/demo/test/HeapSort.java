package com.demo.test;

import java.util.Arrays;

public class HeapSort {

	public static void main(String[] args) {
		int arr[]= {25,6,5,75,18,3,93,39,75};
		System.out.println("Before Sort :");
		System.out.println(Arrays.toString(arr));
		
		heapSort(arr);
	    System.out.println("After sort :");
	    System.out.println(Arrays.toString(arr));
		

	}

	public static void heapSort(int[] arr) {
		int n=arr.length;
		for(int i=(n/2)-1;i>=0;i--) {
			heapify(arr,n,i);
		}
        for(int i=n-1;i>=0;i--) {
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			heapify(arr,i,0);
		 }
		
	}

	private static void heapify(int[] arr, int n, int i) {
		int largest=i;
		int l=2*i+1;
		int r=2*i+2;
		if(l<n && arr[l]>arr[largest]) {
			largest=l;
		}
		if(r<n && arr[r]>arr[largest]) {
			largest=r;
		}
		if(largest!=i) {
			int temp=arr[largest];
			arr[largest]=arr[i];
			arr[i]=temp;
		    heapify(arr,n,largest);
		}
		
	}

}
