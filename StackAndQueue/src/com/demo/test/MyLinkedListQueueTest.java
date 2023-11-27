package com.demo.test;

import com.demo.beans.MyLinkedLIstQueue;

public class MyLinkedListQueueTest {

	public static void main(String[] args) {
		MyLinkedLIstQueue lq=new MyLinkedLIstQueue();
		
		lq.enqueue(64);
		lq.enqueue(63);
		lq.enqueue(2);
		lq.enqueue(34);
		lq.enqueue(24);
		lq.displayQeue();
		lq.dequeue();
		lq.displayQeue();
	}

}
