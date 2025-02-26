package com.aurionpro.jdbc.test;

import com.aurionpro.jdbc.model.TransactionManagement;

public class TxnTest 
{
	public static void main(String[] args) 
	{
		TransactionManagement transaction = new TransactionManagement();
		transaction.connect();
	}
}
