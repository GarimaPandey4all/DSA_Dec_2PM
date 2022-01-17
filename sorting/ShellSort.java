package com.brainmentors.dsa.sorting;

public class ShellSort {
	
	public static void shellSort(int arr[], int n)
	{
		int s = n / 2;
		
		while(s > 0)
		{
			for(int i = s; i < n; i++)
			{
				for(int j = i - s; j >= 0; j = j - s)
				{
					if(arr[j] > arr[j + s])
					{
						int temp = arr[j];
						arr[j] = arr[j + s];
						arr[j + s] = temp;
					}
				}
			}
			
			s = s / 2;
		}
		
		for(int i : arr)
		{
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2, 8, 4, 3, 10};
		
		shellSort(arr, arr.length);
	
	}

}
