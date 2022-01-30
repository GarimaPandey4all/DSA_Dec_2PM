package com.brainmentors.dsa.arrays;

public class SmallerThanCurrentNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Q. How many numbers are larger than the current number - HW
//		Q. RotateMatrix 90 degree clockwise - HW
		
//		 1   2    3				7    4     1
//		 				=   
//		 4   5    6				8    5     2
//		 
//		 7   8    9				9    6     3

		int arr[] = {8, 1, 2, 2, 3};
//		o/p: {4, 0, 1, 1, 2};
		
		int count = 0;
		int index = 0;
		
		int output[] = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++, index++)
		{
			count = 0;
			
			for(int j = 0; j < arr.length; j++)
			{
				if(arr[i] > arr[j])
				{
					count++;
				}
			}
			
			output[index] = count;
		}
		
		System.out.println("Array");
		for(int i : output)
		{
			System.out.print(i+" ");
		}
		
	}

}
