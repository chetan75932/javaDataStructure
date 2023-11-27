package com.demo.test;

import java.util.Scanner;

public class LinearSearch {
	public static void acceptArrayData(int[] arr){
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter values "+(i+1));
			arr[i]=sc.nextInt();
		}
	}	
	public static int linearSearch(int[] arr,int search){
		for(int i=1;i<arr.length;i++) {
			if(arr[i]==search)
				return i;
		}
		return -1;
	 
	}
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter size of array :");
    	int n=sc.nextInt();
    	int[] arr=new int[n];
    	acceptArrayData(arr);
    	System.out.println("enter number for Search :");
    	int search=sc.nextInt();
    	int pos=linearSearch(arr,search);
    	if(pos!=-1)
    		System.out.println("Search Element is found at :"+pos);
    	else
    		System.out.println("Search is not found !");
    }
}
