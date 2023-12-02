package com.demo.test;

import com.demo.beans.GraphAdjencyMatrix;

public class GraphAMTest {

	public static void main(String[] args) {
		GraphAdjencyMatrix gam=new GraphAdjencyMatrix(5);
		
		gam.addEdge(1,2);
		gam.addEdge(1,3);
		
		gam.addEdge(2,4);
		gam.addEdge(2,3);
		
		gam.addEdge(3,4);
		gam.addEdge(3,5);
		
		gam.removeEdge(3, 5);
		
		gam.displayGraph();
	}

}
