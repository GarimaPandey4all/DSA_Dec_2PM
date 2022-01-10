package com.brainmentors.dsa.sorting;

public class QuickSort {
	
	public static void quickSort(int arr[], int first, int last)
	{
		int pivot, i, j, temp;
		
		if(first < last)
		{
			pivot = first;
			i = first;
			j = last;
			
			while(i < j)
			{
				while(arr[pivot] >= arr[i] && i < last)
				{
					i++;
				}
				
				while(arr[pivot] < arr[j])
				{
					j--;
				}
				
				if(i < j)
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
			//swapping of pivot value
			temp = arr[pivot];
			arr[pivot] = arr[j];
			arr[j] = temp;
			
			//left sub-array
			quickSort(arr, 0, j - 1);
			
			//right sub-array
			quickSort(arr, j + 1, last);
		}
	}
	
	public static void printArray(int arr[])
	{
		System.out.println("Quick Sorted Array:");
		for(int k : arr)
		{
			System.out.print(k+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {10, 3, 7, 5, 2};
		
		int n = arr.length;
		
		quickSort(arr, 0, n - 1);
		
		printArray(arr);

	}

}
