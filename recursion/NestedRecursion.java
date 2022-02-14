package com.brainmentors.dsa.recursion;

public class NestedRecursion {
	
	public static int func(int n)
	{
		if(n > 100)
		{
			return (n - 10);
		}
		else {
//			System.out.println(n);
			return func(func(n + 1));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(func(2));

	}

}
