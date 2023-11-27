package com.demo.test;

import java.util.Arrays;

public class QuikSort {
      public static void main(String[] args) {
    	  int[] arr= {33,93,34,64,23,55,93};
    	  System.out.println("Before Sort :");
    	  System.out.println(Arrays.toString(arr));
    	  
    	  quikSort(arr,0,arr.length-1);
    	  System.out.println("After Sort :");
    	  System.out.println(Arrays.toString(arr));
      }
      
      public static void quikSort(int[] arr,int start,int end) {
    	  if(start<end) {
    	  int p=partition(arr,start,end);
    	  quikSort(arr,start,p-1);
    	  quikSort(arr,p+1,end);
    	  
    	  }
      }
      public static int  partition(int[] arr,int first,int last) {
    	  int pivot=first;
    	  int i=first;
    	  int j=last;
    	  while(i<j) {
    		  while(i<last && arr[i]<=arr[pivot]) {
    			  i++;
    		  }
    		  while(j>pivot && arr[j]>arr[pivot]) {
    			  j--;
    		  }
    		  if(i<j) {
    			  int temp=arr[i];
    			  arr[i]=arr[j];
    			  arr[j]=temp;
    		  }
    	  }
    	  int temp=arr[j];
    	  arr[j]=arr[pivot];
    	  arr[pivot]=temp;
    	  return j;
      }
      
}
