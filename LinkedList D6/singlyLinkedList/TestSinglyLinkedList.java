package com.demo.test;

import com.demo.beans.SinglyLinkedList;

public class TestSinglyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SinglyLinkedList sl = new SinglyLinkedList();
		sl.addAtStart(25); //5
		sl.addAtStart(12); //3
		sl.addAtStart(10); //1
		sl.addAtStart(100);//0
		//sl.addAtStart(8);
		//sl.display();
		sl.addAtPosition(24, 2);//2
		sl.addAtPosition(26, 4);//4
		sl.deleteAtFirst();
		sl.addAtEnd(12);
		sl.addAtEnd(13);
		//sl.addAtEnd(14);
		sl.deleteAtEnd();
		sl.display();
		
	}

}
