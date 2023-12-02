package com.demo.test;

import com.demo.beans.BFS;

public class BFSTraversal {

	public static void main(String[] args) {


        BFS bfs=new BFS(6);
		
		bfs.addEdge(1,2);
		bfs.addEdge(1,3);
		
		bfs.addEdge(2,4);
		bfs.addEdge(2,3);
		
		bfs.addEdge(3,4);
		bfs.addEdge(3,5);
		
		bfs.removeEdge(3, 5);
		
		bfs.BFSTraversal(5, 1);

	}

}
