package com.brainmentors.dsa.recursion;

public class StackFalling {
	
	// stack building is used to print the sequence in normal order.
	
	public static void stackFalling(int n)
	{
		if(n == 0)
		{
			return;
		}
		
		stackFalling(n-1);
		System.out.print(n+" ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		stackFalling(5);

	}

}
