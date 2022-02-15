package com.brainmentors.dsa.stack;

public class StackNextGreatestElement {
	
	public static void NGE(int arr[], int n)
	{
		for(int i = 0; i < n; i++)
		{
			int next = -1;
			
			for(int j = i + 1; j < n; j++)
			{
				if(arr[i] < arr[j])
				{
					next = arr[j];
					break;
				}
			}
			
			System.out.println(arr[i]+" "+next);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {11, 13, 21, 3};
//		o/p: 13, 21, -1, -1
		
		NGE(arr, arr.length);

	}

}
