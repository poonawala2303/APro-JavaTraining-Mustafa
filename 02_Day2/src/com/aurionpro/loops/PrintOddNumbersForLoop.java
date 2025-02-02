package com.aurionpro.loops;

public class PrintOddNumbersForLoop {
	public static void main(String[] args) {
		System.out.println("Odd Numbers Printed using For Loop: ");
		for (int i = 0; i<100 ; i++){
			if(!(i%2 == 0)){
				System.out.println(i);
			}
		}
	}
}
