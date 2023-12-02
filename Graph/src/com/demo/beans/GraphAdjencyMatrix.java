package com.demo.beans;

public class GraphAdjencyMatrix {
	
	boolean[][] adj_mat;
	int vertices;
	
	public GraphAdjencyMatrix(int vertices)
	{
		this.vertices=vertices;
		adj_mat=new boolean[vertices+1][vertices+1];
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
	
	public void displayGraph()
	{
		for(int i=0;i<adj_mat.length;i++)
		{
			for(int j=0;j<adj_mat[i].length;j++)
			{
				System.out.print(adj_mat[i][j]+"   ");
			}
			
			System.out.println();
		}
	}

}
