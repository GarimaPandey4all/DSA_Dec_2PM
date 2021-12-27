package com.brainmentors.dsa.sorting;

public class SelectionSort {
	
	static void selectionSort(int arr[], int n)
	{
		for(int i = 0; i < n - 1; i++)
		{
			int min = i; // 0
			for(int j = i + 1; j < n; j++)
			{
				if(arr[j] < arr[min])
				{
					min = j; // 
				}
			}
			
			//swapping
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		
		//for each or enhanced loop
		for(int list : arr)
		{
			System.out.print(list + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {5, 4, 3, 2, 1};
		
		selectionSort(arr, arr.length);

	}

}
