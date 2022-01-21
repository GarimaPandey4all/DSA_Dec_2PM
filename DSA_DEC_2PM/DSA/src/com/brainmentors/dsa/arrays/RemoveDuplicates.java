package com.brainmentors.dsa.arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Remove Duplicates from the Sorted Array
		
		int arr[] = {0, 0, 1, 1, 1, 2, 2, 3, 4};
		
		int i = 0;
		for(int j = 1; j < arr.length; j++)
		{
			if(arr[j] != arr[i])
			{
				i++;
				arr[i] = arr[j];
			}
		}
		
		System.out.println("Output is: "+(i + 1));
		
		for(i = 0; i < 5; i++)
		{
			System.out.print(i+" ");
		}

	}

}
