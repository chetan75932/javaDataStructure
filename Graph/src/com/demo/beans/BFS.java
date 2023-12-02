package com.demo.beans;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
	
	boolean[][] adj_mat;
	int vertices;
	
	public BFS(int vertices)
	{
		this.vertices=vertices;
		adj_mat=new boolean[vertices][vertices];
	}
	
	public void addEdge(int i,int j)
	{
		adj_mat[i][j]=true;
		adj_mat[j][i]=true;
	}
	
	
	public void removeEdge(int i,int j)
	{
		adj_mat[i][j]=false;
		adj_mat[j][i]=false;
	}
	
	public void BFSTraversal(int n,int start)
	{
		boolean[] visited=new boolean[this.vertices];
		System.out.println(visited.length);
		Queue<Integer> q=new LinkedList<>();
		visited[start]=true;
		q.add(start);
		
		while(q.size()>0)
		{
			int next=q.poll();
			System.out.print(next+",");
			System.out.println(adj_mat.length);
			System.out.println(adj_mat[next].length);
			for(int i=1;i<adj_mat[next].length;i++)
			{
				if(adj_mat[next][i])
				{
					if(!visited[i])
					{
						q.add(i);
						
					}
				   visited[i]=true;
				}
			}
		}
 	}
	
	/*public void displayGraph()
	{
		for(int i=0;i<adj_mat.length;i++)
		{
			for(int j=0;j<adj_mat[i].length;j++)
			{
				System.out.print(adj_mat[i][j]+"   ");
			}
			
			System.out.println();
		}
	}*/

}
