package com.brainmentors.dsa.arrays;

public class LeadersElement1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {14, 20, 3, 6, 5};
		int j;
		
//		T.C: O(n ^ 2)
		
		for(int i = 0; i < arr.length; i++)
		{
			for(j = i + 1; j < arr.length; j++)
			{
				if(arr[i] <= arr[j])
				{
					break;
				}
			}
			
			if(j == (arr.length)) {
				System.out.println("Leader Elements are: "+arr[i]);
			}
		}
	}
}
