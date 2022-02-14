package com.brainmentors.dsa.recursion;

public class StackBuilding {
	
	// stack building is used to print the sequence in reverse order.
	
	public static void stackBuilding(int n)
	{
		if(n == 0)
		{
			return;
		}
		
		System.out.print(n+" ");
		stackBuilding(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		stackBuilding(5);

	}

}
