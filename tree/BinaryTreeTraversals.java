package com.brainmentors.dsa.tree;

class TreeNode
{
	int data;
	TreeNode left, right;
	
	TreeNode(int data)
	{
		this.data = data;
		left = right = null;
	}
}

public class BinaryTreeTraversals {
	
	TreeNode root;
	
	BinaryTreeTraversals()
	{
		root = null;
	}
	
	void printInorder(TreeNode node) // left ---> root --> right
	{
		if(node == null)
		{
			return ;
		}
		
		printInorder(node.left);
		System.out.print(node.data+" ");
		printInorder(node.right);
	}
	
	void printPreorder(TreeNode node) // root ---> left --> right
	{
		if(node == null)
		{
			return ;
		}
		
		System.out.print(node.data+" ");
		printPreorder(node.left);
		printPreorder(node.right);
	}
	
	void printPostorder(TreeNode node) // left ---> right --> root
	{
		if(node == null)
		{
			return ;
		}
		
		printPostorder(node.left);
		printPostorder(node.right);
		System.out.print(node.data+" ");
	}
	
	void printInorder()
	{
		printInorder(root);
	}
	
	void printPreorder()
	{
		printPreorder(root);
	}
	
	void printPostorder()
	{
		printPostorder(root);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeTraversals tree = new BinaryTreeTraversals();
		
		tree.root = new TreeNode(1);
		tree.root.left = new TreeNode(2);
		tree.root.right = new TreeNode(3);
		tree.root.left.left = new TreeNode(4);
		tree.root.left.right = new TreeNode(5);
		
		System.out.println("Inorder Traversal:");
		tree.printInorder();
		
		System.out.println("\nPreorder Traversal:");
		tree.printPreorder();
		
		System.out.println("\nPostorder Traversal:");
		tree.printPostorder();
	}

}
