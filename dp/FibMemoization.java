package com.brainmentors.dsa.dp;

public class FibMemoization {

	public static int fib(int n, int cache[])
	{
		// 0 1 1 2 3 5
		
		if(n == 0 || n == 1)
		{
			return n;
		}
		
		//Memoization
		if(cache[n] != 0)
		{
			return cache[n];
		}
		
		int first = fib(n - 1, cache);
		int second = fib(n - 2, cache);
		int sum = first + second;
		
		cache[n] = sum;	
		
		return cache[n];
	}
      
    public static void main (String args[])
    {
	    //top-down Memoization
    	
    	int n = 5;
    	
    	int cache[] = new int[n + 1];
    	
    	System.out.println(fib(n, cache));
    }

}
