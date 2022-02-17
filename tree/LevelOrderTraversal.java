package com.brainmentors.dsa.tree;

import java.util.LinkedList;
import java.util.Queue;

class LevelNode {
	int data;
	LevelNode left, right;
	
	LevelNode(int data)
	{
		this.data = data;
		this.left = this.right = null;
	}
}

public class LevelOrderTraversal {
	
	LevelNode root;
	
	void printLevelOrder()
	{
		Queue<LevelNode> queue = new LinkedList<LevelNode>();
		queue.add(root);
		
		while(!queue.isEmpty())
		{
			LevelNode tempNode = queue.poll(); // retrieve and remove 
			System.out.print(tempNode.data+" ");
			
			//enqueue left child
			if(tempNode.left != null)
			{
				queue.add(tempNode.left);
			}
			
			//enqueue right child
			if(tempNode.right != null)
			{
				queue.add(tempNode.right);
			}	
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LevelOrderTraversal tree = new LevelOrderTraversal();
		
		tree.root = new LevelNode(1);
		tree.root.left = new LevelNode(2);
		tree.root.right = new LevelNode(3);
		tree.root.left.left = new LevelNode(4);
		tree.root.left.right = new LevelNode(5);
		
		System.out.println("Level Order Traversal:");
		tree.printLevelOrder();

	}

}
