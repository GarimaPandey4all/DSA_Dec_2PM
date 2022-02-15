package com.brainmentors.dsa.arrays;

public class PairSum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2, 9, 6, 3, 1, 10, 4};
		int sum = 9;
		
		int hash[] = new int[100];
		
		for(int i = 0;  i < arr.length; i++)
		{
			int k = sum - arr[i];// 7, 0, 3, 6
			
			if(hash[k] == 1)
			{
				System.out.println("Pair Sum is: "+arr[i]+" "+k);
				break;
			}
			
			hash[arr[i]] = 1;
		}
	}

}
