package com.aurionpro.loops;

public class PrintEvenNumbersWhileLoop {
	public static void main(String[] args) {
		int i = 0;
		System.out.println("Even Numbers Printed using While Loop: ");
		while(i<=100)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
			i++;
		}
		
	}
}
