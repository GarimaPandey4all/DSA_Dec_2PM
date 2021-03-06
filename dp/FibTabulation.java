package com.brainmentors.dsa.dp;

public class FibTabulation {
	
	public static int fib(int n)
	{
		int cache[] = new int[n + 1];
		cache[0] = 0;
		cache[1] = 1;
		
		for(int i = 2; i <= n; i++)
		{
			cache[i] = cache[i - 1] + cache[i - 2];
		}
		
		return cache[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		
		System.out.println(fib(n));

	}

}
