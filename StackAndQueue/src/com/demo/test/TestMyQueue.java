package com.demo.test;

import com.demo.beans.MyQueue;

public class TestMyQueue {

	public static void main(String[] args) {
		MyQueue mq=new MyQueue(10);
		mq.enqueue(10);
		mq.enqueue(20);	
		mq.enqueue(50);
		mq.enqueue(40);
		System.out.println(mq);
		mq.dequeue();
		mq.dequeue();
		System.out.println(mq);
		mq.enqueue(70);
		mq.enqueue(100);
		System.out.println(mq);
    }
	
}
	
