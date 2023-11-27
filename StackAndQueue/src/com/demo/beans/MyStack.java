package com.demo.beans;

import java.util.Arrays;

public class MyStack {
     private int[] arr;
     private int size;
     private int top;
     
     public MyStack() {
    	 //default 
     }
     public MyStack(int n) {
    	 size=3;
    	 arr=new int[n];
    	 top=-1;
     }
     @Override
	public String toString() {
		return "MyStack [arr=" + Arrays.toString(arr) ;
	}
	public boolean isEmpty() {
    	/* if(top==-1) {
    		 return true;
    	 }
    	 else {
    		 return false;
    	 }*/
    	 return top==-1;
    		 
     }
     public boolean isFull() {
    	// return top==size-1;
    	 
    	  if(top==size-1){
    	     return true;
    	   }
    	   else{
    	   return false;
    	   }
     }
     public boolean push(int n) {
    	 if(isFull()) {
    		 System.out.println("Stack is overFlow");
    		 return false;
    	 }
    	 else {
    		 top++;
    		 arr[top]=n;
    		 return true;
    	 }
     }
     public int pop() {
    	 if(isEmpty()) {
    		 System.out.println("Stack is UnderFlow");
    		 return -1;
    	 }
    	 else {
    		 int num=arr[top];
    		 top--;
    		 return num;
    	 }
     }
}
