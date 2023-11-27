package com.demo.test;

import java.util.Arrays;

public class Merge {

	public static void merge(int[] arr1,int[] arr2,int[] arr3) {
		int i=0,j=0,k=0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				arr3[k]=arr1[i];
				i++;k++;
			}
			else {
				arr3[k]=arr2[j];
				j++;k++;
			}
		}
		while(i<arr1.length) {
			arr3[k]=arr1[i];
			i++;k++;
		}
		while(j<arr2.length) {
			arr3[k]=arr2[j];
			j++;k++;
		}
	}
	
	public static void main(String[] args) {
		int arr1[]= {25,65,89,125,245,247,315,336,414,454};
		int arr2[]= {9,23,25,47,123,224,468,535,557};
		int arr3[]= new int[arr1.length+arr2.length];
		System.out.println("Before merge :");
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		
		merge(arr1,arr2,arr3);
		System.out.println("After merge :");
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		
		
	}
	

}
