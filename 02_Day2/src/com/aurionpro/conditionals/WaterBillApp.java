package com.aurionpro.conditionals;

import java.util.Scanner;

public class WaterBillApp {
	public static void main(String[] args) {
		Scanner inputVariable = new Scanner(System.in);

		System.out.print("Enter Total Number of Units consumed: ");
		int numberOfUnitsConsumed = inputVariable.nextInt();
		int meterCharge = 75;
		int charge = 0;

		if (numberOfUnitsConsumed <= 100) {
			charge = numberOfUnitsConsumed * 5;
		}

		else {
			if (numberOfUnitsConsumed <= 250) {
				charge = numberOfUnitsConsumed * 10;
			} else {
				charge = numberOfUnitsConsumed * 20;
			}
		}

		int TotalWaterBill = charge + meterCharge;

		System.out.println("Total Water Bill is Rs. " + TotalWaterBill);
	}
}
