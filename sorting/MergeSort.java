package com.brainmentors.dsa.sorting;

public class MergeSort {
	
	public static void mergeSort(int arr[], int n)
	{
		int temp[] = new int[n];
		
		for(int size = 1; size < n; size = size * 2)
		{
			int l1 = 0;
			int k = 0; // index for temp array
			
			while(l1 + size < n) // 5 < 5, false
			{
				int h1 = l1 + size - 1; // 0, 2
				int l2 = h1 + 1; // 1, 3
				int h2 = l2 + size - 1; // 1, 3
				
				if(h2 >= n)
				{
					h2 = n - 1;
				}
				
				//merge two pairs
				int i = l1;
				int j = l2;
				
				//10, 3, 7, 5, 2
				
				//temp
				//3, 10, 5, 7, 2
				
				while(i <= h1 && j <= h2)
				{
					if(arr[i] <= arr[j])
					{
						temp[k++] = arr[i++];
					}
					else {
						temp[k++] = arr[j++];
					}
				}
				
				while(i <= h1)
				{
					temp[k++] = arr[i++];
				}
				
				while(j <= h2)
				{
					temp[k++] = arr[j++];
				}
				
				//merge completed
				
				l1 = h2 + 1;
			}
			
			//any pair left
			for(int i = l1; i < n; i++)
			{
				temp[k++] = arr[i];
			}
			
			for(int i = 0; i < n; i++)
			{
				arr[i] = temp[i];
			}
			
			System.out.println("\nSize of "+size+" elements are:");
			for(int i = 0; i < n; i++)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {10, 3, 7, 5, 2};
		
		mergeSort(arr, arr.length);

	}

}
