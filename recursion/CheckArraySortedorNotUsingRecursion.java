package com.brainmentors.dsa.recursion;

public class CheckArraySortedorNotUsingRecursion {
	
	public static boolean isSorted(int arr[], int index)
	{
		boolean result;
		
		if(arr.length - 1 == index)
		{
			return true;
		}
		if(arr[index] > arr[index + 1])
		{
			return false;
		}
		else {
			result = isSorted(arr, index + 1);
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1, 2, 0, 4};
		
		boolean result = isSorted(arr, 0);
		
		System.out.println(result);

	}

}
