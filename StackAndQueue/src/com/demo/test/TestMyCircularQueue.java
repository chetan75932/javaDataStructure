package com.demo.test;

import com.demo.beans.MyCircularQueue;

public class TestMyCircularQueue {

	public static void main(String[] args) {
		MyCircularQueue mq=new MyCircularQueue(10);
		mq.enqueue(10);
		mq.enqueue(20);	
		mq.enqueue(50);
		mq.enqueue(40);
		mq.enqueue(10);
		mq.enqueue(20);	
		mq.enqueue(50);
		mq.enqueue(40);
		mq.enqueue(70);
		mq.enqueue(900);
		mq.enqueue(170);
		mq.enqueue(190);
		mq.enqueue(650);
		mq.enqueue(210);
		mq.enqueue(110);

		System.out.println(mq);
		mq.dequeue();
	    mq.dequeue();
		System.out.println(mq);
		mq.enqueue(1210);
		mq.enqueue(5650);
		System.out.println(mq);
		mq.enqueue(5650977);
		System.out.println(mq);
		
		/*MyCircularQueue mq=new MyCircularQueue(10);
		mq.enqueue(10);
		mq.enqueue(20);	
		mq.enqueue(50);
		mq.enqueue(40);
		System.out.println(mq);
		mq.dequeue();
	    mq.dequeue();
	    mq.dequeue();
	    mq.dequeue(); 
	    mq.dequeue();
		System.out.println(mq);
		mq.enqueue(40);
		System.out.println(mq);*/

	
	
	}
}
