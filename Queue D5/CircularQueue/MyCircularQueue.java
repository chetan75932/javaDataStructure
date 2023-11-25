package com.demo.beans;

import java.util.Arrays;

public class MyCircularQueue {
     private int[] arr;
     private int size;
     private int front;
     private int rear;
     
     public MyCircularQueue() {
    	 
     }
     public MyCircularQueue(int n) {
    	 size=n;
    	 arr=new int[size];
    	 front=-1;
    	 rear=-1;
     }
     public boolean isEmpty() {
    	 return front==rear;
     }
     public boolean isFull() {
    	 return (front==0 && rear==size-1) || (rear+1)%size==front;
     }
     @Override
	public String toString() {
		return "MyCircularQueue [arr=" + Arrays.toString(arr) + ", size=" + size + ", front=" + front + ", rear=" + rear + "]";
	}
	public boolean enqueue(int num) {
    	if(isFull()) {
    		System.out.println("Queue is full.");
    		return false;
    	}else {
    		if(front==-1) {
        		front=0;
    		}
    		rear=(rear+1)%size;
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
    		 int temp=arr[front];
    		 
    		 front=(front+1)%size;
    		 
    		 
    		 if(front==size-1)
    			 front=0;
    		 
    		 return temp;
    	 }
     }
}


	
