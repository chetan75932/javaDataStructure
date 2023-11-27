package com.demo.test;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
     public static void main(String[] args) {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("Enter Size of array :");
    	 
    	 int n=sc.nextInt();
    	 int arr[]=new int[n];
    	 acceptArrayData(arr);
    	 System.out.println(Arrays.toString(arr));
    	 
    	// bubbleSort(arr);
    	modifiedBubbleSort(arr);
    	
     }

	private static void modifiedBubbleSort(int[] arr) {
		int n=arr.length;
		boolean flag;
		for(int i=0;i<n;i++) {
			flag=false;
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=true;
					System.out.println(Arrays.toString(arr));
				}
				
			}
			if(!flag) {
				break;
			}
			System.out.println(Arrays.toString(arr));
		}
		
	}

	private static void bubbleSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
					System.out.println(Arrays.toString(arr));
				}
				
			}
			
			
		}
	}

	private static void acceptArrayData(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            Scanner sc=new Scanner(System.in);
		    System.out.println("Enter the value :"+(i+1));
		     arr[i]=sc.nextInt();
		}
		
	}
}
