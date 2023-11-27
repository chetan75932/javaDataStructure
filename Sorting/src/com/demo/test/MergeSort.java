package com.demo.test;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
    	int[] arr= {75,5,64,21,58,78,1};    
    	System.out.println("Before Sorting :");
    	System.out.println(Arrays.toString(arr));
    	
    	mergeSort(arr,0,arr.length-1);
    	System.out.println("After Sorting :");
    	System.out.println(Arrays.toString(arr));
    }
    
    public static void mergeSort(int[] arr,int start,int end) {
    	if(start<end) {
    		int mid=(start+end)/2;
    		mergeSort(arr,start,mid);
    		mergeSort(arr,mid+1,end);
    		merge(arr,start,end,mid);
    	}
    }
    
    public static void merge(int[] arr,int start,int end,int mid) {
    	int i,j,k;
    	int n1=mid-start+1;
    	int n2=end-mid;
    	
    	int leftarr[]=new int[n1];
    	int rightarr[]=new int[n2];
    	
    	for(i=0;i<n1;i++) {
    		leftarr[i]=arr[start+i];
    	}
    	
    	for(j=0;j<n2;j++) {
    		rightarr[j]=arr[mid+1+j];
    	}
    	i=0;
    	j=0;
    	k=start;
    	
    	while(i<n1 && j<n2) {
    		if(leftarr[i]<rightarr[j]) {
    			arr[k]=leftarr[i];
    			i++;k++;
    		}
    		else {
    			arr[k]=rightarr[j];
    			j++;k++;
    		}
    	}
    	while(i<n1) {
    		arr[k]=leftarr[i];
    		i++;k++;
    	}
    	while(j<n2) {
    		arr[k]=rightarr[j];
    		j++;k++;
    	}
    	
    	System.out.println(Arrays.toString(arr));
    }
}
