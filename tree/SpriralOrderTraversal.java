package com.brainmentors.dsa.tree;

class SNode {
	int data;
	SNode left, right;
	
	SNode(int data)
	{
		this.data = data;
		left = right = null;
	}
}

public class SpriralOrderTraversal {
	
	SNode root;
	
	int height(SNode node)
	{
		if(node == null)
		{
			return 0;
		}
		else {
			int lheight = height(node.left);
			int rheight = height(node.right);
			
			if(lheight > rheight)
			{
				return (lheight + 1);
			}
			else {
				return (rheight + 1);
			}
		}
	}
	
	void printGivenLevel(SNode node, int level, boolean ltr)
	{
		if(node == null)
		{
			return;
		}
		if(level == 1)
		{
			System.out.print(node.data+" ");
		}
		else if(level > 1)
		{
			if(ltr != false) // left to right traverse
			{ 
				printGivenLevel(node.left, level - 1, ltr);
				printGivenLevel(node.right, level - 1, ltr);
			}
			else { // right to left traverse
				printGivenLevel(node.right, level - 1, ltr);
				printGivenLevel(node.left, level - 1, ltr);
			}
		}
	}
	
	void getSpriral(SNode node)
	{
		int h = height(node);
		
		boolean ltr = false;
		
		for(int i = 1; i <= h; i++)
		{
			printGivenLevel(node, i, ltr);
			
			//now need to traverse the tree in opposite order
			ltr = !ltr;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SpriralOrderTraversal tree = new SpriralOrderTraversal();
		
		tree.root = new SNode(1);
		tree.root.left = new SNode(2);
		tree.root.right = new SNode(3);
		tree.root.left.left = new SNode(4);
		tree.root.left.right = new SNode(5);
		
		System.out.println("Spiral Order Tree: ");
		tree.getSpriral(tree.root);
	}
}
