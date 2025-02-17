package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.CreditCardPayment;
import com.aurionpro.model.DebitCardPayment;
import com.aurionpro.model.Payment;
import com.aurionpro.model.UpiPayment;

public class PaymentTest 
{
	public static void main(String[] args) 
	{
		Scanner inputVariable = new Scanner(System.in);
		Payment payment = null;
		
		while (true)
		{
            System.out.println("\nSelect Payment Method:");
            System.out.println("1. Credit Card");
            System.out.println("2. Debit Card");
            System.out.println("3. UPI");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = inputVariable.nextInt();
            
            if(choice ==4)
            {
            	System.out.println("Thank you");
            	break;
            }
            
            System.out.print("Enter amount to transfer: ");
            int amount = inputVariable.nextInt();
            
            switch(choice)
            {
            case 1:
            	payment = new CreditCardPayment();
				break;
            	
            case 2:
            	payment = new DebitCardPayment();
				break;
            	
            case 3:
            	payment = new UpiPayment();
				break;
         
            }
            
            payment.processPayment(amount);
		}
	}
}
