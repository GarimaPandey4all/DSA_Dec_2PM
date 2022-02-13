package com.brainmentors.dsa.recursion;

public class Recursion1 {
	
	public static int func(int n)
	{
		//base case or stop or termination
		if(n == 1)
		{
			return n;
		}
		
		//processing logic
		int sum = n + func(n - 1); // func(n - 1) - small problem
		
		//func(n - 1) : recursive call
		
		return sum;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		sum of digits: 3 = 1 + 2 + 3 = 6
		
		//Recursion: function calls itself 
		
		int k;
		k = func(3);
		
		System.out.println("Sum of digits: "+k);

	}

}
