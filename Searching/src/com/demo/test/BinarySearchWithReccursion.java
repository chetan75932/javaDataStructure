package com.demo.test;

import java.util.Scanner;

public class BinarySearchWithReccursion {
	
     public static int binarySearch(int[] arr,int search,int first,int last) {
    	 if(first>last) {
    		 return -1;
    	 }
    	 int mid=(first+last)/2;
    	 if(arr[mid]==search) {
    		 return mid;
    	 }
    	 else if(arr[mid]<search) {
    		 return binarySearch(arr,search,mid+1,last);
    	 }
    	 else {
    		 return binarySearch(arr,search,first,mid-1);
    	 }
    	 
     } 
      public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the size of aaray :");
    	  int n=sc.nextInt();
    	  int[] arr=new int[n];
    	  
    	  for(int i=0;i<arr.length;i++) {
    		  System.out.println("Enter the values of array :"+(i+1));
    		  arr[i]=sc.nextInt();
    	  }
    	  
    	  int first=0,last=arr.length-1;
    	  System.out.println("Enter number for serching :");
    	  int search=sc.nextInt();
    	  int pos=binarySearch(arr,search,first,last);
    	  if(pos!=-1)
    		  System.out.println("Search Number is found at position :"+pos);
    	  else
    		  System.out.println("Search Number is not found !");
      } 
}
