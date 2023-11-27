package com.demo.test;

import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] arr,int search) {
    	int first=0;
    	int last=arr.length-1;
    	
    	while(first<=last) {
    	 int mid=(first+last)/2;
         if(arr[mid]==search) {
    		return mid;
    	  } 
    	  else if(arr[mid]<search) {
    		first=mid+1;
    	  }
    	  else {
    		last=mid-1;
    	  }
    	}
    	return -1;
    }
	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter size of arr :");
     int n=sc.nextInt();
     int[] arr=new int[n];
     for(int i=0;i<arr.length;i++) {
    	 System.out.println("Enter the values :"+(i+1));
    	 arr[i]=sc.nextInt();
     }
     System.out.println("Enter the number for searching :");
     int search=sc.nextInt();
     int pos=binarySearch(arr,search);
     
     if(pos!=-1) {
    	 System.out.println("Search number is found at position :"+pos);

     }
     else
    	 System.out.println("Search number is not found!!");
  }

}
