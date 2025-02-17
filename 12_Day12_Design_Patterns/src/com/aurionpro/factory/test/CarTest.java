package com.aurionpro.factory.test;

import com.aurionpro.factory.model.Icar;
import com.aurionpro.factory.model.Mahindra;
import com.aurionpro.factory.model.Maruti;
import com.aurionpro.factory.model.Tata;

public class CarTest 
{
	public static void main(String[] args) 
	{
		Icar maruti = new Maruti();
		Icar mahindra = new Mahindra();
		Icar tata = new Tata();
		
		maruti.start();
		maruti.stop();
		
		System.out.println("");
		
		mahindra.start();
		mahindra.stop();
		
		System.out.println("");
		
		tata.start();
		tata.stop();
	}
}
