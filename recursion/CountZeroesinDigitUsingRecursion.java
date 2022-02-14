package com.brainmentors.dsa.recursion;

public class CountZeroesinDigitUsingRecursion {
	
	public static int zeroCount(int digit, int c)
	{
		if(digit == 0)
		{
			return c;
		}
		if(digit % 10 == 0)
		{
			c++;
		}
		
		return zeroCount(digit/10, c);
	}
	
	public static void main(String[] args) {
		
		System.out.println(zeroCount(100200, 0));
		
	}

}
