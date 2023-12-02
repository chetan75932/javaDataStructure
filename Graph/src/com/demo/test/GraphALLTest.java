package com.demo.test;

import com.demo.beans.GraphAdjencyLinkedList;

public class GraphALLTest {

	public static void main(String[] args) {
		
		GraphAdjencyLinkedList gam=new GraphAdjencyLinkedList(6);
		gam.addEdge(1,2);
		gam.addEdge(1,3);
		gam.addEdge(2,1);
		gam.addEdge(3,1);
		gam.addEdge(2,4);
		gam.addEdge(2,3);
		gam.addEdge(4,2);
		gam.addEdge(3,2);
		gam.addEdge(3,4);
		gam.addEdge(3,5);
		gam.addEdge(4,3);
		gam.addEdge(5,3);
		
		
	    gam.displayLL();
		

	}

}
