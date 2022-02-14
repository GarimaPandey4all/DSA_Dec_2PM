package com.brainmentors.dsa.recursion;

public class FactorialUsingRecursion {
	
	public static int factorial(int n)
	{
		if(n == 0)
		{
			return 1;
		}
		
		return n * factorial(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 5;
		
		System.out.println("Factorial is: "+factorial(num));

	}

}
