package com.demo.beans;

import java.util.Arrays;

public class MyQueue {
     private int[] arr;
     private int size;
     private int front;
     private int rear;
     
     public MyQueue() {
    	 
     }
     public MyQueue(int n) {
    	 size=n;
    	 arr=new int[size];
    	 front=0;
    	 rear=-1;
     }
     public boolean isEmpty() {
    	 return front==0 && rear==-1;
     }
     public boolean isFull() {
    	 return rear==size-1;
     }
     @Override
	public String toString() {
		return "MyQueue [arr=" + Arrays.toString(arr) + ", size=" + size + ", front=" + front + ", rear=" + rear + "]";
	}
	public boolean enqueue(int num) {
    	if(isFull()) {
    		System.out.println("Queue is full.");
    		return false;
    	} else {
    		rear++;
    		arr[rear]=num;
    		return true;
    	}
     }
     public int dequeue() {
    	 if(isEmpty()) {
    		 System.out.println("Queue is empty");
    		 return -1;
    	 }
    	 else {
    		 int num=arr[front];
    		 front++;
    		 return num;
    	 }
     }
}
