package com.brainmentors.dsa.tree;

import java.util.ArrayList;
import java.util.Scanner;

class Node {
	int data;
	ArrayList<Node> children;
	
	Node(int data)
	{
		this.data = data;
		children = new ArrayList<>();
	}
}

public class GenericTree {
	
	Scanner sc = new Scanner(System.in);
	
	public Node addSubTree()
	{
		System.out.println("Enter the data of a Node:");
		int data = sc.nextInt();
		
		Node parentNode = new Node(data);
		
		System.out.println("Enter the number of children of "+data);
		int children = sc.nextInt();
		
		for(int i = 1; i <= children; i++)
		{
			Node child = addSubTree();
			parentNode.children.add(child); // d.i
		}
		
		return parentNode;
	}
	
	public void print(Node root)
	{
		System.out.print(root.data+"=>");
		
		System.out.println();
		
		for(Node child: root.children)
		{
			print(child);
		}
	}
	
	public int height(Node root)
	{
		if(root == null)
		{
			return 0;
		}
		
		//reach to the leaf so return 1
		if(root.children.size() == 0)
		{
			return 1;
		}
		
		int maxDepth = 0;
		
		for(Node child : root.children)
		{
			int currentHeight = height(child);
			maxDepth = Math.max(maxDepth, currentHeight);
		}
		
		return maxDepth + 1;
	}
	
	//count number of leaf nodes
	public int countLeaf(Node root)
	{
		int leafCount = 0;
		
		if(root == null)
		{
			return 0;
		}
		if(root.children.size() == 0)
		{
			return 1;
		}
		for(Node child : root.children)
		{
			int leafValue = countLeaf(child);
			leafCount = leafCount + leafValue;
		}
		
		return leafCount;
	}
	
	//Find the largest node in a tree
	public int max(Node root)
	{
		if(root == null)
		{
			return 0;
		}
		
		int result = root.data;
		
		for(Node child : root.children)
		{
			int currentChildValue = max(child);
			
			if(currentChildValue > result)
			{
				result = currentChildValue;
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenericTree obj = new GenericTree();
		
		Node root = obj.addSubTree();
		
		obj.print(root);
		
		System.out.println("Height of a Tree: "+obj.height(root));
		System.out.println("Total Leaf Nodes: "+obj.countLeaf(root));
		System.out.println("Maximum Node Value: "+obj.max(root));
	
	}

}
