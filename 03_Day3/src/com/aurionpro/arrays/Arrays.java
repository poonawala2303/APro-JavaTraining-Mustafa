package com.aurionpro.arrays;

public class Arrays {
	
	public static void main(String[] args) 
	{
		int[] array1 = new int[5];
		int array2[] = {1,2,3,4,5};
		
//		for (int i = 0 ; i< array2.length ; i++)
//		{
//			System.out.println(array2[i]);
//		}
		
		for (int num : array2)
		{
			System.out.println(num);
		}
		
	}
}
