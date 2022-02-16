package com.brainmentors.dsa.bitmanipulation;

public class CountSetBits {
	
	public static int countSetBits(int n)
	{
		int count = 0;
		
		while(n > 0)
		{
//				1010 &
//				1001
//				1000 = 8
			n = n & (n - 1); // & - AND Bitwise Operator
			count++;
		}
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 10; // 1010 = 2
		
		System.out.println("Set Bit Count is: "+countSetBits(n));

	}

}
