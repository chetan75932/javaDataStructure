package com.demo.test;

import com.demo.beans.DoubleLinkedList;

public class DoubleLinkedListTest {
      public static void main(String[] args)
      {
    	  DoubleLinkedList dll=new DoubleLinkedList();
    	  
    	  dll.addAtFirstPosition(2);//4
    	  dll.addAtFirstPosition(6);//3
    	  dll.addAtFirstPosition(10);//1
    	  dll.addAtEnd(4);//5
    	  dll.addAtPosition(5,2);//2
    	  dll.displayLinkedList();
    	  
    	  dll.dltAtPosition(4);
    	  dll.dltAtPosition(7);
    	  dll.displayLinkedList();
    	  
      }
}
