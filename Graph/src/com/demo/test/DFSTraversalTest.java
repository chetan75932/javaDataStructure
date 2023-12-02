package com.demo.test;

import com.demo.beans.DFS;

public class DFSTraversalTest {
  public static void main(String[] args)
  {
	  DFS ob=new DFS(5);
		ob.addEdge(0, 1);
		ob.addEdge(0,2);
		ob.addEdge(1, 3);
		ob.addEdge(2,3);
		ob.addEdge(2, 4);
		System.out.println(ob);
      ob.dfsTraversal(0);
  }
}
