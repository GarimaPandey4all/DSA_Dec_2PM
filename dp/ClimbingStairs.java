package com.brainmentors.dsa.dp;

public class ClimbingStairs {
	
	public static int countClimb(int n)
	{
		//Tabulation
		
		int arr[] = new int[n + 1];
		arr[1] = 1;
		arr[2] = 2;
		
		for(int i = 3; i <= n; i++)
		{
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		
		return arr[n];

		
//		if(n == 1 || n == 0)
//		{
//			return 1;
//		}
//		else if(n == 2)
//		{
//			return 2;
//		}
//		
//		else {
//			return countClimb(n - 1) + countClimb(n - 2);
//		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Recursive Approach
		
		int result = countClimb(4);
		System.out.println(result);

	}

}
