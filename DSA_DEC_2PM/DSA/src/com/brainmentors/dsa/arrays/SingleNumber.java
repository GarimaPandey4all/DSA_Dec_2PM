package com.brainmentors.dsa.arrays;

public class SingleNumber {
	
	public static int singleNumber(int arr[])
	{
		int count = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
					count++;
				}
			}
			
			if((count % 2) != 0)
			{
				return arr[i];
			}
		}
		
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		single number: odd no of times occur in our array
		
		int arr[] = {1, 1, 1, 2, 2, 5, 5};
		
		int singleNumber = singleNumber(arr);
		
		System.out.println("Single Number is: "+singleNumber);

	}

}
